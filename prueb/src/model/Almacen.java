package model;

import java.util.ArrayList;

public class Almacen {

	private String nombre;
	private String nit;
	ArrayList<Persona> listaClientes = new ArrayList<>( );
	ArrayList<Producto> listaProductos = new ArrayList<>( );

	//constructor
	public Almacen() {
		// TODO Auto-generated constructor stub
	}


	public Almacen(String nombre, String nit) {
		this.nombre = nombre;
		this.nit = nit;
		inicializarDatos();


	}





	//get and set
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public ArrayList<Persona> getListaClientes() {
		return listaClientes;
	}


	public void setListaClientes(ArrayList<Persona> listaClientes) {
		this.listaClientes = listaClientes;
	}


	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}


	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}


	private void inicializarDatos() {

		//Persona
		Persona persona = new Persona();

		persona.setNombre("luisa");
		persona.setApellidos("camacho");
		persona.setIdentificacion("10004568941");
		persona.setDireccion("carrera 20 #34-20");
		persona.setTelefono("3215064121");
		persona.setIdentificacionTributaria("");
		persona.setNit("");
		persona.setEmail("luisa4567@gmail.com");
		persona.setFechaNaci("24/08/2000");

		getListaClientes().add(persona);

		persona = new Persona();
		persona.setNombre("laura");
		persona.setApellidos("perez");
		persona.setIdentificacion("1001094581");
		persona.setDireccion("Manzana 8 casa 23");
		persona.setTelefono("3105427845");
		persona.setIdentificacionTributaria("14545845842");
		persona.setNit("145000420-1");
		persona.setEmail("");
		persona.setFechaNaci("");

		getListaClientes().add(persona);

		persona = new Persona();
		persona.setNombre("Maria");
		persona.setApellidos("Londoño");
		persona.setIdentificacion("52469825");
		persona.setDireccion("carrera 29 #34-20");
		persona.setTelefono("5452145");
		persona.setIdentificacionTributaria("");
		persona.setNit("");
		persona.setEmail("mariaL@hotmail.com");
		persona.setFechaNaci("14/01/1197");
		getListaClientes().add(persona);

		//producto 
		Producto producto =new Producto ();

		producto.setCodigo("2120");
		producto.setDescripcion("Leche");
		producto.setValorUnitario(4500.00);
		producto.setCantidadExistente(50);
		producto.setFechaVencimiento("2/02/2024");
		producto.setCodigoAprobacion("");
		producto.setTemperaturaRecomendada("");
		producto.setFechaEnvasado("");
		producto.setPeso("");
		producto.setPaisOrigen("");
		getListaProductos().add(producto);

		producto=new Producto();
		producto.setCodigo("4002");
		producto.setDescripcion("Aceite");
		producto.setValorUnitario(5200.00);
		producto.setCantidadExistente(50);
		producto.setFechaVencimiento("");
		producto.setCodigoAprobacion("");
		producto.setTemperaturaRecomendada("");
		producto.setFechaEnvasado("23/07/2022");
		producto.setPeso("1L");
		producto.setPaisOrigen("Colombia");
		getListaProductos().add(producto);

		producto=new Producto();
		producto.setCodigo("1254");
		producto.setDescripcion("Carne");
		producto.setValorUnitario(2.500);
		producto.setCantidadExistente(60);
		producto.setFechaVencimiento("");
		producto.setCodigoAprobacion("4511523243");
		producto.setTemperaturaRecomendada("1 a 7 C");
		producto.setFechaEnvasado("");
		producto.setPeso("");
		producto.setPaisOrigen("");
		getListaProductos().add(producto);



	}


	@Override
	public String toString() {
		return "Almacen [nombre=" + nombre + ", nit=" + nit +"]";
	}

	//registro cliente 
	public Persona crearCliente(String nombre, String apellidos, String identificacion, String direccion,
			String telefono, String identificacionTributaria, String nit, String email,String fechaNaci) {

		Persona persona = null;
		persona= obtenerCliente(identificacion);
		// verificar si el cliente existe o no
		if(persona==null) {

			persona= new Persona();
			persona.setNombre(nombre);
			persona.setApellidos(apellidos);
			persona.setIdentificacion(identificacion);
			persona.setDireccion(direccion);
			persona.setTelefono(telefono);
			persona.setIdentificacionTributaria(identificacionTributaria);
			persona.setNit(nit);
			persona.setEmail(email);
			persona.setFechaNaci(fechaNaci);
			getListaClientes().add(persona);		
			return persona;
		}

		return null;

	}



	private Persona obtenerCliente(String identificacion) {
		// TODO Auto-generated method stub

		for (Persona persona : listaClientes) {
			if(persona.getIdentificacion().equals(identificacion)) {

				return persona;
			}
		}

		return null;
	}


	public boolean eliminarCliente(String identificacion) {
		Persona persona = null;
		persona= obtenerCliente(identificacion);
		if(persona!=null) {
			getListaClientes().remove(persona);
			return true;
		}
		else {
			return false;	
		}

	}


	public boolean actualizarCliente(String identificacionActual, String nombre, String apellidos,
			String identificacion, String direccion, String telefono, String identificacionTributaria, String nit,
			String email, String fechaNaci) {

		Persona persona = null;
		persona= obtenerCliente(identificacionActual);

		if(persona!=null) {

			persona.setNombre(nombre);
			persona.setApellidos(apellidos);
			persona.setIdentificacion(identificacion);
			persona.setDireccion(direccion);
			persona.setTelefono(telefono);
			persona.setIdentificacionTributaria(identificacionTributaria);
			persona.setNit(nit);
			persona.setEmail(email);
			persona.setFechaNaci(fechaNaci);
			return true;
		}
		else {
			return false;	
		}

	}

	//producto

	public Producto crearProducto(String codigo, String descripcion, Double valorUnitario, int cantidadExistente,
			String fechaVencimiento, String codigoAprobacion,
			String temperaturaRecomendada,String fechaEnvasado, String peso, String paisOrigen) {


		Producto producto=null;
		producto= obtenerProducto(codigo);
		// verificar si el producto existe o no

		if(producto==null) {

			producto= new Producto();
			producto.setCodigo(codigo);
			producto.setDescripcion(descripcion);
			producto.setValorUnitario(valorUnitario);
			producto.setCantidadExistente(cantidadExistente);
			producto.setFechaVencimiento(fechaVencimiento);
			producto.setCodigoAprobacion(codigoAprobacion);
			producto.setTemperaturaRecomendada(temperaturaRecomendada);
			producto.setFechaEnvasado(fechaEnvasado);
			producto.setPeso(peso);
			producto.setPaisOrigen(paisOrigen);
			getListaProductos().add(producto);		
			return producto;
		}

		return null;

	}


	private Producto obtenerProducto(String codigo) {

		for (Producto producto : listaProductos) {
			if(producto.getCodigo().equals(codigo)) {

				return producto;
			}
		}

		return null;
	}


	public boolean eliminarProducto(String codigo) {
		Producto producto = null;
		producto= obtenerProducto(codigo);
		if(producto!=null) {
			getListaProductos().remove(producto);
			return true;
		}
		else {
			return false;	
		}

	}


	public boolean actualizarProducto(String codigoActual, String codigo, String descripcion, Double valorUnitario,
			int cantidadExistente, String fechaVencimiento, String codigoAprobacion, String temperaturaRecomendada,
			String fechaEnvasado, String peso, String paisOrigen) {

		Producto producto=null;
		producto= obtenerProducto(codigoActual);
		// verificar si el producto existe o no

		if(producto!=null) {

			producto.setCodigo(codigo);
			producto.setDescripcion(descripcion);
			producto.setValorUnitario(valorUnitario);
			producto.setCantidadExistente(cantidadExistente);
			producto.setFechaVencimiento(fechaVencimiento);
			producto.setCodigoAprobacion(codigoAprobacion);
			producto.setTemperaturaRecomendada(temperaturaRecomendada);
			producto.setFechaEnvasado(fechaEnvasado);
			producto.setPeso(peso);
			producto.setPaisOrigen(paisOrigen);

			return true;
		}
		else {
			return false;	
		}

	}	

}




