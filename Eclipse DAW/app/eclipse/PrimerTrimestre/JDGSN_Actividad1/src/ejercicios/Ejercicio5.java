package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 5.
		 * 
		 * Pedimos por pantalla un nombre y una contraseña: si el nombre coincide con
		 * “sara”, preguntamos por la contraseña y si coincide con “sarita”, escribimos
		 * el mensaje “usuario y contraseña correctas, bienvenido a la aplicación” Si el
		 * nombre NO es “sara” Escribimos usuario incorrecto” Si el nombre es correcto y
		 * la contraseña NO, Escribimos “contraseña incorrecta”
		 * 
		 */

		/*
		 * Primero tengo crear la clase de Scanner para poder leer la entrada del
		 * usuario y guardarlo en la variable como nombre y password.
		 */

		Scanner leer = new Scanner(System.in);

		// Pedimos el usuario que introduzca el nombre, leemos el string de caracteres y
		// se guarda en el variable nombre.
		System.out.println("Por favor introduce el nombre del usuario.");
		String nombre = leer.next();

		/*
		 * Ahora hacemos la pregunta con la alternativa if para saber si nombre que ha
		 * introducido el usuario es el mismo que buscamos.
		 */
		if (nombre.equals("sara")) {
			System.out.println("El usuario es correcto.");
			System.out.println("Introduce la contraseña.");
			String password = leer.next();
			if (password.equals("sarita")) {
				System.out.println("Usuario y contraseña correctas, bienvenida a la aplicación.");
			} else {
				System.out.println("Contraseña incorrecta.");
			}
		} else {
			System.out.println("Usuario incorrecto");
		}
		leer.close();
		System.out.println("FIN DE PROGRAMA");
	}

}
	

		
			

		
		



