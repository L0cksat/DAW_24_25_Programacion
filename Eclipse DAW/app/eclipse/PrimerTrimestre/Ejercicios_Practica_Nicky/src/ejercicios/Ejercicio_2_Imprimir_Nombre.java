package ejercicios;

import java.util.Scanner;

public class Ejercicio_2_Imprimir_Nombre {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Hola, por favor introduce tu nombre.");
		
		String nombre;
		
		nombre = leer.next();
		
		System.out.println("Hola de nuevo, tu nombre es " + nombre + "\n");
		System.out.println("Lo siento " + nombre + ", no puedo hacer eso. \n");
		
		leer.close();
		

	}

}
