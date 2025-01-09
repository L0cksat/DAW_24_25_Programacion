package testing;

import javabean.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto = new Producto(1001L, "Camisa", "Camisa de manga larga de mujer talla 50", 123, "50", "Blanca", 234);

		System.out.println(producto);
	}

}
