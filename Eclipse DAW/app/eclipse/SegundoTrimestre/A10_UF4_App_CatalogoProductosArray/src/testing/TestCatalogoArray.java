package testing;

import modelo.CatalogoProductosConArrayList;

public class TestCatalogoArray {

	public static void main(String[] args) {
		CatalogoProductosConArrayList milista = new CatalogoProductosConArrayList();
		//milista.addProducto(null)
		System.out.println(milista.buscarTodos());
	}

}
