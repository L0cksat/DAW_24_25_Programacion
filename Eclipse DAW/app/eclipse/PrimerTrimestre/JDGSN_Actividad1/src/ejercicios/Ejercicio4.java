package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 4.
		 *  Leer números hasta que se introduzca un cero. Para cada uno indicar si es par o impar. Al final mostrar las siguientes Estadísticas:
        	cuantos son pares e impares
        	cuanto suman los pares y cuanto los impares.
		 */
		
		//Declaro las variables: numero, pares, impares, sumaPares y sumaImpares
		
		int numero=0, pares=0, impares=0, sumaPares=0, sumaImpares=0;
		
		//Creo la clase Scanner
		
		Scanner leer = new Scanner(System.in);
		//Tenemos que leer y guardar lo que nos introduce el usuario
		System.out.println("Introducir un numero entero.");
		numero = leer.nextInt();
		
		//Usamos el bucle while con un if dentro para ir clasificando los numeros y sumandolos.
		while(numero !=0) {
			if(numero %2==0) {
				System.out.println("El numero es par.");
				pares++;
				sumaPares+=numero;
			}
			else {
				System.out.println("El numero es impar.");
				impares++;
				sumaImpares+=numero;
			}
		System.out.println("Introduce otro numero entero.");
		numero= leer.nextInt();
		
	}
		leer.close();
		System.out.println("ESTADISTICAS");
		System.out.println("El numero total de pares son: " +pares);
		System.out.println("El numero total de impares son: " +impares);
		System.out.println("La suma total de los pares es: " +sumaPares);
		System.out.println("La suma total de los impares es: " +sumaImpares);
		
		System.out.println("FIN DE PROGRAMA.");
	}
}
