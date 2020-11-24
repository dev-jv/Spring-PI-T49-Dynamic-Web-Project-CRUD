package coentity;

import javax.persistence.*;

@Entity
@Table(name="clientsv")
public class Client {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Client() {
	}
	
	@Override
	public String toString() {
		return "Client [id=" + id + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Email=" + Email + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	
	@Column(name="Nombre")
	private String Nombre;
	
	@Column(name="Apellidos")
	private String Apellido;
	
	@Column(name="Email")
	private String Email;
			
}


