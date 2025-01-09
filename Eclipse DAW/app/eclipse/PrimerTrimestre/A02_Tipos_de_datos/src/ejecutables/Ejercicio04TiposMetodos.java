package ejecutables;

public class Ejercicio04TiposMetodos {

	public static void main(String[] args) {
		// acceso a metodos staticos
		
		System.out.println(Math.sqrt(17));

		String dato = String.valueOf(12.4);
		System.out.println(dato);
		
		//Metodos de objeto/instancia
		
		String nombre = "andres";
		
		System.out.println(nombre.charAt(0));
		System.out.println(nombre.toUpperCase());
	}

}
