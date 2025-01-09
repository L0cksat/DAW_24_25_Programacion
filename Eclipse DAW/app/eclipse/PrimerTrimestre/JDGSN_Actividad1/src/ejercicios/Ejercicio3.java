package ejercicios;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 3.
		 * Escribir todos los números del 100 al 0 de 7 en 7. Al final mostrar las siguientes Estadísticas.
        Cuantos números has escrito
        Cuanto suman los números escritos
        Cuantos de estos números son pares.

		 */
		/*
		 * Declaro e inicializo los variables numerosEscr, suma y pares.
		 */
		
		int numerosEscr =0, suma =0, pares =0;
		
		//Usamos un bucle for para ir pasando por los numeros 100 a 0 de 7 en 7.
		
		for(int i=100; i>=0; i-=7) {
			//esta variable es el contador de los numeros escritos
			numerosEscr++;
			suma+=i;
			if(i%2==0)
				pares++;
	}
		//Aquí imprimimos en consola las estadisticas
		System.out.println("ESTADISTICAS");
		System.out.println("Numeros totales escritos : " +numerosEscr);
		System.out.println("La suma total de numeros escritos : " +suma);
		System.out.println("Numeros pares totales : " +pares);
		System.out.println("FIN DE PROGRAMA.");
	}
}
