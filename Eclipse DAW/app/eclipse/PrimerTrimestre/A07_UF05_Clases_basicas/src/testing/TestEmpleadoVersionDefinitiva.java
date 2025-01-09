package testing;

import javabean.Empleado;

public class TestEmpleadoVersionDefinitiva {

	public static void main(String[] args) {
		Empleado emp1, emp2, emp3; 

		emp1 = new Empleado();
		emp1.setApellidos("Lopez Carrion");
		emp1.setComplementos(2000);
		emp1.setGenero('M');
		emp1.setIdEmpleado(218);
		emp1.setNombre("Eva");
		emp1.setSalarioMenusal(23000);
		
		System.out.println("literal genero : " + emp1.literalGenero());
		System.out.println("Salario Bruto Anual : " + emp1.salarioBrutoAnual());
		System.out.println("Tipo de salario : " + emp1.tipoSalario());
		
		emp2 = new Empleado(120, "Andres", "Lopez Perez", 45000, 5000, 'H');
		
		System.out.println("literal genero : " + emp2.literalGenero());
		System.out.println("Salario Bruto Anual : " + emp2.salarioBrutoAnual());
		System.out.println("Tipo de salario : " + emp2.tipoSalario());
		
		System.out.println(emp1);
		System.out.println(emp2.nombreCompleto() + " " + emp2.literalGenero());
		
		System.out.println(Empleado.SALARIO_MINIMO);
		
		System.out.println("Mi salario en 14 es  : " + Empleado.tuSarlarioMenusal(34987, 14));
		System.out.println("Mi salario en 14 es  : " + Empleado.tuSarlarioMenusal(34987, 12));
		System.out.println("Mi salario en 14 es  : " + Empleado.tuSarlarioMenusal(34987, 16));
		
		String numero = String.valueOf(12);
		
		System.out.println(numero);
		
		
		
		
	}

}
