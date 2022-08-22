package model;


public class Persona {

  private String nombre;
  private String apellidos;
  private String identificacion;
  private String direccion;
  private String telefono;
  private String identificacionTributaria;
  private String nit;
  private String email;
  private String fechaNaci;
  
 
public Persona() {
	// TODO Auto-generated constructor stub
}


public Persona(String nombre, String apellidos, String identificacion, String direccion, String telefono,
		String identificacionTributaria, String nit, String email, String fechaNaci) {
	super();
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.identificacion = identificacion;
	this.direccion = direccion;
	this.telefono = telefono;
	this.identificacionTributaria = identificacionTributaria;
	this.nit = nit;
	this.email = email;
	this.fechaNaci = fechaNaci;
}




//getters and setters
  public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getIdentificacionTributaria() {
		return identificacionTributaria;
	}



	public void setIdentificacionTributaria(String identificacionTributaria) {
		this.identificacionTributaria = identificacionTributaria;
	}



	public String getNit() {
		return nit;
	}



	public void setNit(String nit) {
		this.nit = nit;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getFechaNaci() {
		return fechaNaci;
	}



	public void setFechaNaci(String fechaNaci) {
		this.fechaNaci = fechaNaci;
	}
	
	
	
  
}
