package javabean;

public class Automovil {
	
	//Instanciamos los atributos de la clase solicitados.
	private String marca;
	private String anoModelo;
	private int motor;
	private String tipoCombustible;
	private String tipoAutomovil;
	private int numeroPuertas;
	private int cantidadAsientos;
	private int velocidadMax;
	private String color;
	private int velocidadActual;
	
	
	
	//Creamos los constructores, empezando con el que tiene todos los campos:
	public Automovil(String marca, String anoModelo, int motor, String tipoCombustible, String tipoAutomovil,
			int numeroPuertas, int cantidadAsientos, int velocidadMax, String color, int velocidadActual) {
		super();
		this.marca = marca;
		this.anoModelo = anoModelo;
		this.motor = motor;
		this.tipoCombustible = tipoCombustible;
		this.tipoAutomovil = tipoAutomovil;
		this.numeroPuertas = numeroPuertas;
		this.cantidadAsientos = cantidadAsientos;
		this.velocidadMax = velocidadMax;
		this.color = color;
		this.velocidadActual = velocidadActual;
	}


	//Y ahora el que no tiene nada (vacio):
	public Automovil() {
		super();
	}


	
	//Ahora establecemos los getter and setters:
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getAnoModelo() {
		return anoModelo;
	}


	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}


	public int getMotor() {
		return motor;
	}


	public void setMotor(int motor) {
		this.motor = motor;
	}


	public String getTipoCombustible() {
		return tipoCombustible;
	}


	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}


	public String getTipoAutomovil() {
		return tipoAutomovil;
	}


	public void setTipoAutomovil(String tipoAutomovil) {
		this.tipoAutomovil = tipoAutomovil;
	}


	public int getNumeroPuertas() {
		return numeroPuertas;
	}


	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}


	public int getCantidadAsientos() {
		return cantidadAsientos;
	}


	public void setCantidadAsientos(int cantidadAsientos) {
		this.cantidadAsientos = cantidadAsientos;
	}


	public int getVelocidadMax() {
		return velocidadMax;
	}


	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getVelocidadActual() {
		return velocidadActual;
	}


	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}


	//Realizamos el sobreescritura del toString:
	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", anoModelo=" + anoModelo + ", motor=" + motor + ", tipoCombustible="
				+ tipoCombustible + ", tipoAutomovil=" + tipoAutomovil + ", numeroPuertas=" + numeroPuertas
				+ ", cantidadAsientos=" + cantidadAsientos + ", velocidadMax=" + velocidadMax + ", color=" + color
				+ ", velocidadActual=" + velocidadActual + "]";
	}
	
	
	//Realizamos los metodos solicitados:
	
	//Metodo 1: Acelerar la velocidad:
		public boolean aumentarVelocidad(int cantidad) {
			if(velocidadActual > velocidadMax) {
				return false;
			}
			else {
				velocidadActual += cantidad;
				if(velocidadActual > velocidadMax) {
					return false;
				}
				else {
					return true;
				}
			}
		}
	
	//Metodo 2: Decelerar la velocidad:
		public boolean decrementarVelocidad(int cantidad) {
			if(cantidad > velocidadActual) {
				return false;
			}
			else {
				velocidadActual -= cantidad;
				return true;
			}
		}
	
	 //Metodo 3: Frenar:
		public int frenar(int velocidadActual) {
			velocidadActual = 0;
			return velocidadActual;
			
		}
	
	//Metodo 4: Calcular el tiempo estimado de llegada:
		public double tiempoEstimado(int kilometros) {
			double tiempoLlegada = (kilometros / velocidadActual);
			return tiempoLlegada;
		}
		
	//Metodo 5: Mostrar los atributos del automovil en pantalla:
		public String mostrarAtributos() {
			String atributos = (getMarca() + getAnoModelo() + getMotor() + getTipoCombustible() + getTipoAutomovil() + getNumeroPuertas() + getCantidadAsientos() + getColor());
			return atributos;
		}
}
