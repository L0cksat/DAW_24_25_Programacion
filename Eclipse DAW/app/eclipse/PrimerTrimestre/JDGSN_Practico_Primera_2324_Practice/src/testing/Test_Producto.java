package testing;

import javabean.Producto;

public class Test_Producto {

	public static void main(String[] args) {
		Producto producto1;
		Producto producto2 = new Producto();
		
		producto2.setNumeroProducto(102);
		producto2.setDescripcion("Pantalón largo");
		producto2.setCantidadStock(50);
		producto2.setPrecioUnitario(40.00);
		producto2.setTalla("s");
		producto2.setColor("Negro");
		
		
		producto1 = new Producto(100, "Jersey manga larga", 20.00, 20, "xxl", "gris");
		probarProducto(producto1, 10, 10, 21);
		
		
		probarProducto(producto2, 10, 70, 21);
		
		Producto[] productos= {new Producto(103, "Camisa", 15.00, 70, "xs", "Blanca"), 
				new Producto(104, "Falda", 20.00, 20, "s", "azul"), new Producto(105, "Jersey", 50.00, 30, "m", "rojo"), 
				new Producto(106, "Chaqueta", 60.00, 15, "l", "negro"), new Producto(107, "Pantalon corto", 10.00, 25, "xl", "azul marino"), 
				new Producto(108, "Blusa", 15.00, 15, "xxl", "verde oscuro"), new Producto(109, "Sudadera", 35.00, 20, "xxxl", "negro")};
		for(Producto producto: productos) {
			System.out.println(producto.precioAplicado());
		}
		
	}
	public static void probarProducto(Producto newProductoProbar, int cantidadAumStock, int cantidadDismiStock, int cantidadIva) {
		newProductoProbar.precioConIva(cantidadIva);
		newProductoProbar.aumentarStock(cantidadAumStock);
		newProductoProbar.disminuirStock(cantidadDismiStock);
		
		
	}
}
