package modelo;

import java.util.ArrayList;

import javabean.Trabajo;

public class TrabajoRepositorio {
	
	private ArrayList<Trabajo> lista;
	
	public TrabajoRepositorio() {
		lista = new ArrayList<Trabajo>();
		cargarDatos();
	}
	
	private void cargarDatos() {
	lista.add(new Trabajo("ST_MAN", "Vendedor Manager", 30000, 80000));
	lista.add(new Trabajo("ST_PRU", "Vendedor Manager", 30000, 80000));
	lista.add(new Trabajo("IT_PROG", "Programador", 30000, 80000));
	lista.add(new Trabajo("AD_PRESS", "Presidente", 30000, 80000));
}

	public ArrayList<Trabajo> buscarTodo(){
		return lista;
	}
	
	public boolean addTrabajo(Trabajo trabajo) {
		if (lista.contains(trabajo))
			return false;
		
		return lista.add(trabajo);
	}

	
}
