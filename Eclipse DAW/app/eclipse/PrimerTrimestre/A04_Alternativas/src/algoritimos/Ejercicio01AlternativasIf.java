package algoritimos;

public class Ejercicio01AlternativasIf {

	public static void main(String[] args) {
		int edad = 12;
		// Solo If una sola sentencia
		if (edad >= 18)
			System.out.println("mayor de edad");
		
		//SOLO IF MAS DE UNA SENTENCIA
		if (edad >= 18) {
			System.out.println("Mayor de edad");
			System.out.println("y eres adulto");
		}
		
		//rama if y rama else solo una sentencia
		
		if (edad >= 18)
			System.out.println("Eres muu mayor");
		else
			System.out.println("Eres muu pequeño.");
		
		//rama if y rama else con mas de una sentencia
		
				if (edad >= 18) {
					System.out.println("Eres muu mayor");
					System.out.println("y eres senior");
				}
				else {
					System.out.println("Eres muu pequeño.");
					System.out.println("y chiquitin");
				}
				
				if (edad >= 18) {
					System.out.println("porras");
					edad++;
				}else {
					System.out.println("rama else");
					edad *= 7;
				}
				
		System.out.println("FIN DE PROGRAMA.");
			

	}

}
