package Services;

import java.util.List;

import org.hibernate.Session;

import Entity.Profesor;
import Singleton.Singleton;

public class ProfesorService {
	
	public static void main(String[] args)
	{
		//addProfesor("Dumitriu A Luminita");
		//deleteAllFromTable();
		//getAllFromProfesor();
		//deleteProfesorByID(1);
		
		String x = "Albu I. Eduard Gabriel  ";
		if(x != null){
			String[] split = x.split(" ");
			String username = split[2].charAt(0) + split[0];
			System.out.println(username);		
	}
	}

	
	public static Profesor getProfesorByID(int id){
		Profesor profesor = null;
		Session session = null;
		try{			
			session = Singleton.getInstance().getNewSession();			
			profesor = session.get(Profesor.class,new Integer(id));
			System.out.println("Profesorul cautat este: "+profesor);
		}catch (Exception e) {
            e.printStackTrace();
        }finally { 
        	session.close();
        }
		return profesor;
		
	}
	
	public static boolean addProfesor(String nume){
		boolean done = false;
		Session session = null;
		try{
			session = Singleton.getInstance().getNewSession();
			session.beginTransaction();
			Profesor profesor = new Profesor(nume);
			session.save(profesor);
			session.getTransaction().commit();
			done = true;
			System.out.println("Profesor adaugat: "+profesor);
		}catch (Exception e) {
            e.printStackTrace();           
        } finally { 
        	session.close();
        }
		return done;
	}
	
	public static boolean deleteProfesorByID(int id){
		boolean done = false;
		Profesor profesor = getProfesorByID(id);
		Session session = null;
		if( profesor != null){
			try{
				session = Singleton.getInstance().getNewSession();
				session.beginTransaction();
				session.delete(profesor);
				session.getTransaction().commit();
				done = true;
				System.out.println("Profesorul sters dupa id este: "+profesor);
			}catch (Exception e) {
	            e.printStackTrace();           
	        }finally { 
	        	session.close();
	        } 
		}
		return done;
	}
	
	public static List<Profesor> getAllFromProfesor(){
		List<Profesor> list = null;
		Session session = null;
		try{
			session = Singleton.getInstance().getNewSession();
			list = session.createQuery("from Profesor").getResultList();
			session.close();
			System.out.println("Lista cu profesori este: "+list);
		}catch (Exception e) {
            e.printStackTrace();        
        }finally{
        	session.close();
        }
		return list;
	}
	
	public static Profesor getProfesorByNume(String nume) {
		Profesor profesor = null;
		Session session = null;
		try{
			session = Singleton.getInstance().getNewSession();
			profesor = (Profesor) session.createQuery("from Profesor where nume_profesor = '" + nume + "'").getResultList().get(0);
			session.close();
			System.out.println("Profesorul cautat dupa nume este: "+profesor);
		}catch (Exception e) {
            e.printStackTrace();        
        }finally{
        	session.close();
        }
		return profesor;
	}
	
	public static boolean deleteAllFromTable(){
		boolean done = false;
		Session session = null;
			try{
				session = Singleton.getInstance().getNewSession();
				session.beginTransaction();
				session.createQuery("delete from Profesor where id_profesor <> 0").executeUpdate();
				session.getTransaction().commit();
				done = true;
				System.out.println("Stergere profesori reusita!");
			}catch (Exception e) {
	            e.printStackTrace();           
	        } finally { 
	        	session.close();
	        }
		return done;
	}

}
