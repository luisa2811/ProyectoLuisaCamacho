package controller;
import application.Aplicacion;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Persona;
import model.Producto;


public class AlmacenController {

	Aplicacion aplicacion;
	ObservableList<Persona> listaClientesData = FXCollections.observableArrayList();
	ObservableList<Producto> listaProductosData = FXCollections.observableArrayList();
	Persona personaSeleccionada;
	Producto productoSeleccionado;




	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Button bntActualizarPersona;

	@FXML
	private Button btnActualizarProducto;

	@FXML
	private Button btnAgregarPersona;

	@FXML
	private Button btnAgregarProducto;

	@FXML
	private Button btnEliminarPersona;

	@FXML
	private Button btnEliminarProducto;

	@FXML
	private Button btnNuevoPersona;

	@FXML
	private Button btnNuevoProducto;
	@FXML
	private TableColumn<Persona, String> columApellido;

	@FXML
	private TableColumn<Persona, String> columDireccion;

	@FXML
	private TableColumn<Persona, String> columEmail;

	@FXML
	private TableColumn<Persona, String> columFechaNaci;

	@FXML
	private TableColumn<Persona, String> columIdTributario;

	@FXML
	private TableColumn<Persona, String> columNit;

	@FXML
	private TableColumn<Persona, String> columIdentificacion;

	@FXML
	private TableColumn<Persona, String> columNombre;

	@FXML
	private TableColumn<Persona,String> columTelefono;

	@FXML
	private RadioButton rbJuridica;

	@FXML
	private RadioButton rbNatural;

	@FXML
	private TableView<Persona> tablaPersona;

	@FXML
	private TextField txtApellidoPersona;

	@FXML
	private TextField txtDireccionPersona;

	@FXML
	private TextField txtEmailPersona;

	@FXML
	private TextField txtFNacimientoPersona;

	@FXML
	private TextField txtIdTributariaPersona;

	@FXML
	private TextField txtIdentificacionPersona;

	@FXML
	private TextField txtNitPersona;

	@FXML
	private TextField txtNombrePersona;

	@FXML
	private TextField txtTelefonoPersona;

	@FXML
	private ToggleGroup tipoPersona;


	//Producto 

	@FXML
	private TableColumn<Producto, String> columCantidadProducto;

	@FXML
	private TableColumn<Producto, String> columCodigoAproProducto;

	@FXML
	private TableColumn<Producto, String> columCodigoProducto;

	@FXML
	private TableColumn<Producto, String> columDescripcionProducto;
	@FXML
	private TableColumn<Producto, String> columFechaEnvaProducto;

	@FXML
	private TableColumn<Producto, String> columFechaVenProducto;

	@FXML
	private TableColumn<Producto, String> columPaisProducto;

	@FXML
	private TableColumn<Producto, String> columPesoProducto;

	@FXML
	private TableColumn<Producto, String> columTempProducto;

	@FXML
	private TableColumn<Producto, String> columValorUProducto;

	@FXML
	private RadioButton rbEnvasados;

	@FXML
	private RadioButton rbPerecedero;

	@FXML
	private RadioButton rbRefrigerados;

	@FXML
	private TableView<Producto> tablaProducto;


	@FXML
	private ToggleGroup tipoProducto;


	@FXML
	private TextField txtCantidadExistente;

	@FXML
	private TextField txtCodigoAproba;

	@FXML
	private TextField txtCodigoProducto;

	@FXML
	private TextField txtDescripcionProducto;

	@FXML
	private TextField txtFechaEnvase;

	@FXML
	private TextField txtFechaVenci;

	@FXML
	private TextField txtPaisOrigen;

	@FXML
	private TextField txtPeso;

	@FXML
	private TextField txtTemperatura;

	@FXML
	private TextField txtValorU;




