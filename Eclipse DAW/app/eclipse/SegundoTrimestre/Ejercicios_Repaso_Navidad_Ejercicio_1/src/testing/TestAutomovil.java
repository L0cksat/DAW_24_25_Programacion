package testing;

import javabean.Automovil;

public class TestAutomovil {

	public static void main(String[] args) {
		Automovil coche1 = new Automovil();
		
		coche1.setMarca("Opel");
		coche1.setAnoModelo("Meriva, 2010");
		coche1.setMotor(1398);
		coche1.setTipoCombustible("Diesel");
		coche1.setTipoAutomovil("Familiar");
		coche1.setNumeroPuertas(5);
		coche1.setCantidadAsientos(5);
		coche1.setVelocidadMax(150);
		coche1.setVelocidadActual(100);
		coche1.setColor("Gris");
		
		Automovil coche2 = new Automovil("Ford", "Focus, 2015", 1560, "Gasolina", "Ciudad", 5, 5, 160, "Azul", 70);
		
		System.out.println("------PRIMER VIAJE-----\n");
		System.out.println("Vamos a enfocarnos en este vehiculo: " + coche1.mostrarAtributos() + ".\n");
		System.out.println("Este es el vehiculo en cuestion: " + coche1.toString() + "\n");
		System.out.println("El coche actualmente viaja a una velocidad de: " + coche1.getVelocidadActual() + "km/h.\n");
		System.out.println("El vehiculo va a subir de velocidad.\n");
		coche1.aumentarVelocidad(20);
		System.out.println("La nueva velocidad actual del vehiculo es: " + coche1.getVelocidadActual() + "km/h.\n");
		System.out.println("El vehiculo va a subir de veloicidad.\n");
		coche1.aumentarVelocidad(30);
		System.out.println("La nueva velocidad actual del vehiculo es: " + coche1.getVelocidadActual() + "km/h.\n");
		System.out.println("El vehiculo va a subir de veloicidad.\n");
		coche1.aumentarVelocidad(20);
		System.out.println("la velocidad actual del vehiculo es: " + coche1.getVelocidadActual() + "km/h.\n");
		System.out.println("El vehiculo va a reducir su velocidad.\n");
		coche1.decrementarVelocidad(30);
		System.out.println("La nueva velocidad actual del vehiculo es: " + coche1.getVelocidadActual() + "km/h.\n");
		System.out.println("El vehiculo va a reducir su velocidad. \n");
		coche1.decrementarVelocidad(50);
		System.out.println("La nueva velocidad actual del vehiculo es: " + coche1.getVelocidadActual() + "km/h.\n");
		coche1.frenar();
		System.out.println("El vehiculo ha frenado por completo.\n");
		System.out.println("La nueva velocidad actual del vehiculo es: " + coche1.getVelocidadActual() + "km/h.\n");
		System.out.println("-----FIN DEL VIAJE, MUCHAS GRACIAS POR CONDUCIR SEGURO.-----");

	}

}
