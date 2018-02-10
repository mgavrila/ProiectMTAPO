package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Profesor")
public class Profesor {
	
	@Id
	@GenericGenerator(name="gen",strategy="increment")
	@GeneratedValue(generator="gen")
	@Column(name="id_profesor")
	private int id_profesor;
	
	@Column(name="nume_profesor")
	private String nume_profesor;
	
	
	
	public Profesor()
	{
		
	}
	
	
	public Profesor(String nume_profesor) {
		this.nume_profesor = nume_profesor;
		
	}



	public int getId_profesor() {
		return id_profesor;
	}
	

	public void setId_profesor(int id_profesor) {
		this.id_profesor = id_profesor;
	}



	public void setNume_profesor(String nume_profesor) {
		this.nume_profesor = nume_profesor;
	}
	
	public String getNume_profesor() {
		return nume_profesor;
	}



	@Override
	public String toString() {
		return "Profesor [id_profesor=" + id_profesor + ", nume_profesor=" + nume_profesor + "]";
	}
	
	

}
