package ar.com.codoacodo.entity;

public class Orador {
	//atributos: encapsulamiento
	private Long id;
	private String nombre;
	private String apellido;
	private String mail;
	private String tema;
	
	//constructor/es
	//usar cuando voy a enviar un objeto a la db
	//insert into orador (campos,..) values(...)
	public Orador(String nombre, String apellido, String mail, String tema) {
		init(nombre, apellido, mail, tema);
		//alt+shit+m
	}
	//alt+shit+s

	public Orador(Long id, String nombre, String apellido, String mail, String tema) {
		this.id = id;
		init(nombre, apellido, mail, tema);
	}
	
	private void init(String nombre, String apellido, String mail, String tema) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.tema = tema;
	}

	//otra forma de polimorfismo: SOBREESCRITURA, un metodo que existe en una clase base (java.lang.Object) 
	// pero su hijo (Orador) la cambia
	public String toString() {
		return "Orador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", tema="
				+ tema + "]";
	}	
	
	//cambiar un metodo llamado toString() de la clase Object para ver mas lindo en la consola los atributos
	//del objeto
	//alt+shit+s
	
	//getters/setters
	public Long getId() {
		return this.id;
	}
	/*
	public void setId(Long id) {
		this.id = id;
	}
	*/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre != null) { 
			this.nombre = nombre;
		}else {
			this.nombre = "N/D";
		}
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	///ALT+shit+s
	
}
