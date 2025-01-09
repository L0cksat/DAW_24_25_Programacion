package algoritimos;

public class Ejercicio03IfConChar {

	public static void main(String[] args) {
		//En vez de leer que no sabemos de momento
		//le asignamos un valor a genero y probamos con el
		//una variable en un moemnto determinado solo puede tener un valor
		// and && or ||
		char genero = 'H';
		
		if (genero == 'H' || genero == 'h')
			System.out.println("Eres un hombre");
		else
			if (genero == 'M' || genero == 'm')
				System.out.println("Eres una mujer");
			else
				System.out.println("Genero incorrecto");
		
		
	}

}
