package testing;

import javabean.Planeta;
import javabean.Planeta.tipoPlaneta;

public class TestPlaneta {

	public static void main(String[] args) {
		Planeta planeta1 = new Planeta("Tierra", 1, 5.972e24, 1.08e21, 12756, 150, tipoPlaneta.TERRESTRE, true);
		Planeta planeta2 = new Planeta("Neptuno", 16, 1.024e26, 6.254e13, 49244, 4502, tipoPlaneta.GASEOSO, false);
		
		
		System.out.println("-----PRIMER PLANETA----\n");
		System.out.println("Estos son los datos del primer planeta: " + planeta1.toString() + "\n");
		System.out.println("Este planeta es de tipo: " + planeta1.getTipoPlaneta() + "\n");
		System.out.println("La densidad del planeta: " + planeta1.getNombrePlaneta() + " es: " + planeta1.calcularDensidad() + " g/cm3\n");
		System.out.println("La distancia media al sol es: " + planeta1.getDistanciaSol() + " millones de km\n");
		
		if(planeta1.planetaExterior() == true) {
			System.out.println("El planeta " + planeta1.getNombrePlaneta() + " no se considera exterior.\n");
		}else
			System.out.println("El planeta " + planeta1.getNombrePlaneta() + " es considerado exterior.\n");
		
		System.out.println("-----SEGUNDO PLANETA----\n");
		System.out.println("Estos son los datos del segundo planeta: " + planeta2.toString() + "\n");
		System.out.println("Este planeta es de tipo: " + planeta2.getTipoPlaneta() + "\n");
		System.out.println("La densidad del planeta: " + planeta2.getNombrePlaneta() + " es: " + planeta2.calcularDensidad() + " g/cm3\n");
		System.out.println("La distancia media al sol es: " + planeta2.getDistanciaSol() + " millones de km\n");
		
		if(planeta2.planetaExterior() == true) {
			System.out.println("El planeta " + planeta2.getNombrePlaneta() + " no se considera exterior.\n");
		}else
			System.out.println("El planeta " + planeta2.getNombrePlaneta() + " es considerado exterior.\n");

	}

}
