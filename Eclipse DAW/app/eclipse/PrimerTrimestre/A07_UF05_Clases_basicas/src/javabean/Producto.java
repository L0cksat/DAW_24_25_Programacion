package javabean;

public class Producto {
	
	private long codigoBarras;
	private String descripcionCorta;
	private String descripcionLarga;
	private double precioUnitario;
	private String talla;
	private String color;
	private int stock;
	
	public Producto(long codigoBarras, String descripcionCorta, String descripcionLarga, double precioUnitario,
			String talla, String color, int stock) {
		super();
		this.codigoBarras = codigoBarras;
		this.descripcionCorta = descripcionCorta;
		this.descripcionLarga = descripcionLarga;
		this.precioUnitario = precioUnitario;
		this.talla = talla;
		this.color = color;
		this.stock = stock;
	}
	public Producto() {
		super();
	}
	public long getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(long codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public String getDescripcionCorta() {
		return descripcionCorta;
	}
	public void setDescripcionCorta(String descripcionCorta) {
		this.descripcionCorta = descripcionCorta;
	}
	public String getDescripcionLarga() {
		return descripcionLarga;
	}
	public void setDescripcionLarga(String descripcionLarga) {
		this.descripcionLarga = descripcionLarga;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	@Override
	public String toString() {
		return "Producto [codigoBarras=" + codigoBarras + ", descripcionCorta=" + descripcionCorta
				+ ", descripcionLarga=" + descripcionLarga + ", precioUnitario=" + precioUnitario + ", talla=" + talla
				+ ", color=" + color + ", stock=" + stock + "]";
	}
	
	//metodos propios
	public void aumentarStock(int cantidad) {
		stock += cantidad;
	}
	
	public boolean restarStock(int cantidad) {
		if (cantidad <= stock) {
			stock -= cantidad;
			return true;
	}
	return false;	
	}
	
	public double precioConIva(int iva) {
		return 0;
	}
}
