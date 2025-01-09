package ejercicios;

import java.util.Scanner;

public class Ejercicio_4_Multiplicar_3_Numeros {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int num1, num2, num3, resultado;
		
		System.out.println("Hola, hoy vamos a multiplicar 3 numeros.");
		System.out.println("Por favor, introduce el primer número.\n");
		
		num1 = leer.nextInt();
		
		System.out.println("Has introducido el numero: " + num1 + "\n");
		System.out.println("Por favor, introduce el segundo numero.\n");
		
		num2 = leer.nextInt();
		
		System.out.println("Has introducido el numero: " + num2 + "\n");
		System.out.println("Por favor, introduce el tercer numero.\n");
		
		num3 = leer.nextInt();
		
		System.out.println("Has introducido el numero: " + num3 + "\n");
		System.out.println("Vale, vamos a multiplicar los tres numeros.\n");
		
		resultado = num1 * num2 * num3;
		
		System.out.println("Multiplicamos el " + num1 + " y el " + num2 + " y el " + num3 + ". El resultado es " + resultado + "\n");
		
		leer.close();
		
	}

}
