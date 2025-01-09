package algoritmos;

public class Ejercicio01BuclesEnGeneral {

	public static void main(String[] args) {
		/*
		 * En Java ha tres tipos de bucles , todos mientras que : 
		 * dividos en dos secciones
		 * 1.- NOOO se el numero de veces que tengo que iterar: while y do-while
		 * 
		 * - Bucle de 0 a n: primero pregunta y si no se cumple se va
		 * 	Primcipio del bucle	
		 * while (condicion){
		 * 
		 * }
		 * final del bucle
		 * 
		 * -Bucle de 1 a n: primero entra y al final pregunta
		 * 	do{
		 * 	i1;
		 * 	i2;
		 * 
		 * 
		 * } while(condicion);
		 * 
		 * 2. Conozco las veces que lo voy a iterar: minimo /maximo
		 * Bucle for: 2 maneas distintas
		 * 	-for original, que itera numeros enteros
		 * 	-for para arrays y colecciones
		 */
		int numero = 1;
		while (numero <= 10) {
			System.out.println("El numero es: " + numero);
			numero++;
		}
		numero=1;
		do {
			System.out.println("El numero con do while es : " + numero);
			numero++;
		}while (numero <=10);
		
		for (int i=1 ; i<= 10; i++) {
			System.out.println("El numero con for es : " + i);
		}
		
		for (int i=4 ; i >= 1; i--) {
			System.out.println("El numero con for es : " + i);
		}
		
		//System.out.println(i);
	
		System.out.println("FIN DE PROGRAMA");	
	}
	
}

