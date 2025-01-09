package algoritimos;

public class Ejercicio09AclaracionString {

	public static void main(String[] args) {
		/*PRIMERA CONSIDERACION
		 * dos tipos de variables por su contenido
		 * -las que contienen el valor asignado : 8 tipos primitivos
		 * -las variables de tipo clase: contienen una referencia al contenido del objeto
		 * UN direccion de memoria.
		 */
		
		/* SEGUNDA CONSIDERACION
		 * Para crear un ojeto de una clase se hace asi:
		 * Scanner leer = new Scanner(System.in); //construir un objeto
		 * 
		 * String, para construir un objeto de la clase String,
		 * generalmente, no se hace como los demás, una fora especial:
		 * 
		 * String nombre = "eva"; //propia de String, y de alguna clase más (Clases envolventes)
		 * 
		 * 
		 */
		
		/*TERCERA CONSIDERACION
		 * Los operadores de relacion: ==  != < <= > >=, en java siempre comparan el contenido de las
		 * variables: 
		 * 		- variables de tipo primitivo, comparamos lo valores reales
		 * 		-variables de tipo clase, como su contenido es una direccion de memoria, estamos
		 * 		comparando si dos objetos apuntan al mismo String
		 * 
		 * --- > usar un método de objeto de String llamado equals.
		 * 
		 */
		String cad1 = "andres", cad2 = "andres";
		String cadena = null;
		String cadena1 ="";
		
		
		if(cad1.equals(cad2))
			System.out.println("Son iguales");
		else
			System.out.println("Son distintos");
		
	}

}
