package negocio;

import java.util.ArrayList;
import java.util.List;

import javabean.Contacto;

public class AgendaContactosImpl implements IAgendaContacto {
	private List<Contacto> lista;
	
	public AgendaContactosImpl(){
		lista = new ArrayList<Contacto>();
		cargarDatos();
	}
	
	
	private void cargarDatos() {
		lista.add(new Contacto("Eva", "678678678"));
		lista.add(new Contacto("Esteban", "678678678"));
		lista.add(new Contacto("Carlos", "679678178"));
		lista.add(new Contacto("Sara", "618578278"));
	}


	@Override
	public List<Contacto> buscarTodos() {
		return lista;
	}


	@Override
	public Contacto buscarUno(String nombre) {
		for (Contacto contacto: lista) {
			if(contacto.getNombre().equals(nombre))
			return contacto;
		}
		return null;
	}


	@Override
	public boolean alta(Contacto contacto) {
		if(contacto == null)
			return false;
		if(lista.contains(contacto))
		return false;
		else
			return lista.add(contacto);
	}


	@Override
	public int modificarContacto(Contacto contacto) {
		int posicion = lista.indexOf(contacto);
		if (posicion != -1) {
			lista.set(posicion, contacto);
			return 1;
		}else
			return 0;
			
	}


	@Override
	public int eliminarContacto(String nombre) {
		Contacto contacto = buscarUno(nombre);
		if (contacto != null) {
			lista.remove(contacto);
			return 1;
		}else
			return 0;
	}


	@Override
	public List<Contacto> buscarPorTelefono(String telefono) {
		List<Contacto> aux = new ArrayList<Contacto>();
		
		for (Contacto contacto: lista) {
			if (contacto.getTelefono().equals(telefono))
				aux.add(contacto);
		}
		return aux;
	}


	@Override
	public List<Contacto> buscarSubCadenaNombre(String subCadena) {
List<Contacto> aux = new ArrayList<Contacto>();
		
		for (Contacto contacto: lista) {
			if(contacto.getNombre().contains(subCadena))
				aux.add(contacto);
		}
		return aux;
	}
	
}
