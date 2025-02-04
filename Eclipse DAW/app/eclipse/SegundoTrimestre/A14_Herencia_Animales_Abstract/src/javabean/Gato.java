package javabean;

import lombok.NoArgsConstructor;


public class Gato extends AbstractAnimal{
	
	private int numeroVidas;


	public Gato(int matricula, String nombreCientifico, int numeroPatas, int numeroVidas) {
		super(matricula, nombreCientifico, numeroPatas);
		this.numeroVidas = numeroVidas;
	}


	public Gato() {
		super();
	}
	

	public int getNumeroVidas() {
		return numeroVidas;
	}


	public void setNumeroVidas(int numeroVidas) {
		this.numeroVidas = numeroVidas;
	}


	@Override
	public String toString() {
		return "Gato [matricula=" + matricula + ", nombreCientifico=" + nombreCientifico + ", numeroPatas="
				+ numeroPatas + ", numeroVidas=" + numeroVidas + "]";
	}


	@Override
	public void sonido() {
		System.out.println("Soy un Gato y digo MIAUUUU!!");
	}

	

	@Override
	public void saludar() {
		System.out.println("Soy un Gato y te saludo");
		
	}


	public void aumentarVidas(int cantidad) {
		numeroVidas += cantidad;
	}


	public void cancelarVidas(int cantidad) {
		if ((numeroVidas - cantidad) <= 0)
			System.out.println("Creo que la has palmao.");
		else
			numeroVidas -= cantidad;
	}
	
}
