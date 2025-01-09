package testing;

import javabean.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta(1000, "AHORRO", "Eva Goma", 1500);
		Cuenta cuenta2 = new Cuenta(2000, "NOMINA","Carlos Lopez" , 1000);

		System.out.println("\nAbono de 1000\n");
		cuenta1.abono(1000); //saldo = 2500
		System.out.println(cuenta1);
		
		System.out.println("\nExtracto de 300\n");
		System.out.println(cuenta1.extraer(300)); //true
		
		System.out.println("mi saldo ahora es 2.200 : " + cuenta1.getSaldo()); //saldo = 2200
		System.out.println("\nExtracto de 5000, no lo hace.\n");
		System.out.println(cuenta1.extraer(5000)); //false
		
		System.out.println("mi saldo ahora es 2.200 : " + cuenta1.getSaldo()); //saldo = 2200
		
		System.out.println("\nTRANSFERENCIA CORRECTA DE 1000\n");
		
		System.out.println(cuenta1.transferir(cuenta2, 1000)); //true
		System.out.println(cuenta1); //1200
		System.out.println(cuenta2); //2000
		
		System.out.println("\nTRANSFERENCIA INCORRECTA 5000\n");
		System.out.println(cuenta1.transferir(cuenta2, 5000)); //false
		System.out.println(cuenta1); //1200
		System.out.println(cuenta2); //2000
		
		
	}

	public static void abonar() {
		
	}
}
