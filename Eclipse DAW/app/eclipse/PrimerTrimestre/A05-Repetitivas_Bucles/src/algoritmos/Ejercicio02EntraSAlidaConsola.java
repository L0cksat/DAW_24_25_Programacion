package algoritmos;

import java.util.Scanner;

public class Ejercicio02EntraSAlidaConsola {

	public static void main(String[] args) {
		// Salida por consola en Java
		int numero = 0; double numero2 = 0;;
		//System.out.println("Hola : " + 12);
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce un numero : ");
		numero = leer.nextInt();
		
		System.out.println("Introduce otro numero : ");
		numero2 = leer.nextDouble();
		System.out.println(numero);
		System.out.println(numero2);
		
		
		leer.close();
		
	}

}
