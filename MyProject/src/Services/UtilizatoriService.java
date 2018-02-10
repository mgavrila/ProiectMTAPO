package Services;

import java.math.BigDecimal;

import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import Entity.Utilizatori;
import Singleton.Singleton;
import Utils.Functions;

public class UtilizatoriService 
{
	public static void main(String[] args)
	{
		//addUtilizator("cm105", "faraparola1", 0);
		//getUtilizatorByID(1);
		//getUtilizatorByUsername("cm105");
		
	}
	
	
	
	public static Utilizatori getUtilizatorByID(int id)
	{
		Utilizatori utilizator = null;
		Session session = null;
		try
		{			
			session = Singleton.getInstance().getNewSession();			
			utilizator = session.get(Utilizatori.class,new BigDecimal(id));
			System.out.println("utilizatorul cautat este: "+utilizator);
		}
		catch (Exception e) 
		{
            e.printStackTrace();
        }
		finally 
		{ 
        	session.close();
        }
		return utilizator;
		
	}
	
	public static Utilizatori getUtilizatorByUsername(String username)
	{
		Utilizatori utilizator = null;
		Session session = null;
		try{			
			session = Singleton.getInstance().getNewSession();			
			DetachedCriteria dc = DetachedCriteria.forClass(Utilizatori.class).add(Restrictions.eq("username" , username));
			utilizator = (Utilizatori)dc.getExecutableCriteria(session).uniqueResult();
			System.out.println("utilizatorul cautat dupa username este: "+utilizator);
		}
		catch (Exception e) 
		{
            e.printStackTrace();
        }
		finally 
		{ 
        	session.close();
        }
		return utilizator;
		
	}
	
	public static boolean addUtilizator(String username, String password,int nivel_acces){
		boolean done = false;
		Session session = null;
		Utilizatori utilizator;
		try
		{
			session = Singleton.getInstance().getNewSession();
			session.beginTransaction();
			if(Functions.stringIsNullOrEmpty(password))
			{
				utilizator = new Utilizatori(username,password,nivel_acces);
				System.out.println("asd");
			}
			else
			{
				utilizator = new Utilizatori(username,EncryptService.getHashOfString(password),nivel_acces);
				System.out.println("sadasf");
			}
			session.save(utilizator);
			session.getTransaction().commit();
			done = true;
		}
		catch (Exception e) 
		{
            e.printStackTrace();           
        } finally 
		{ 
        	session.close();
        }
		return done;
	}

}
