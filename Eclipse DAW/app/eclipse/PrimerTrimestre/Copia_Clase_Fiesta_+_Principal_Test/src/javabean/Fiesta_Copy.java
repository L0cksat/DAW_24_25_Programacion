package javabean;

public class Fiesta_Copy {
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
	 * mediante la opcion "Source" (clic derecho).
	 */
	
	public Fiesta_Copy(String tipoFiesta, String direccion, int bocadillos, int bedidas, int invitados, String fecha,
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
	 * osea vacio, mediante la opcion "Source" (clic derecho).
	 */
	
	public Fiesta_Copy() {
		super();
	}

	/*
	 * Ahora creamos los getters y setters de la clase
	 * mediante la opcion "Source" (clic derecho).
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
	 * mediante la opcion "Source" (clic derecho).
	 */
	
	@Override
	public String toString() {
		return "Fiesta [tipoFiesta=" + tipoFiesta + ", direccion=" + direccion + ", bocadillos=" + bocadillos
				+ ", bedidas=" + bebidas + ", invitados=" + invitados + ", fecha=" + fecha + ", hora=" + hora + "]";
	}
	
	/*
	 * Ahora se crean los métodos propios para poder operar con la clase
	 * en el area de testing.
	 */
	
	
	/*
	 * Este método es para saber el número de invitados añadidos con el
	 * método sobrecargado.
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
	 * Este método sería el contador de invitados que han venido + 1.
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
	 * sobrecargando al método.
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
	 * Este método es el contador de invitados que han cancelado -1.
	 */
	public void cancelarInvitacion() {
		invitados --;
		System.out.println("Un invitado ha cancelado. El total de invitados actuales son : " + invitados);
		bebidas--;
		System.out.println("Se ha devuelto una bebida. El total actual de bebidas son : " + bebidas);
		bocadillos--;
		System.out.println("Se ha devuelto un bocadillo. El total actual de bocadillos son : " + bocadillos);
	}
	
	public void aumentarBebidas(int cantidad) {
		bebidas += cantidad;
		System.out.println("Has comprado más bebidas para la fiesta, el total actual de bebidas son : " + bebidas);
	}
	
	public void aumentarBocadillos(int cantidad) {
		bocadillos += cantidad;
		System.out.println("Has comprado más bocadillos para la fiesta, el total actual de bocadillos son : " + bocadillos);
	}

	public void reducirBebidas(int cantidad) {
		bebidas -= cantidad;
		System.out.println("Has devuelto algunas bebidas al supermercado, el total actual de bebidas son : " + bebidas);
	}
	
	public void reducirBocadillos(int cantidad) {
		bocadillos -= cantidad;
		System.out.println("Has devuelto algunas bocadillos al supermercado, el total actual de bocadillos son : " + bocadillos);
	}
	
	/*
	 * Este sería el método para calcular el precio por invitado/persona
	 * de la fiesta.
	 */
	
	public double precioPersona() {
		double precioPersona = ((bebidas * PRECIO_BEBIDA) + (bocadillos * PRECIO_BOCADILLO)) / invitados;
		System.out.println("El precio por persona de esta fiesta es de : " + precioPersona + "€");
		return precioPersona;
		
	}
	
	/*
	 * Este método hace el calculo del precio total de la fiesta.
	 */
	public double precioTotalFiesta() {
		double precioTotalFiesta = (bebidas * PRECIO_BEBIDA) + (bocadillos * PRECIO_BOCADILLO);
		System.out.println("El precio total de esta fiesta es de : " + precioTotalFiesta + "€");
		return precioTotalFiesta;
	}
	
	/*
	 * Este método muestra el tipo de fiesta.
	 */
	public String mostrarFiesta() {
		System.out.println("El tipo de fiesta es : " + tipoFiesta + ".");
		return tipoFiesta;
	}
	
	public String mostrarFechaHoraDir() {
		System.out.println("La fiesta se encuentra en : " + direccion + " " + "En la fecha : " + fecha + " " + "a las : " + hora + ".");
		return direccion;
	}
	
	/*
	 * Este método compara las bebidas con los invitados para saber si hay
	 * suficientes para los invitados o si hay demasiados.
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
	 * suficientes para los invitados o si hay demasiados.
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
