package ejercicios;
import java.util.Scanner;

public class Ejercicio_3_Suma_De_Numeros {
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int num1, num2, resultado;
		System.out.println("Por favor introduce dos numeros.\n");
		System.out.println("Introduce el primer numero.\n");
		
		num1 = leer.nextInt();
		
		System.out.println("Has introducido el numero: " + num1 + "\n");
		
		System.out.println("Por favor, introduce el segundo número.\n");
		
		num2 = leer.nextInt();
		
		System.out.println("Has introducido el numero: " + num2 + "\n");
		System.out.println("Vamos a sumar los numeros.\n");
		
		resultado = num1 + num2;
		
		System.out.println("A ver, voy a sumar... El " + num1 + " más el " + num2 + " son " + resultado + "\n");
		
		System.out.println("Sí! El resultado de la suma es: " + resultado + "\n");
		
		leer.close();

	}

}
