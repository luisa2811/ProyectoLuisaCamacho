package model;

import java.util.Date;

public class Factura {
	
	private int codigo;
	private Date fecha;
	private DetalleFactura detalleVenta;
	private Persona cliente;
	private	Double total;
	private	float iva;
	
	
	public Factura() {
		// TODO Auto-generated constructor stub
	}
	
	public Factura(int codigo, Date fecha, DetalleFactura detalleVenta, Persona cliente, Double total, float iva) {
		super();
		this.codigo = codigo;
		this.fecha = fecha;
		this.detalleVenta = detalleVenta;
		this.cliente = cliente;
		this.total = total;
		this.iva = iva;
	}
	//getters and setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public DetalleFactura getDetalleVenta() {
		return detalleVenta;
	}
	public void setDetalleVenta(DetalleFactura detalleVenta) {
		this.detalleVenta = detalleVenta;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public float getIva() {
		return iva;
	}
	public void setIva(float iva) {
		this.iva = iva;
	}
	public Persona getCliente() {
		return cliente;
	}
	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}
	
	
	
}
