package testing;

import javabean.Fiesta;

public class Principal {

	public static void main(String[] args) {
		
		//Declaramos los variables de fiesta
		Fiesta fiesta1 , fiesta2, fiesta3, fiesta4;
	
		//Estos sysos los he incluido para que en consola queda un poco más legible para el profesor.
		System.out.println("");
		System.out.println("*******************FIESTA 1 PARA PROBAR*******************");
		System.out.println("");
		
		/*
		 * Creamos el primer objeto y fijamos los valores de los parametros iniciales con el setter para que puedan ser probados,
		 * En este caso sería con el constructor sin los parametros.
		 */
		fiesta1 = new Fiesta();
		fiesta1.setInvitados(20);
		fiesta1.setBedidas(20);
		fiesta1.setBocadillos(20);
		fiesta1.setDireccion("Calle Diego Ramirez Pastor 109, 03181 Torrevieja.");
		fiesta1.setTipoFiesta("infantil");
		fiesta1.setFecha("27/11/2024");
		fiesta1.setHora("17:00");
		
		//Llamamos al método de prueba creado para realizar las pruebas.
		probarFiesta(fiesta1, 10, 6);
		
		System.out.println("");
		System.out.println("*******************FIESTA 2 PARA PROBAR*******************");
		System.out.println("");
		
		/*
		 * Creamos el siguiente objeto y fijamos los valores de los parametros iniciales con el setter del segundo objeto 
		 * para que puedan ser probados, en este caso sería con el constructor sin los parametros.
		 */
		
		fiesta2 = new Fiesta();
		fiesta2.setInvitados(10);
		fiesta2.setBedidas(10);
		fiesta2.setBocadillos(5);
		fiesta2.setDireccion("Calle La Paz N.º77, 03182 Torrevieja.");
		fiesta2.setTipoFiesta("cumpleaños");
		fiesta2.setFecha("29/11/2024");
		fiesta2.setHora("15:00");
		
		//Llamamos de nuevo al método de prueba creado para realizar las pruebas.
		probarFiesta(fiesta2, 15, 7);
		
		System.out.println("");
		System.out.println("*******************FIESTA 3 PARA PROBAR*******************");
		System.out.println("");
		
		/*
		 * Creamos el siguiente objeto, esta vez usando el constructor con atributos, nos fijamos los valores
		 * para que puedan ser probados.
		 */
		
		fiesta3 = new Fiesta("disfraces", "Avenida Robleda Nº177, 03184 Torrevieja.", 15, 30, 30, "1/12/2024", "20:00");
		
		//Llamamos de nuevo al método de prueba creado para realizar las pruebas.
		
		probarFiesta(fiesta3, 10, 3);
		
		System.out.println("");
		System.out.println("*******************FIESTA 4 PARA PROBAR*******************");
		System.out.println("");
		
		/*
		 * Creamos el siguiente objeto, esta vez usando el constructor con atributos, nos fijamos los valores
		 * para que puedan ser probados.
		 */
		
		fiesta4 = new Fiesta("infantil", "Calle Rodrigo N.º 57, 03184 Torrevieja.", 50, 50, 15, "30/11/2024", "14:00");
		
		//Llamamos por última vez al método de prueba creado para realizar las pruebas.
		
		probarFiesta(fiesta4, 30, 4);
	}
	
	/*
	 * Se crea este cabecera de método junto con los parametros para que se pueda probar distintos escenarios
	 * de las fiestas solicitados con distintos numeros enteros (dos con constructores sin valores en los parametros 
	 * y dos con valores de parametros), aquí he querido ampliar sobre las funcionalidades de lo que pedía el ejercicio.
	 * Así puedo dejar el código algo más limpio y funcional.
	 */
	public static void probarFiesta(Fiesta fiestaParaProbar, int cantidadInvitados, int cantCancelInvitados) {
		//Escribir todas las pruebas aquí adentro.
		System.out.println(fiestaParaProbar);
		System.out.println("");
		fiestaParaProbar.mostrarFiesta();
		fiestaParaProbar.mostrarFechaHoraDir();
		System.out.println("");
		fiestaParaProbar.invitar(cantidadInvitados);
		fiestaParaProbar.invitar();
		System.out.println("");
		fiestaParaProbar.cancelarInvitacion(cantCancelInvitados);
		fiestaParaProbar.cancelarInvitacion();
		System.out.println("");
		fiestaParaProbar.cuantoBebida();
		fiestaParaProbar.cuantoBocadillos();
		fiestaParaProbar.precioPersona();
		fiestaParaProbar.precioTotalFiesta();
		
	}
}
