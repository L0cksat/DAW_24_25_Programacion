package testing;

public class Ejercicio01MetodosDeString {

	public static void main(String[] args) {
		String saludo = "Hola me llamo tomasin y soy tu profe";
		String nombre = "Andres";
		String nombre2 = new String("andres");
		
		System.out.println(saludo.length());
		System.out.println(saludo.charAt(0));
		System.out.println(saludo.toUpperCase());
		System.out.println(saludo.toLowerCase());
		
		if(nombre == nombre2) 
			System.out.println("iguales");
		
		else
			System.out.println("distintos");
		
		if (nombre.equals(nombre2))
			System.out.println("iguales por equals");
		else
			System.out.println("distintos por equals");
		//contiene, comienza y termina -> true o false
		System.out.println("---BUSQUEDAS POR CONTIENE---");
		System.out.println(saludo.contains("llamo"));
		System.out.println(saludo.toUpperCase().startsWith("HOLA"));
		System.out.println(saludo.endsWith("profe"));
		System.out.println("---LOCALIZAR UNA CADENA POR POSICION---");
		System.out.println(saludo.indexOf("clamo"));
		/*
		 *  espacios en blanco
		 *  numeros
		 *  letras mayuculas
		 *  letras minusculas 32
		 */
		System.out.println(nombre.compareTo("andres"));
		System.out.println(nombre.compareToIgnoreCase("AndReS"));
		
		String [] palabras = saludo.split(" ");
		for (String palabra: palabras)
			System.out.println(palabra);
		
		String numero = String.valueOf(12);
		
		
	}

}
