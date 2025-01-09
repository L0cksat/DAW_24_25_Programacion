package testing;

import javabean.Producto;

public class TestProducto {

	public static void main(String[] args) {

		// Creamos el producto1 usando el constructor vacio y ponemos los valores.
		Producto producto1 = new Producto();

		// Usamos los setters para el producto1
		producto1.setCodigoBarras(5863749812036L);
		producto1.setDescripcion("Camiseta");
		producto1.setPrecioUnitario(15.00);
		producto1.setCantidadStock(20);
		producto1.setTalla("S");
		producto1.setColor("Rojo");

		// Testeamos los metodos.

		// Metodo solicitado 1.
		System.out.println("\n-----PRIMER CASO-----\n");
		System.out.println("El codigo de barras es: " + producto1.getCodigoBarras() + "\n");
		System.out.println("El valor inicial es: " + producto1.getPrecioUnitario() + "\n");
		System.out.println("El precio con IVA es: " + producto1.precioConIva(21) + "\n");

		// Metodo solicitado 2.
		System.out.println("La cantidad del stock actual es: " + producto1.getCantidadStock() + "\n");
		int aumento = 10;
		producto1.aumentarStock(aumento);
		System.out.println("El stock ha aumentado por: " + aumento + "\n");
		System.out.println("El nuevo stock es: " + producto1.getCantidadStock() + "\n");

		// Metodo solicitado 3.
		System.out.println("El stock actual es: " + producto1.getCantidadStock() + "\n");
		int disminuir = 10;
		boolean resultado = producto1.disminuirStock(disminuir);
		System.out.println("El stock ha disminuido por: " + disminuir + "\n");
		if (resultado == false) {
			System.out.println("el stock no puede ser por debajo de cero");
		}
		System.out.println("El stock actual es: " + producto1.getCantidadStock() + "\n");

		System.out.println("La talla es: " + producto1.getTalla() + "\n");
		System.out.println("El precio aplicado es: " + producto1.precioAplicado() + "\n");
		System.out.println("El color de la prenda es: " + producto1.getColor() + "\n");

		System.out.println("\n-----SIGUINETE CASO----\n");

		Producto producto2 = new Producto(7841260987103L, "Pantalon", 20.00, 30, "XXL", "Negro");

		// Metodo solicitado 1.
		System.out.println("El codigo de barras es: " + producto2.getCodigoBarras() + "\n");
		System.out.println("El valor inicial es: " + producto2.getPrecioUnitario() + "\n");
		System.out.println("El precio con IVA es: " + producto2.precioConIva(21) + "\n");

		// Metodo solicitado 2.
		System.out.println("La cantidad del stock actual es: " + producto2.getCantidadStock() + "\n");
		int aumento1 = 10;
		producto2.aumentarStock(aumento1);
		System.out.println("El stock ha aumentado por: " + aumento1 + "\n");

		// Metodo solicitado 3.
		System.out.println("El stock actual es : " + producto2.getCantidadStock() + "\n");
		int disminuir1 = 20;
		boolean resultado1 = producto2.disminuirStock(disminuir1);
		System.out.println("El stock ha disminuido por : " + disminuir1 + "\n");
		if (resultado1 == false) {
			System.out.println("el stock no puede ser por debajo de cero \n");
		}
		System.out.println("El stock actual es : " + producto2.getCantidadStock() + "\n");

		System.out.println("La talla es: " + producto2.getTalla() + "\n");
		System.out.println("El precio aplicado es : " + producto2.precioAplicado() + "\n");
		System.out.println("El color de la prenda es: " + producto2.getColor());

	}

}
