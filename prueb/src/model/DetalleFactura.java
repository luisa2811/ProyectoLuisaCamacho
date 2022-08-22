package model;

public class DetalleFactura  {
	
	private int catidadProductos;
	private double subTotal;
	private Producto producto;
	
	

	public DetalleFactura() {
		// TODO Auto-generated constructor stub
	}


	public DetalleFactura(int catidadProductos, double subTotal, Producto producto) {
		super();
		this.catidadProductos = catidadProductos;
		this.subTotal = subTotal;
		this.producto = producto;
	}
	
	
	//getters and setters
	public int getCatidadProductos() {
		return catidadProductos;
	}
	public void setCatidadProductos(int catidadProductos) {
		this.catidadProductos = catidadProductos;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	@Override
	public String toString() {
		return "DetalleFactura [catidadProductos=" + catidadProductos + ", subTotal=" + subTotal + ", producto="
				+ producto + "]";
	}
 
       
}
