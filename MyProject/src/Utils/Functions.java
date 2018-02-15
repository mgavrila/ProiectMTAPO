package Utils;

import org.hibernate.Session;

import Singleton.Singleton;

public class Functions {

	public static boolean stringIsNullOrEmpty(String s){
		if(s == null){
			return true;
		}else{
			if(s.equals("")){
				return true;
			}
		}
		return false;
	}
	
	public static boolean resetSequence(String seqName){
		boolean done = false;
		Session session = null;
		try{
			session = Singleton.getInstance().getNewSession();
			session.beginTransaction();
			session.createSQLQuery("DROP SEQUENCE "+ seqName).executeUpdate();
			session.createSQLQuery("CREATE SEQUENCE "+ seqName + " START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE").executeUpdate();
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();    
		}finally{
			session.close();
		}
		return done;
	}
}
