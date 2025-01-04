package modelo;

import java.util.ArrayList;

import javabean.Producto;

public class CatalogoProductosConArrayList {
	private ArrayList<Producto> lista;
	
	public CatalogoProductosConArrayList() {
		lista = new ArrayList<Producto>();
		
	}
	
	public boolean addProducto(Producto producto) {
		if(lista.contains(producto))
			return false;
		return lista.add(producto);
	}
	
	public boolean modificarProducto(Producto producto) {
		
		int posicion = lista.indexOf(producto);
		
		if (posicion == -1)
			return false;
		
		lista.set(posicion, producto);
		return true;
	}
	
	public boolean eliminarProducto(Producto producto) {
		return lista.remove(producto);
		
	}
	
	public Producto buscarUno(long codigoBarras) {
		for (Producto ele: lista) {
			if(ele.getCodigoBarras() == codigoBarras)
				return ele;
		}
		return null;
	}
	
	public ArrayList<Producto> buscarTodos(){
		return lista;
	}
	
	public ArrayList<Producto> buscarPorStockMayor(int cantidad){
		ArrayList<Producto> aux = new ArrayList<Producto>();
		for (Producto ele: lista) {
			if(ele.getCantidadStock() > cantidad)
				aux.add(ele);
		}
		return aux;
	}
}
