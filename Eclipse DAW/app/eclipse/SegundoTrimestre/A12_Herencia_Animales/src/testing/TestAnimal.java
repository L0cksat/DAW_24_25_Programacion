package testing;

import java.util.ArrayList;

import javabean.Animal;
import javabean.Gato;

public class TestAnimal {

	public static void main(String[] args) {
		//Creación de variables de tipo Animal, que instancian(new) objetos de Animal.
		Animal animal1 = new Animal(1, "HomoSapiens", 2);
		Animal animal2 = new Animal(2, "Ciempies", 100);
		
		//Creación de variables de tipo Gato, que instancian(new) objetos de Gato.
		Gato gato1 = new Gato(3, "Gato Felix", 4, 14);
		Gato gato2 = new Gato(4, "Gato con Botas", 4, 7);
		
		//Creación de variables de tipo Animal(clase padre), 
		//instanciando(new) objetos de Gato (clases hijo) 
		//***SOLO EN HERENCIA**
		
		Animal gato3 = new Gato(5, "Gato Montés", 4, 20);
		
		/*
		 * MOMENTO DE LA PROGRAMACIÓN DE UNA APLICACIÓN
		 * MOMENTO 1: Estoy tecleando
		 * 		Cuando a gato3 le pongo un punto que metodos veo
		 * MOMENTO 2: Estoy ejectuando
		 * 		Que metodos se ejecuta, el de quien
		 */
		System.out.println("DATOS DE GATO 3\n");
		gato3.sonido();
		gato3.saludar();
		System.out.println(gato3);
		((Gato)gato3).cancelarVidas(4);
		System.out.println(gato3);
		
		Gato gato4 = (Gato) gato3;
		
		System.out.println(gato4);
		
		
		
		System.out.println("Colección de gatos");
		ArrayList<Gato> censoGatos = new ArrayList<Gato>();
		censoGatos.add(gato1);
		censoGatos.add(gato2);
		censoGatos.add(new Gato(12, "GAto Síames", 4, 7));
		
		for (Gato gato: censoGatos) {
			System.out.println("Vidas = " + gato.getNumeroVidas());
		}
		

		System.out.println("DATOS ANIMAL 1\n");
		animal1.saludar();
		animal1.sonido();
		System.out.println(animal1);
		
		System.out.println("DATOS ANIMAL 2\n");
		animal2.saludar();
		animal2.sonido();
		System.out.println(animal2);
		
		
		System.out.println("DATOS GATO 1\n");
		gato1.saludar();
		gato1.sonido();
		gato1.aumentarVidas(3);
		System.out.println("El gato tiene ahora: " + gato1.getNumeroVidas() + " vidas");
		System.out.println(gato1);
		
		
	}

}
