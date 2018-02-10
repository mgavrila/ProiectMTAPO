package Services;



import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Session;
import Entity.*;
import Singleton.Singleton;

public class StudentService {
	public static void main(String[] args)
	{
		//addStudent("Ion A. Ghidon", 123456789012L, 1);
		//getStudentById(1);
		//deleteStudentById(3);
		//getAllFromStudent();
		//getStudentByNume("Ion");
		//deleteAllFromTable();
	}
	
	
	public static Student getStudentById(int id)
	{
		Student student = null;
		Session session = null;
		try
		{
			session = Singleton.getInstance().getNewSession();
			student = session.get(Student.class, new BigDecimal(id));
			System.out.println("Studentul cautat este: "+student);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		
		return student;
	}
	
	public static boolean deleteStudentById(int id)
	{
		boolean done = false;
		Student student = getStudentById(id);
		Session session = null;
		if(student != null)
		{
			try
			{
				session = session = Singleton.getInstance().getNewSession();
				session.beginTransaction();
				session.delete(student);
				session.getTransaction().commit();
				done = true;
				System.out.println("Student sters");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				session.close();
			}
		}
		return done;
	}
	
	public static boolean addStudent(String nume, int an_studiu){
		boolean done = false;
		Session session = null;
		try{
			session = Singleton.getInstance().getNewSession();
			session.beginTransaction();
			Student student = new Student(nume,an_studiu);
			session.save(student);
			session.getTransaction().commit();
			done = true;
			System.out.println("Student adaugat");
		}catch (Exception e) {
            e.printStackTrace();           
        } finally { 
        	session.close();
        }
		return done;
	}
	
	public static List<Student> getAllFromStudent(){
		List<Student> list = null;
		Session session = null;
		try{
			session = Singleton.getInstance().getNewSession();
			list = session.createQuery("from Student").getResultList();
			session.close();
			System.out.println("Lista cu toti stundetii: " +list);
		}catch (Exception e) {
            e.printStackTrace();        
        }finally{
        	session.close();
        }
		return list;
	}
	
	public static Student getStudentByNume(String nume) {
		Student student = null;
		Session session = null;
		try{
			session = Singleton.getInstance().getNewSession();
			student = (Student) session.createQuery("from Student where nume_student = '" + nume + "'").getResultList().get(0);
			session.close();
			System.out.println("Detalii student: "+ student);
		}catch (Exception e) {
            e.printStackTrace();        
        }finally{
        	session.close();
        }
		return student;
	}
	
	public static boolean deleteAllFromTable(){
		boolean done = false;
		Session session = null;
			try{
				session = Singleton.getInstance().getNewSession();
				session.beginTransaction();
				session.createQuery("delete from Student").executeUpdate();
				session.getTransaction().commit();
				done = true;
				System.out.println("Stergere completa!");
			}catch (Exception e) {
	            e.printStackTrace();           
	        } finally { 
	        	session.close();
	        }
		
		return done;
	}
		
	
}
