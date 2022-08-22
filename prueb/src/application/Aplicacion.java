package application;
import java.io.IOException;
import java.util.ArrayList;

import controller.AlmacenController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Almacen;
import model.Persona;
import model.Producto;


public class Aplicacion extends Application {

	private Stage primaryStage;
	Almacen almacen = new Almacen ("luisa","455-844");


	@Override
	public void start (Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle(" SUPERMERCADO JUANITA         ");
		mostrarVentanaPrincipal();

	}



	private void mostrarVentanaPrincipal() {




		try {
			FXMLLoader loader= new FXMLLoader ();
			loader.setLocation(Aplicacion.class.getResource("/viem/AlmacenVista.fxml"));


			AnchorPane rootLayout = (AnchorPane) loader.load();
			AlmacenController almacenController = loader.getController();
			almacenController.setAplicacion(this);
			Scene scene = new Scene (rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}


	public static void main(String[] args) {
		launch();
	}


	public ArrayList<Persona> obtenerClientes() {

		return almacen.getListaClientes();
	}



	public Persona crearCliente(String nombre, String apellidos, String identificacion, String direccion,
			String telefono,String identificacionTributaria,String nit,String email, String fechaNaci) {
		Persona persona = null;

		persona=almacen.crearCliente(nombre, apellidos, identificacion, direccion,telefono, identificacionTributaria,nit, email, fechaNaci);

		return persona;
	}



	public boolean eliminarCliente(String identificacion) {
		// TODO Auto-generated method stub
		return almacen.eliminarCliente(identificacion);
	}



	public boolean actualizarCliente(String identificacionActual, String nombre, String apellidos, String identificacion,
			String direccion, String telefono, String identificacionTributaria, String nit, String email,
			String fechaNaci) {

		return almacen.actualizarCliente(identificacionActual,  nombre,  apellidos, identificacion,
				direccion,  telefono, identificacionTributaria,  nit,  email, fechaNaci);
	}


	// producto
	public ArrayList<Producto> obtenerProducto() {
		return almacen.getListaProductos();
	}



	public Producto crearProducto(String codigo, String descripcion, double valorUnitario,int cantidadExistente,
			String fechaVencimiento, String codigoAprobacion, String temperaturaRecomendada, String fechaEnvasado,
			String peso, String paisOrigen) {
		Producto producto = null;

		producto=almacen.crearProducto(codigo, descripcion, Double.valueOf(valorUnitario), Integer.valueOf(cantidadExistente),fechaVencimiento, codigoAprobacion, temperaturaRecomendada,fechaEnvasado, peso, paisOrigen);

		return producto;
	}



	public boolean eliminarProducto(String codigo) {
		// TODO Auto-generated method stub
		return almacen.eliminarProducto(codigo);
	}



	public boolean actualizarProducto(String codigoActual, String codigo, String descripcion, Double valorUnitario,
			int cantidadExistente, String fechaVencimiento, String codigoAprobacion, String temperaturaRecomendada,
			String fechaEnvasado, String peso, String paisOrigen) {

		return almacen.actualizarProducto( codigoActual, codigo,descripcion,  valorUnitario,
				cantidadExistente,fechaVencimiento, codigoAprobacion, temperaturaRecomendada,
				fechaEnvasado, peso, paisOrigen);
	}





}