	@FXML
	void initialize ( ) {

		//persona
		this.columNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));// enlazar los componentes con el modelo
		this.columApellido.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
		this.columIdentificacion.setCellValueFactory(new PropertyValueFactory<>("identificacion"));
		this.columDireccion.setCellValueFactory(new PropertyValueFactory <>("direccion"));;
		this.columTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
		this.columIdTributario.setCellValueFactory(new PropertyValueFactory<>("identificacionTributaria"));
		this.columNit.setCellValueFactory(new PropertyValueFactory<>("nit"));
		this.columEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
		this.columFechaNaci.setCellValueFactory(new PropertyValueFactory<>("fechaNaci"));


		tablaPersona.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {

			personaSeleccionada= (Persona) newSelection;
			mostrarInformacionPersona(personaSeleccionada);
		});

		//producto
		this.columCodigoProducto.setCellValueFactory(new PropertyValueFactory<>("codigo"));// enlazar los componentes con el modelo
		this.columDescripcionProducto.setCellValueFactory(new PropertyValueFactory<>("descripcion"));
		this.columValorUProducto.setCellValueFactory(new PropertyValueFactory<>("valorUnitario"));
		this.columCantidadProducto.setCellValueFactory(new PropertyValueFactory <>("cantidadExistente"));;
		this.columFechaVenProducto.setCellValueFactory(new PropertyValueFactory<>("fechaVencimiento"));
		this.columCodigoAproProducto.setCellValueFactory(new PropertyValueFactory<>("codigoAprobacion"));
		this.columTempProducto.setCellValueFactory(new PropertyValueFactory<>("temperaturaRecomendada"));
		this.columFechaEnvaProducto.setCellValueFactory(new PropertyValueFactory<>("fechaEnvasado"));
		this.columPesoProducto.setCellValueFactory(new PropertyValueFactory<>("peso"));
		this.columPaisProducto.setCellValueFactory(new PropertyValueFactory<>("paisOrigen"));


		tablaProducto.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {

			productoSeleccionado= (Producto) newSelection;
			mostrarInformacionProducto(productoSeleccionado);
		});




	}


	@FXML
	void ActualizarPersonaAction(ActionEvent event) {
		actualizarCliente();
	}



	@FXML
	void AgregarPersonaAction(ActionEvent event) {
		agregarCliente();

	}


	@FXML
	void EliminarPersonaAction(ActionEvent event) {

		eliminarCliente();
	}


	@FXML
	void NuevoPersonaAction(ActionEvent event) {
		nuevoCliente();
	}


	@FXML
	void getTipoPersonaEvent(ActionEvent event) {
		if (rbJuridica.isSelected()) {
			txtEmailPersona.setDisable(true);
			txtFNacimientoPersona.setDisable(true);
		}
		else {
			txtEmailPersona.setDisable(false);
			txtFNacimientoPersona.setDisable(false);
		}
		if (rbNatural.isSelected()) {
			txtIdTributariaPersona.setDisable(true);
			txtNitPersona.setDisable(true);
		}
		else {
			txtIdTributariaPersona.setDisable(false);
			txtNitPersona.setDisable(false);
		}


	}


	@FXML
	void actualizarProductoAction(ActionEvent event) {
		actualizarProducto();
	}


	@FXML
	void agregarProductoAction(ActionEvent event) {
		agregarProducto();
	}

	@FXML
	void eliminarProductoEvent(ActionEvent event) {
		eliminarProducto();
	}






	@FXML
	void getTipoProductoEvent(ActionEvent event) {

		if (rbRefrigerados.isSelected()) {
			txtFechaEnvase.setDisable(true);
			txtPeso.setDisable(true);
			txtPaisOrigen.setDisable(true);
			txtFechaVenci.setDisable(true);
		}
		else {
			txtFechaEnvase.setDisable(false);
			txtPeso.setDisable(false);
			txtPaisOrigen.setDisable(false);
			txtFechaVenci.setDisable(false); 





		}
		if (rbEnvasados.isSelected()) {
			txtFechaVenci.setDisable(true);
			txtCodigoAproba .setDisable(true);
			txtTemperatura.setDisable(true);

		}
		else{

			txtCodigoAproba .setDisable(false);
			txtTemperatura.setDisable(false);

		}


		if (rbPerecedero.isSelected()) {
			txtCodigoAproba .setDisable(true);
			txtTemperatura.setDisable(true);
			txtFechaEnvase.setDisable(true);
			txtPeso.setDisable(true);
			txtPaisOrigen.setDisable(true);
		}



	}


	@FXML
	void nuevoProductoAction(ActionEvent event) {
		nuevoProducto();
	}



	private void mostrarInformacionPersona(Persona personaSeleccionada) {

		if(personaSeleccionada!= null) {
			txtNombrePersona.setText(personaSeleccionada.getNombre());
			txtApellidoPersona.setText(personaSeleccionada.getApellidos());
			txtIdentificacionPersona.setText(personaSeleccionada.getIdentificacion());
			txtDireccionPersona.setText(personaSeleccionada.getDireccion());
			txtTelefonoPersona.setText(personaSeleccionada.getTelefono());
			txtIdTributariaPersona.setText(personaSeleccionada.getIdentificacionTributaria());
			txtEmailPersona.setText(personaSeleccionada.getEmail());
			txtFNacimientoPersona.setText(personaSeleccionada.getFechaNaci());
			txtNitPersona.setText(personaSeleccionada.getNit());

		}

	}

	private void nuevoCliente() {
		txtNombrePersona.setText("");
		txtApellidoPersona.setText("");
		txtIdentificacionPersona.setText("");
		txtDireccionPersona.setText("");
		txtTelefonoPersona.setText("");
		txtIdTributariaPersona.setText("");
		txtEmailPersona.setText("");
		txtFNacimientoPersona.setText("");
		txtNitPersona.setText("");
		rbJuridica.setSelected(false);
		rbNatural.setSelected(false);
		txtEmailPersona.setDisable(true);
		txtFNacimientoPersona.setDisable(true);
		txtIdTributariaPersona.setDisable(true);
		txtNitPersona.setDisable(true);



	}


	private void agregarCliente() {



		String nombre = txtNombrePersona.getText();
		String apellidos = txtApellidoPersona.getText();
		String identificacion = txtIdentificacionPersona.getText();
		String direccion = txtDireccionPersona.getText();
		String telefono = txtTelefonoPersona.getText();
		String identificacionTributaria = txtIdTributariaPersona.getText();
		String nit=txtNitPersona.getText();
		String email=txtEmailPersona.getText();
		String fechaNaci =txtFNacimientoPersona.getText();



		if(datosValidos(nombre, apellidos, identificacion, direccion,telefono,identificacionTributaria,nit,email, fechaNaci)==true) {

			Persona persona = null;

			persona  = aplicacion.crearCliente(nombre,apellidos,identificacion,direccion,telefono,identificacionTributaria,nit,email,fechaNaci);

			if(persona != null) {

				limpiarCamposTextoPersona();
				listaClientesData.add(persona);

				mostrarMensaje("Notificación cliente", "Cliente  registrado", "El cliente se ha registrado con éxito", AlertType.INFORMATION);
			} 
			else {
				mostrarMensaje("Notificación cliente", "Cliente no registrado", "El cliente con documento "+identificacion+" ya se encuentra registrado", AlertType.ERROR);
			}

		}
	}

	private void eliminarCliente() {

		boolean flagClienteEliminado = false;
		if(personaSeleccionada!=null) {

			if(mostrarMensajeConfirmacion("¿estas seguro de eliminar al cliente?")==true) {

				flagClienteEliminado= aplicacion.eliminarCliente(personaSeleccionada.getIdentificacion());

				if(flagClienteEliminado==true) {
					listaClientesData.remove(personaSeleccionada);
					personaSeleccionada=null;
					tablaPersona.getSelectionModel().clearSelection();
					limpiarCamposTextoPersona();
					mostrarMensaje("Notificación cliente", "Cliente eliminado", "El cliente se ha eliminado con éxito", AlertType.INFORMATION);
				}

				else {
					mostrarMensaje("Notificación cliente", "Cliente no eliminado", "El cliente no se puede eliminar", AlertType.ERROR);

				}
			}
			else {
				mostrarMensaje("Notificación cliente", "Cliente no seleccionado", "Debe seleccionar un cliente", AlertType.WARNING);
			}
		}
	}

	private void actualizarCliente() {


		String nombre = txtNombrePersona.getText();
		String apellidos = txtApellidoPersona.getText();
		String identificacion = txtIdentificacionPersona.getText();
		String direccion = txtDireccionPersona.getText();
		String telefono = txtTelefonoPersona.getText();
		String identificacionTributaria = txtIdTributariaPersona.getText();
		String nit=txtNitPersona.getText();
		String email=txtEmailPersona.getText();
		String fechaNaci =txtFNacimientoPersona.getText();


		boolean flagClienteActualizado = false;
		if(personaSeleccionada!=null) {
			if(datosValidos(nombre,  apellidos,  identificacion,  direccion,
					telefono, identificacionTributaria, nit,  email, fechaNaci)==true) {


				flagClienteActualizado= aplicacion.actualizarCliente(personaSeleccionada.getIdentificacion(),nombre,  apellidos,  identificacion,  direccion,
						telefono, identificacionTributaria, nit,  email, fechaNaci);

				if(flagClienteActualizado==true) {
					tablaPersona.refresh();
					mostrarMensaje("Notificación cliente", "Cliente actualizado", "El cliente se ha actualizado con éxito", AlertType.INFORMATION);
				}
			}

			else {
				mostrarMensaje("Notificación cliente", "Cliente no actualizada", "El cliente no se puede actualizar", AlertType.ERROR);

			}
		}
		else {
			mostrarMensaje("Notificación cliente", "Cliente no seleccionado", "Debe seleccionar un cliente", AlertType.WARNING);
		}
	}






	private boolean mostrarMensajeConfirmacion(String mensaje) {
		Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setTitle("Confirmación");
		alert.setHeaderText(null);
		alert.setContentText(mensaje);

		Optional<ButtonType> action = alert.showAndWait();

		if(action.get() == ButtonType.OK){
			return true;
		}else{
			return false;
		}
	}




	private void limpiarCamposTextoPersona() {
		txtNombrePersona.setText("");
		txtApellidoPersona.setText("");
		txtIdentificacionPersona.setText("");
		txtDireccionPersona.setText("");
		txtTelefonoPersona.setText("");
		txtIdTributariaPersona.setText("");
		txtNitPersona.setText("");
		txtEmailPersona.setText("");
		rbJuridica.setSelected(false);
		rbNatural.setSelected(false);
		txtEmailPersona.setDisable(true);
		txtFNacimientoPersona.setDisable(true);
		txtIdTributariaPersona.setDisable(true);
		txtNitPersona.setDisable(true);


	}


	private void mostrarMensaje(String titulo,String header, String contenido, AlertType alertType) {

		Alert alert = new Alert(alertType);
		alert.setTitle(titulo);
		alert.setHeaderText(header);
		alert.setContentText(contenido);
		alert.showAndWait();


	}



	private boolean datosValidos(String nombre, String apellidos, String identificacion, String direccion,
			String telefono, String identificacionTributaria, String nit, String email, String fechaNaci) {

		String mensaje="";

		if(nombre== null || nombre.equals("")) 
			mensaje+="El nombre es invalido \n";

		if(apellidos== null || apellidos.equals("")) 
			mensaje+="El apellido es invalido \n";

		if(identificacion== null || identificacion.equals("")) 
			mensaje+="El documento es invalido \n";

		if(direccion== null || direccion.equals("")) 
			mensaje+="La direccion es invalido \n";

		if(telefono== null || telefono.equals("")) 
			mensaje+="el telefoni es invalido \n";

		if(rbNatural.isSelected()==false && rbJuridica.isSelected()==false)
		{
			mensaje+="no selecciono el tipo de persona";
		}
		if(rbJuridica.isSelected()==true ) {


			if(identificacionTributaria== null || identificacionTributaria.equals("")) 
				mensaje+="la identificacion tributaria es invalido \n";

			if(nit== null || nit.equals("")) 
				mensaje+="El nit es invalido \n";
		}
		else {

			if(email== null || email.equals("")) 
				mensaje+="El email es invalido \n";
			if(fechaNaci== null || fechaNaci.equals("")) 
				mensaje+="la fecha naciemiento es invalido \n";
		}

		if(mensaje.equals("")) {
			return true;
		}
		else {
			mostrarMensaje("Notificación cliente", "Datos invalidos",mensaje, AlertType.WARNING);
			return false;
		}

	}


	public void setAplicacion(Aplicacion aplicacion) {

		this.aplicacion = aplicacion;
		tablaPersona.getItems().clear();
		tablaPersona.setItems(getListaClientesData());
		tablaProducto.getItems().clear();
		tablaProducto.setItems(getListaProductosData());

	}

	public ObservableList<Persona> getListaClientesData() {
		listaClientesData.addAll(aplicacion.obtenerClientes());
		return listaClientesData;
	}

	/// PRODUCTO
	public ObservableList<Producto> getListaProductosData() {
		listaProductosData.addAll(aplicacion.obtenerProducto());
		return listaProductosData;
	}


	private void mostrarInformacionProducto(Producto productoSeleccionado) {

		if(productoSeleccionado!= null) {
			txtCodigoProducto.setText(productoSeleccionado.getCodigo());
			txtDescripcionProducto.setText(productoSeleccionado.getDescripcion());
			txtValorU.setText(Double.toString(productoSeleccionado.getValorUnitario()));
			txtCantidadExistente.setText(Integer.toString(productoSeleccionado.getCantidadExistente()));
			txtFechaVenci.setText(productoSeleccionado.getFechaVencimiento());
			txtCodigoAproba.setText(productoSeleccionado.getCodigoAprobacion());
			txtTemperatura.setText(productoSeleccionado.getTemperaturaRecomendada());
			txtFechaEnvase.setText(productoSeleccionado.getFechaEnvasado());
			txtPeso.setText(productoSeleccionado.getPeso());
			txtPaisOrigen.setText(productoSeleccionado.getPaisOrigen());

		}

	}

	private void nuevoProducto() {
		txtCodigoProducto.setText("");
		txtDescripcionProducto.setText("");
		txtValorU.setText("");
		txtCantidadExistente.setText("");
		txtFechaVenci.setText("");
		txtCodigoAproba.setText("");
		txtTemperatura.setText("");
		txtFechaEnvase.setText("");
		txtPeso.setText("");
		txtPaisOrigen.setText("");
		rbEnvasados.setSelected(false);
		rbPerecedero.setSelected(false);
		rbRefrigerados.setSelected(false);			
		txtCodigoAproba .setDisable(true);
		txtTemperatura.setDisable(true);
		txtFechaEnvase.setDisable(true);
		txtPeso.setDisable(true);
		txtPaisOrigen.setDisable(true);
		txtFechaVenci.setDisable(true); 




	}
	private void agregarProducto() {

		String codigo= txtCodigoProducto.getText();
		String descripcion=txtDescripcionProducto.getText();
		Double valorUnitario= Double.valueOf(txtValorU.getText());
		int cantidadExistente= Integer.parseInt(txtCantidadExistente.getText());
		String fechaVencimiento= txtFechaVenci.getText();
		String codigoAprobacion=txtCodigoAproba.getText();
		String temperaturaRecomendada=txtTemperatura.getText();	
		String fechaEnvasado=txtFechaEnvase.getText();
		String peso=txtPeso.getText();
		String paisOrigen=txtPaisOrigen.getText();


		if(datosValidosProducto(codigo,descripcion,valorUnitario,cantidadExistente,fechaVencimiento,codigoAprobacion,temperaturaRecomendada,fechaEnvasado,peso,paisOrigen)==true) {

			Producto producto= null;

			producto = aplicacion.crearProducto(codigo,descripcion,valorUnitario,cantidadExistente,fechaVencimiento,codigoAprobacion,temperaturaRecomendada,fechaEnvasado,peso,paisOrigen);

			if(producto != null) {

				limpiarCamposTextoProducto();
				listaProductosData.add(producto);

				mostrarMensaje("Notificación producto", "Producto registrado", "El Producto se ha registrado con éxito", AlertType.INFORMATION);
			} 

			else {
				mostrarMensaje("Notificación Producto", "Producto no registrado", "El producto con documento "+codigo+" ya se encuentra registrado", AlertType.ERROR);
			}

		}
	}

	private boolean datosValidosProducto(String codigo, String descripcion, double valorUnitario, int cantidadExistente,String fechaVencimiento, String codigoAprobacion, String temperaturaRecomendada,
			String fechaEnvasado, String peso, String paisOrigen) {

		String mensaje="";
		if(codigo== null || codigo.equals("")) 
			mensaje+="El codigo es invalido \n";

		if(descripcion== null || descripcion.equals("")) 
			mensaje+="la descripcion es invalida \n";

		if(Double.toString(valorUnitario)== null || Double.toString(valorUnitario).equals("")) 
			mensaje+="El valor unitario es invalido \n";

		if(Integer.toString(cantidadExistente)== null || Integer.toString(cantidadExistente).equals("")) 
			mensaje+="La cantidad es invalida \n";



		if(rbPerecedero.isSelected()==false && rbRefrigerados.isSelected()==false && rbEnvasados.isSelected()==false)
		{
			mensaje+="no selecciono el tipo de persona";
		}
		if(rbPerecedero.isSelected()==true ) {
			if(fechaVencimiento== null || fechaVencimiento.equals("")) 
				mensaje+="la fecha de vencimiento es invalida \n";


		}
		else if (rbRefrigerados.isSelected()==true) {

			if(codigoAprobacion== null || codigoAprobacion.equals("")) 
				mensaje+="El codigo de aprobacion es invalido \n";

			if(temperaturaRecomendada== null || temperaturaRecomendada.equals("")) 
				mensaje+="la temperatura recomendada es invalida \n";
		}

		else {

			if(fechaEnvasado==null || fechaEnvasado.equals("")) 

				mensaje+="la fecha de envase es invalida \n";
			if(peso== null || peso.equals("")) 
				mensaje+="El peso es invalido \n";

			if(paisOrigen== null || paisOrigen.equals("")) 
				mensaje+="la pais de origen es invalido \n";
		}

		if(mensaje.equals("")) {
			return true;
		}
		else {
			mostrarMensaje("Notificación Producto", "Datos invalidos",mensaje, AlertType.WARNING);
			return false;				 }

	}


	private void eliminarProducto() {

		boolean flagProductoEliminado = false;
		if(productoSeleccionado!=null) {

			if(mostrarMensajeConfirmacion("¿estas seguro de eliminar el producto?")==true) {

				flagProductoEliminado= aplicacion.eliminarProducto(productoSeleccionado.getCodigo());

				if(flagProductoEliminado==true) {
					listaProductosData.remove(productoSeleccionado);
					productoSeleccionado=null;
					tablaProducto.getSelectionModel().clearSelection();
					limpiarCamposTextoProducto();
					mostrarMensaje("Notificación Producto", "Producto eliminado", "El Producto se ha eliminado con éxito", AlertType.INFORMATION);
				}

				else {
					mostrarMensaje("Notificación Producto", "producto no eliminado", "El producto no se puede eliminar", AlertType.ERROR);

				}
			}
			else {
				mostrarMensaje("Notificación Producto", "producto no seleccionado", "Debe seleccionar un producto", AlertType.WARNING);
			}
		}

	}

	private void actualizarProducto() {
		String codigo= txtCodigoProducto.getText();
		String descripcion=txtDescripcionProducto.getText();
		Double valorUnitario= Double.valueOf(txtValorU.getText());
		int cantidadExistente= Integer.parseInt(txtCantidadExistente.getText());
		String fechaVencimiento= txtFechaVenci.getText();
		String codigoAprobacion=txtCodigoAproba.getText();
		String temperaturaRecomendada=txtTemperatura.getText();	
		String fechaEnvasado=txtFechaEnvase.getText();
		String peso=txtPeso.getText();
		String paisOrigen=txtPaisOrigen.getText();

		boolean flagProductoActualizado = false;
		if(productoSeleccionado!=null) {
			if(datosValidosProducto(codigo,descripcion,valorUnitario,cantidadExistente,fechaVencimiento,codigoAprobacion,temperaturaRecomendada,fechaEnvasado,peso,paisOrigen)==true) {

				flagProductoActualizado= aplicacion.actualizarProducto(productoSeleccionado.getCodigo(),codigo,descripcion,valorUnitario,cantidadExistente,fechaVencimiento,codigoAprobacion,temperaturaRecomendada,fechaEnvasado,peso,paisOrigen);

				if(flagProductoActualizado==true) {
					tablaProducto.refresh();
					mostrarMensaje("Notificación Producto", "Producto actualizado", "El Producto se ha Actualizado con éxito", AlertType.INFORMATION);
				}
			}
			else {
				mostrarMensaje("Notificación Producto", "producto no actualizado", "El producto no se puede actualizar", AlertType.ERROR);

			}
		}
		else {
			mostrarMensaje("Notificación Producto", "producto no seleccionado", "Debe seleccionar un producto", AlertType.WARNING);
		}
	}






	private void limpiarCamposTextoProducto() {
		txtCodigoProducto.setText("");
		txtDescripcionProducto.setText("");
		txtValorU.setText("");
		txtCantidadExistente.setText("");
		txtFechaVenci.setText("");
		txtCodigoAproba.setText("");
		txtTemperatura.setText("");
		txtFechaEnvase.setText("");
		txtPeso.setText("");
		txtPaisOrigen.setText("");
		rbEnvasados.setSelected(false);
		rbPerecedero.setSelected(false);
		rbRefrigerados.setSelected(false);
		txtCodigoAproba .setDisable(true);
		txtTemperatura.setDisable(true);
		txtFechaEnvase.setDisable(true);
		txtPeso.setDisable(true);
		txtPaisOrigen.setDisable(true);
		txtFechaVenci.setDisable(true); 



	}


}



