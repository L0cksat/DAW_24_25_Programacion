package javabean;

public class Fiesta {
	//Creamos los atributos constantes de la clase.
	
	public static final double PRECIO_BEBIDA;
	public static final double PRECIO_BOCADILLO;
	
	static {
		PRECIO_BEBIDA = 2.0;
		PRECIO_BOCADILLO = 3.0;
	}
	
//Instanciamos los atributos de la clase.
	
	private String tipoFiesta;
	private String direccion;
	private int bocadillos;
	private int bebidas;
	private int invitados;
	private String fecha;
	private String hora;
	
	/*
	 * Creamos el constructor con todos los atributos seleccionados
	 * mediante la opción "Source" (clic derecho).
	 */
	
	public Fiesta(String tipoFiesta, String direccion, int bocadillos, int bedidas, int invitados, String fecha,
			String hora) {
		super();
		this.tipoFiesta = tipoFiesta;
		this.direccion = direccion;
		this.bocadillos = bocadillos;
		this.bebidas = bedidas;
		this.invitados = invitados;
		this.fecha = fecha;
		this.hora = hora;
	}

	/*
	 * Creamos el constructor sin ninguno de los atributos selccionados
	 * osea vacio, mediante la opción "Source" (clic derecho).
	 */
	
	public Fiesta() {
		super();
	}

	/*
	 * Ahora creamos los getters y setters de la clase
	 * mediante la opción "Source" (clic derecho).
	 */
	
	public String getTipoFiesta() {
		return tipoFiesta;
	}

	public void setTipoFiesta(String tipoFiesta) {
		this.tipoFiesta = tipoFiesta;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getBocadillos() {
		return bocadillos;
	}

	public void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}

	public int getBedidas() {
		return bebidas;
	}

	public void setBedidas(int bedidas) {
		this.bebidas = bedidas;
	}

	public int getInvitados() {
		return invitados;
	}

	public void setInvitados(int invitados) {
		this.invitados = invitados;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	/*
	 * Ahora añadimos el toString reescrito para esta clase
	 * mediante la opción "Source" (clic derecho).
	 */
	
	@Override
	public String toString() {
		return "Fiesta [tipoFiesta=" + tipoFiesta + ", direccion=" + direccion + ", bocadillos=" + bocadillos
				+ ", bedidas=" + bebidas + ", invitados=" + invitados + ", fecha=" + fecha + ", hora=" + hora + "]";
	}
	
	/*
	 * Ahora se crean los MÉTODOS PROPIOS para poder operar con la clase
	 * en el area de testing. Quiero añadir que aparte de los métodos propios que se
	 * piden en el enunciado, me he inspirado y he hecho algunos otros métodos que me
	 * resultaban interestantes y las quisé probar.
	 */
	
	
	/*
	 * Este método es para saber el número de invitados añadidos con el
	 * método sobrecargado, además en el mismo proceso añadimos las bebidas
	 * y bocadillos para los invitados añadidos.
	 */
	public void invitar(int cantidad) {
		invitados += cantidad;
		System.out.println("Se ha añadido invitados. El total de invitados actuales son : " + invitados);
		bebidas += cantidad;
		System.out.println("Se ha comprado mas bebidas para los invitados, el total de bebidas actuales son : " + bebidas);
		bocadillos += cantidad;
		System.out.println("Se ha comprado mas bocadillos para los invitados, el total de bocadillos actuales son: " + bocadillos);
		
	}	
	
	/*
	 * Este método sería el contador de invitados que han venido + 1, además en el mismo 
	 * proceso añadimos una bebida y un bocadillo al invitado añadido.
	 */
	public void invitar() {
		invitados++;
		System.out.println("Se ha añadido un invitado mas. El total de invitados actuales son : " + invitados);
		bebidas++;
		System.out.println("Se ha comprado una bebida mas. El total de bebidas actuales son : " + bebidas);
		bocadillos++;
		System.out.println("Se ha comprado un bocadillo mas. El total de bocadillos actuales son : " + bocadillos);
	}
	
	/*
	 * Este método es para saber el número de invitados restados,
	 * sobrecargando al método, además en el mismo proceso añadimos las bebidas
	 * y bocadillos para los invitados añadidos.
	 */
	public void cancelarInvitacion(int cantidad) {
		invitados -= cantidad;
		System.out.println("Hay varios invitados que han cancelado. El total de invitados actuales son : " + invitados);
		bebidas -= cantidad;
		System.out.println("Se ha devuelto algunas bebidas. El total de bebidas actuales son : " + bebidas);
		bocadillos -= cantidad;
		System.out.println("Se ha devuelto algunos bocadillos. El total de bocadillos actuales son : " + bocadillos);
		
		}

	/*
	 * Este método es el contador de invitados que han cancelado -1, además en el mismo 
	 * proceso añadimos una bebida y un bocadillo al invitado añadido.
	 */
	public void cancelarInvitacion() {
		invitados --;
		System.out.println("Un invitado ha cancelado. El total de invitados actuales son : " + invitados);
		bebidas--;
		System.out.println("Se ha devuelto una bebida. El total actual de bebidas son : " + bebidas);
		bocadillos--;
		System.out.println("Se ha devuelto un bocadillo. El total actual de bocadillos son : " + bocadillos);
	}
	
	/*
	 * Este sería el método para calcular el precio (en euros) por invitado/persona
	 * de la fiesta.
	 */
	public double precioPersona() {
		double precioPersona = ((bebidas * PRECIO_BEBIDA) + (bocadillos * PRECIO_BOCADILLO)) / invitados;
		System.out.println("El precio por persona de esta fiesta es de : " + precioPersona + "€");
		return precioPersona;
		
	}
	
	/*
	 * Este método hace el cálculo del precio total (en euros) de la fiesta.
	 */
	public double precioTotalFiesta() {
		double precioTotalFiesta = (bebidas * PRECIO_BEBIDA) + (bocadillos * PRECIO_BOCADILLO);
		System.out.println("El precio total de esta fiesta es de : " + precioTotalFiesta + "€");
		return precioTotalFiesta;
	}
	
	
	 //Este método muestra el tipo de fiesta.
	 
	public String mostrarFiesta() {
		System.out.println("El tipo de fiesta es : " + tipoFiesta + ".");
		return tipoFiesta;
	}
	
	//Este método muestra la dirección, fecha y hora de la fiesta en cuestión.
	
	public String mostrarFechaHoraDir() {
		System.out.println("La fiesta se encuentra en : " + direccion + " " + "En la fecha : " + fecha + " " + "a las : " + hora + ".");
		return direccion;
	}
	
	/*
	 * Este método compara las bebidas con los invitados para saber si hay
	 * suficientes para los invitados, si hay demasiados o si faltan.
	 */
	public void cuantoBebida() {
		if(bebidas < invitados) {
			System.out.println("No hay suficientes bebidas para los invitados.");
		} else if(bebidas > invitados) {
			System.out.println("Hay demasiadas bebidas para los invitados.");
		} else {
			System.out.println("Hay suficientes bebidas para los invitados.");
		}
		
	}
	
	/*
	 * Este método compara las bocadillos con los invitados para saber si hay
	 * suficientes para los invitados, si hay demasiados o si faltan.
	 */
	public void cuantoBocadillos() {
		if(bocadillos < invitados) {
			System.out.println("No hay suficientes bocadillos para los invitados.");
		} else if(bocadillos > invitados) {
				System.out.println("Hay demasiados bocadillos para los invitados.");
		} else {
			System.out.println("Hay suficientes bocadillos para los invitados.");
		}
	}
	
}
