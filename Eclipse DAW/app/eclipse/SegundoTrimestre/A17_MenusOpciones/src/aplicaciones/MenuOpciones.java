package aplicaciones;

import java.util.Scanner;

import javabean.Contacto;
import negocio.AgendaContactosImpl;
import negocio.IAgendaContacto;

public class MenuOpciones {
	private static Scanner leer = new Scanner(System.in);
	private static IAgendaContacto miagenda = new AgendaContactosImpl();

	public static void main(String[] args) {
		int opcion = 0;
		
		
		//controlador del menu
		do {
			
			opcion = pintarMenu();
			switch(opcion) {
			case 1: 
				procesarTodos();
				break;
			case 2: 
				procesarUno();
				break;
			case 3:
				procesarAlta();
				break;
			}
			
		}while (opcion !=4);
		System.out.println("FIN DE LA APLICACIÓN.");
		
		leer.close();
	}
	
	public static void procesarTodos() {
		for (Contacto contacto : miagenda.buscarTodos())
		System.out.println(contacto);
	}
	
	public static void procesarUno() {
		System.out.println("Dame el nombre a buscar");
		String nombre = leer.next();
		Contacto contacto = miagenda.buscarUno(nombre);
		if (contacto != null)
			System.out.println(contacto);
		else
			System.out.println("Este contacto NOOO existe");
	}

	public static void procesarAlta() {
		System.out.println("Dame el nombre y luego el telefono");
		String nombre = leer.next();
		String telefono = leer.next();
		Contacto contacto = new Contacto(nombre, telefono);
		if (miagenda.alta(contacto))
			System.out.println("Alta confirmada.");
		else
			System.out.println("Este contacto ya existe.");
}

	public static int pintarMenu() {
		int opcion = 0;
		System.out.println("1.- Todos");
		System.out.println("2.- Uno");
		System.out.println("3.- Alta");
		System.out.println("4.- Salir");
		
		System.out.println("\nTeclea una opcion, 4 para salir.");
		opcion = leer.nextInt();
		
		while (opcion < 1 || opcion > 4) {
			System.out.println("Opcion incorrecta, validos del 1 al 4");
			opcion = leer.nextInt();
		}
		
		return opcion;
		
	}
}
