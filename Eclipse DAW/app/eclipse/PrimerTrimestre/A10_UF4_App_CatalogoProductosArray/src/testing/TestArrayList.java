package testing;

import java.util.ArrayList;

import javabean.Producto;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<Producto> lista = new ArrayList<>();
		Producto prueba = new Producto(1001, "Falda", 123, 30, "XS", "Blanco");
		
		
		lista.add(new Producto(1001, "Camisa", 123, 30, "XS", "Blanco"));
		lista.add(new Producto(1002, "Pantalon", 123, 30, "XS", "Blanco"));
		lista.add(new Producto(1003, "Falda", 123, 30, "XS", "Blanco"));
		lista.add(new Producto(1004, "Cinturon", 123, 30, "XS", "Blanco"));
		
		System.out.println(lista.size());
		
		System.out.println(lista.contains(prueba));
		System.out.println(lista.indexOf(prueba));
		
		
	}

}
