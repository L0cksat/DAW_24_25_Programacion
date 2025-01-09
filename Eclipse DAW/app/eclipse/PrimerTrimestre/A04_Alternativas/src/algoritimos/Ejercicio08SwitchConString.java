package algoritimos;

public class Ejercicio08SwitchConString {

	public static void main(String[] args) {
		String opcion = "wey";
		
		switch(opcion) {
		case "editar":
			System.out.println("Estamos editando");
			break;
		case "ver":
			System.out.println("Estamos viendo");
			break;
		case "alta":
			System.out.println("Estamos dando de alta");
			break;
		default:
			System.out.println("opcion erroneo");
		}

	}

}
