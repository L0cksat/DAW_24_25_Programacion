package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 1.
		Pedir una nota de 0 a 10 y mostrarla de la forma: 
		Insuficiente, Suficiente, Bien, Notable y sobresaliente. 
		Si la nota introducida no está en el rango mostrar el mensaje “Nota errónea”.
		 */

		/*
		 * Primero voy a definir las variables y voy a crear la nueva clase
		 * Scanner para poder leer las notas introducidas (teniendo en cuenta
		 * de cerrarlo al final con leer.close();
		 */

		Scanner leer = new Scanner(System.in);
		int nota;
		
		// Voy a pedir al usuario que introdzuca un numero entero para verificar su nota, y guardamos lo que introduce el usuario en la variable "nota" usando la clase leer.nextIn()
		 
		System.out.println("Por favor introduce el número entero de tu nota para saber si has aprobado.");
		nota = leer.nextInt();
		/*Ahora probamos con la alternativa para saber que nota se ha obtenido
		 */
		if (nota <= 4) {
			System.out.println("Tu nota es Insuficiente");
		}
		else {
			if (nota == 5)
				System.out.println("Tu nota es Suficiente");
			else {
				if(nota == 6)
					System.out.println("Tu nota es Bien");
				else {
					if(nota == 7 || nota == 8)
						System.out.println("Tu nota es Notable");
					else {
						if(nota == 9 || nota == 10)
							System.out.println("Tu nota es Sobresaliente");
						else {
							System.out.println("Nota errónea");
						}
					}
				}
			}
			System.out.println("FIN DE PROGRAMA.");
		}
		leer.close();
		
		
		}
	}	
	
