package Singleton;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;
import org.hibernate.cfg.Configuration;

import Entity.Profesor;
import Entity.Student;
import Entity.Utilizatori;

public class Singleton {
	private static Singleton singleton = null;
	public SessionFactory sessionFactory;

	
	//User lists
	public List<Student> ListOfStudents;
	public List<Profesor> ListOfTeachers;
	public List<Utilizatori> ListOfAccounts;
	
	
	private Singleton(){
		initSingleton();
	}
	
	public static Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
	
	public void initSingleton(){
		buildSessionFactory();
	}
	
	public void buildSessionFactory(){
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		sessionFactory = conf.buildSessionFactory();
	}
	
	public Session getCurrentSession(){
		if(sessionFactory.getCurrentSession() == null){
			return getNewSession();
		}
		return sessionFactory.getCurrentSession();
	}
	
	public StatelessSession getStatelessSession(){		
		return sessionFactory.openStatelessSession();
	}
	
	public Session getNewSession(){
		return sessionFactory.openSession();
	}
	
}
