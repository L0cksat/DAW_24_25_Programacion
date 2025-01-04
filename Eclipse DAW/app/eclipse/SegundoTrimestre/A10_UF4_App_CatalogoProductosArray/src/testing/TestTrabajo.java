package testing;

import javabean.Trabajo;

public class TestTrabajo {

	public static void main(String[] args) {
		Trabajo trab1 = new Trabajo("T1", "IT", 10000, 20000);
		Trabajo trab2 = new Trabajo("T2", "IT", 10000, 20000);
		
		System.out.println(trab1.equals(trab2));

	}

}
