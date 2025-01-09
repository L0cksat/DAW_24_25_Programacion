package testing;

import javabean.JuegoElsa;

public class TestingGround {

	public static void main(String[] args) {
		
		//Crear la clase del Juego de Elsa.
		JuegoElsa juego1, juego2, juego3;
		
		System.out.println("Vamos a jugar un juego.\n");
		
		juego1 = new JuegoElsa(6, 7);
		jugarJuego(juego1);
		
		juego2 = new JuegoElsa(6, 9);
		jugarJuego(juego2);
		
		juego3 = new JuegoElsa (8, 4);
		jugarJuego(juego3);
		

	}
	public static void jugarJuego(JuegoElsa juegoParaJugar) {
		System.out.println("Vamos a ver si eres ángel o demonio con los número que has metido.\n");
		juegoParaJugar.sumaNumeros();
		System.out.println("El total de los numeros sumados son : " + juegoParaJugar.totalNumeros() + "\n");
		
		if(juegoParaJugar.sumaNumeros() == true)
			System.out.println("El numero es par... Eres ángel :)");
		else {
			System.out.println("El numero es impar... Eres demonio :(");
		}
		
		System.out.println("\nVamos a jugar otra.\n");
	}

}
