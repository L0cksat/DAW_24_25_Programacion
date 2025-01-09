package testing;

import javabean.Empleado;

public class TestEmpleado {

	public static void main(String[] args) {
		Empleado emp1 = new Empleado();
		
		Empleado emp2 = new Empleado(340, "Andres", "Lopez", 2_300, 250, 'H');
		
		emp1.setIdEmpleado(114);
		emp1.setNombre("Esteban");
		emp1.setApellidos("Caro Baroja");
		emp1.setComplementos(300);
		emp1.setGenero('H');
		emp1.setSalarioMenusal(2500);
		
		System.out.println("Apellido : " + emp1.getApellidos());
		System.out.println(emp1.getNombre());
		//System.out.println("Empleado[ idEmpleado : " + emp1.getIdEmpleado()
		//+ " nombre : " + emp1.getNombre() + "...]");
		
		System.out.println(emp1.salarioAnual(14));
		System.out.println(emp1.literalGenero());
		System.out.println(emp1.nombreCompleto());
		System.out.println(emp2);
		
	/*	emp1.apellidos = "ESCUDERO";
		emp1.salarioMenusal = 100_000;
		emp1.genero = 'J';
		emp1.idEmpleado = 45;
		
		emp2.nombre = "TOMAS";
		emp2.apellidos = "lopez";
		
		System.out.println(emp1.apellidos);
/*
 * 
 */
		
	}

}
