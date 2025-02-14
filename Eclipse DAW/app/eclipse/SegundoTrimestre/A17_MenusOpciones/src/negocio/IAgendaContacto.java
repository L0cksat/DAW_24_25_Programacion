package negocio;

import java.util.List;

import javabean.Contacto;

public interface IAgendaContacto {

	List<Contacto> buscarTodos();  // All con precaucion
	Contacto buscarUno(String nombre); 		//R: Read
	boolean alta(Contacto contacto); 		// C: Create
	int modificarContacto(Contacto contacto); // U: Update
	int eliminarContacto(String nombre); 	// D: Delete
	
	//Busquedas propias
	List<Contacto> buscarPorTelefono(String telefono);
	List<Contacto> buscarSubCadenaNombre(String subCadena);
	
	
}
