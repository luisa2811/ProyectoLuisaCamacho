package model;


public class Producto {

	private String codigo;
	private String descripcion;
	private Double valorUnitario;
	private int cantidadExistente;
	private String fechaVencimiento;
	private String codigoAprobacion;
	private String temperaturaRecomendada;
	private String fechaEnvasado;
	private String peso;
	private String paisOrigen;
	
	
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

  
	public Producto(String codigo, String descripcion, Double valorUnitario, int cantidadExistente,
			String fechaVencimiento, String fechaEnvasado, String peso, String paisOrigen, String codigoAprobacion,
			String temperaturaRecomendada) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.valorUnitario = valorUnitario;
		this.cantidadExistente = cantidadExistente;
		this.fechaVencimiento = fechaVencimiento;
		this.fechaEnvasado = fechaEnvasado;
		this.peso = peso;
		this.paisOrigen = paisOrigen;
		this.codigoAprobacion = codigoAprobacion;
		this.temperaturaRecomendada = temperaturaRecomendada;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public Double getValorUnitario() {
		return valorUnitario;
	}



	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}



	public int getCantidadExistente() {
		return cantidadExistente;
	}



	public void setCantidadExistente(int cantidadExistente) {
		this.cantidadExistente = cantidadExistente;
	}



	public String getFechaVencimiento() {
		return fechaVencimiento;
	}



	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}



	public String getFechaEnvasado() {
		return fechaEnvasado;
	}



	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}



	public String getPeso() {
		return peso;
	}



	public void setPeso(String peso) {
		this.peso = peso;
	}



	public String getPaisOrigen() {
		return paisOrigen;
	}



	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}



	public String getCodigoAprobacion() {
		return codigoAprobacion;
	}



	public void setCodigoAprobacion(String codigoAprobacion) {
		this.codigoAprobacion = codigoAprobacion;
	}



	public String getTemperaturaRecomendada() {
		return temperaturaRecomendada;
	}



	public void setTemperaturaRecomendada(String temperaturaRecomendada) {
		this.temperaturaRecomendada = temperaturaRecomendada;
	}


	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", valorUnitario=" + valorUnitario
				+ ", cantidadExistente=" + cantidadExistente + ", FechaVencimiento=" + fechaVencimiento
				+ ", codigoAprobacion=" + codigoAprobacion + ", temperaturaRecomendada=" + temperaturaRecomendada
				+ ", fechaEnvasado=" + fechaEnvasado + ", peso=" + peso + ", paisOrigen=" + paisOrigen + "]";
	}
	
	
	
}