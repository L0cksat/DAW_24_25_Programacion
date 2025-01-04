package javabean;

import java.util.Objects;

public class Producto {

	//Instantaciamos los atributos/variables.
	private long codigoBarras;
	private String descripcion;
	private double precioUnitario;
	private int cantidadStock;
	private String talla;
	private String color;
	
	//Creamos el constructor con todos los campos seleccionados.
	public Producto(long codigoBarras, String descripcion, double precioUnitario, int cantidadStock, String talla,
			String color) {
		super();
		this.codigoBarras = codigoBarras;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.cantidadStock = cantidadStock;
		this.talla = talla;
		this.color = color;
		
	//Creamos los getters and setters.
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public int getCantidadStock() {
		return cantidadStock;
	}
	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
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
	
	//Realizamos la sobreescritura del toString.
	@Override
	public String toString() {
		return "Producto [codigoBarras=" + codigoBarras + ", descripcion=" + descripcion + ", precioUnitario="
				+ precioUnitario + ", cantidadStock=" + cantidadStock + ", talla=" + talla + ", color=" + color + "]";
	}
	
	//Realizamos los METODOS PROPIOS.
	
	
	//Metodo propio solicitado 1.
	public double precioConIva(int iva) {
		double precioConIva = (1 + iva /100.00) * this.precioUnitario;
		return precioConIva;
	}
	
	//Metodo propio solicitado 2.
	public void aumentarStock(int cantidad) {
		cantidadStock += cantidad;
		
		}
	
	//Metodo propio solicitado 3.
	public boolean disminuirStock(int cantidad) {
		if(cantidad > cantidadStock) {
			return false;
		}
		cantidadStock -= cantidad;
			return true;
	}
	
	//Metodo propio solicitado 4.
	public double precioAplicado() {
		double precioFinal = this.precioUnitario;
		switch(talla.toUpperCase()) {
		case "XS":
			break;
		case "S":
		case "M":
		case "L":
		case "XL":
			precioFinal = (1 + 3/100.00) * this.precioUnitario;
			break;
		case "XXL":
		case "XXXL":
			precioFinal = (1 + 4/100.00) * this.precioUnitario;
		default:
			break;
		}
		return precioFinal;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigoBarras);
	}
	/*@Override
	public boolean equals(Object obj) {
		System.out.println("llamado a equals");
		if (this == obj)
			return true;
		if (!(obj instanceof Producto))
			return false;
		Producto other = (Producto) obj;
		return codigoBarras == other.codigoBarras;
	}
	*/
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Producto))
			return false;
		
		Producto otro = (Producto)obj;
		
		if(this.codigoBarras == otro.codigoBarras 
				//&& this.descripcion.equals(otro.descripcion)
				)
			return true;
		else
			return false;
	}
	
}
