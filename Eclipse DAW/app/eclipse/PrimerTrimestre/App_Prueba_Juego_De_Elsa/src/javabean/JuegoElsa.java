package javabean;

public class JuegoElsa {

	//declarar las variables que va a usar el juego
	private int primerNumero;
	private int segundoNumero;
	
	
	//preparo los constructores, el primero con todos los campos.
	public JuegoElsa(int primerNumero, int segundoNumero) {
		super();
		this.primerNumero = primerNumero;
		this.segundoNumero = segundoNumero;
		
	}

	
	//ahora el que no tiene nada.
	public JuegoElsa() {
		super();
	}

	//ahora los getter and setter de la clase.
	public int getPrimerNumero() {
	return primerNumero;
	}


	public void setPrimerNumero(int primerNumero) {
	this.primerNumero = primerNumero;
	}


	public int getSegundoNumero() {
	return segundoNumero;
	}


	public void setSegundoNumero(int segundoNumero) {
	this.segundoNumero = segundoNumero;
	}



	//ahora hacemos el toString.
	@Override
	public String toString() {
		return "JuegoElsa [primerNumero=" + primerNumero + ", segundoNumero=" + segundoNumero + 
				"]";
	}
	
	
	//Ahora los metodos propios de esta clase.
	
	public boolean sumaNumeros() {
		int sumaNumeros = primerNumero + segundoNumero;
		sumaNumeros %=2;
		if (sumaNumeros == 0) {
			return true;
		}else {
			return false ;
		}
	}
	
	public int totalNumeros() {
		int totalNumeros = primerNumero + segundoNumero;
		return totalNumeros;
	}
}
