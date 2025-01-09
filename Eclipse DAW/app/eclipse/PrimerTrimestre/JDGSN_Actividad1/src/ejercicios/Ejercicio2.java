package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 2. Diseñar un programa que muestre el producto y la suma de los 10
		 * primeros números impares. 1,3,5,7,9,11,13,15,17,19 1º necesito la variable
		 * para los impares. 2º necesito también sumar los impares. 3º necestio
		 * multiplar los impares.
		 */
		int suma = 0, producto = 1;

		for (int i = 1; i <= 19; i += 2) {
			suma += i;

			producto *= i;

		}
		System.out.println("La suma de los impares es : " + suma);
		System.out.println("La multiplicación de los impares es : " + producto);
		System.out.println("FIN DE PROGRAMA");
	}

}
