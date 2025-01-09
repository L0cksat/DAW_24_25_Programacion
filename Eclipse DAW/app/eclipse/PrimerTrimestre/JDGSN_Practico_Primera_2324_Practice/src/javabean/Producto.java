package javabean;

public class Producto {

	//instanciamos los atributos.
	private int numeroProducto;
	private String descripcion;
	private double precioUnitario;
	private int cantidadStock;
	private String talla;
	private String color;
	
	//Creamos el constructor con todos los campos.
	public Producto(int numeroProducto, String descripcion, double precioUnitario, int cantidadStock, String talla,
			String color) {
		super();
		this.numeroProducto = numeroProducto;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.cantidadStock = cantidadStock;
		this.talla = talla;
		this.color = color;
	}

	//creamos el constructor sin campos rellenados (vacio).
	public Producto() {
		super();
	}

	
	//Creamos los Getter and Setters.
	public int getNumeroProducto() {
		return numeroProducto;
	}

	public void setNumeroProducto(int numeroProducto) {
		this.numeroProducto = numeroProducto;
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

	//Creamos el toString con la información del Producto.
	@Override
	public String toString() {
		return "Producto [numeroProducto=" + numeroProducto + ", descripcion=" + descripcion + ", precioUnitario="
				+ precioUnitario + ", cantidadStock=" + cantidadStock + ", talla=" + talla + ", color=" + color + "]";
	}
	
	//Creamos los MÉTODOS PROPIOS de la clase.
	
	//Método solicitado a).
	public double precioConIva(int iva) {
		double precioConIva = (1 + iva/100.00) * this.precioUnitario;
		System.out.println("El precio con iva es : " + precioConIva);
		return precioConIva;
		
	}
	
	//Método solicitado b).
	public void aumentarStock(int cantidad) {
		System.out.println("Se va a incrementar el stock por " + cantidad + " " + "unidades.");
		cantidadStock += cantidad;
		System.out.println("Se ha incrementado el stock. El nuevo stock es : " + cantidadStock + " " + "unidades.");
	}
	
	//Método solicitado c).
	public boolean disminuirStock(int cantidad) {
		System.out.println("El stock actual es: " + cantidadStock);
		System.out.println("Se va a dismunir el stock por : " + cantidad);
		cantidadStock -= cantidad;
		if(cantidadStock < 0) {
			System.out.println("Error el stock no puede quedar por debajo de 0.");
			return false;
		}else {
			System.out.println("El nuevo stock es: " + cantidadStock);
			return true;
			
		}
	}

	//Método solicitado d).
	public double precioAplicado() {
		double precioFinal = this.precioUnitario;
		switch(talla.toUpperCase()) {
		case "XS":
			System.out.println("No se aplica precio, el precio es : " + precioFinal);
			break;
		case "S":
		case "M":	
		case "L":
		case "XL":
			precioFinal = (1 + 3 / 100.00) * this.precioUnitario;
			System.out.println("El precio se ha incrementado por 3%. El nuevo precio es: " + precioFinal);
			break;
		case "XXL":
		case "XXXL":
			precioFinal = (1 + 4 / 100.00) * this.precioUnitario;
			System.out.println("El precio se ha incrementado por 4%. El nuevo precio es: " + precioFinal);
			break;
		default:
			System.out.println("No se ha aplicado ningun incremento del precio");
			break;
		}
		return precioFinal;
	}
}
