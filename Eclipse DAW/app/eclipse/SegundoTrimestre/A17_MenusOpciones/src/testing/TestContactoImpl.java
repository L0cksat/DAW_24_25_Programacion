package testing;
import javabean.Contacto;
import negocio.AgendaContactosImpl;
import negocio.IAgendaContacto;
public class TestContactoImpl {

	public static void main(String[] args) {
		IAgendaContacto miagenda = new AgendaContactosImpl();
		
	int cont = 0;
	System.out.println("\nLISTADO POR TELEFONO");
		for (Contacto contacto: miagenda.buscarPorTelefono("678678673")) {
				System.out.println(contacto.getNombre().toUpperCase());
				cont++;
		}
		if (cont == 0)
			System.out.println("De este telefono no hay contactos");
		
		System.out.println("\nLISTADO POR SUBCADENA");
		
		cont = 0;
		
		for (Contacto contacto: miagenda.buscarSubCadenaNombre("to")) {
				System.out.println(contacto.getNombre());
				cont++;
		}
		if (cont == 0)
			System.out.println("De esta búsqueda por cadena de caracters no hay contactos");
		
		System.out.println("\n----proceso terminado----");
	}

}
