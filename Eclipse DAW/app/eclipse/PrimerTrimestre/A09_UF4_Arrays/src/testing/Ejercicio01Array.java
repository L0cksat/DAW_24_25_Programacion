package testing;

public class Ejercicio01Array {

	public static void main(String[] args) {
		String [] nombres = {"sara", "eva", "carlos"};
		/*
		 * for (int i=0; i< 2; i++)
			System.out.println(nombres[i]);
		
		for (String nombre: nombres)
			System.out.println(nombre);
		 */
		String [] palabras= new String [4];
		palabras [0] = "Hola";
		palabras [1] = "Adios";
		for (int i=0; i< 2; i++)
			System.out.println(nombres[i]);
		
		for (String palabra: palabras) {
			if (palabra == null)
				break;
			System.out.println(palabra.toUpperCase());
		}
			
	}

}
