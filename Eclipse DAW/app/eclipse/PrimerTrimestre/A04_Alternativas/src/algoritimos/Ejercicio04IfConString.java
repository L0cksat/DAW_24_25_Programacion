package algoritimos;

public class Ejercicio04IfConString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//las distintas opciones de un algoritmo declarado como String
		
		String opcion = "editar"; // editar, ver, alta
		/*
		if(opcion == "editar")
			System.out.println("Han teclado la opcion editar" );
		else
			if (opcion == "ver")
				System.out.println("Han teclado la opcion ver");
			else
				System.out.println("Han teclado la opcion alta");
		*/
		if(opcion.equals("editar"))
			System.out.println("Han teclado la opcion editar" );
		else
			if (opcion.equals("ver"))
				System.out.println("Han teclado la opcion ver");
			else
				System.out.println("Han teclado la opcion alta");
		
		String opcion2 = new String("editar");
		
		if(opcion == opcion2)
			System.out.println("Los dos tienen editar");
		else
			System.out.println("Contienen cadenas de caracteres distintas");
		if(opcion.equals(opcion2))
			System.out.println("LOS DOS CONTIENEN IGUALES");
		else
			System.out.println("SON DISTINTOS");
		
		System.out.println("Fin de programa");

	}

}
