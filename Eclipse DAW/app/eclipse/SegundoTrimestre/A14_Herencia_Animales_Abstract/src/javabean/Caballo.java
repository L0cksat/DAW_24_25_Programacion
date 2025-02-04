package javabean;

public class Caballo extends AbstractAnimal {
	private double velocidad;

	
	
	public Caballo(int matricula, String nombreCientifico, int numeroPatas, double velocidad) {
		super(matricula, nombreCientifico, numeroPatas);
		this.velocidad = velocidad;
	}

	
	public Caballo() {
		super();
	}
	
	
	
	@Override
	public String toString() {
		return "Caballo [matricula=" + matricula + ", nombreCientifico=" + nombreCientifico + ", numeroPatas="
				+ numeroPatas + ", velocidad=" + velocidad + "]";
	}


	public double getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}


	@Override
	public void saludar() {
		System.out.println("Soy caballo de carreras y corro tela.");
		
	}

	@Override
	public void sonido() {
		System.out.println("Yo RELINCHO!!!");
		
	}
}
