package javabean;

public class Planeta {
	
	//Creamos la clase de tipo enum dentro de la clase Planeta.
	public enum tipoPlaneta{
		GASEOSO,
		TERRESTRE,
		ENANO
	};
	
	//Instanciamos los atributos a 0 y null.
	private String nombrePlaneta;
	private int cantidadSat;
	private double masa;
	private double volumen;
	private int diametro;
	private int distanciaSol;
	private tipoPlaneta tipoPlaneta;
	private boolean ObserSimpleVista;
	
	
	
	//Creamos el constructor con todos los campos selecionados.
	public Planeta(String nombrePlaneta, int cantidadSat, double masa, double volumen, int diametro, int distanciaSol,
			javabean.Planeta.tipoPlaneta tipoPlaneta, boolean obserSimpleVista) {
		super();
		this.nombrePlaneta = nombrePlaneta;
		this.cantidadSat = cantidadSat;
		this.masa = masa;
		this.volumen = volumen;
		this.diametro = diametro;
		this.distanciaSol = distanciaSol;
		this.tipoPlaneta = tipoPlaneta;
		ObserSimpleVista = obserSimpleVista;
	}

	
	//Creamos los getters and setters.
	public String getNombrePlaneta() {
		return nombrePlaneta;
	}





	public void setNombrePlaneta(String nombrePlaneta) {
		this.nombrePlaneta = nombrePlaneta;
	}





	public int getCantidadSat() {
		return cantidadSat;
	}





	public void setCantidadSat(int cantidadSat) {
		this.cantidadSat = cantidadSat;
	}





	public double getMasa() {
		return masa;
	}





	public void setMasa(double masa) {
		this.masa = masa;
	}





	public double getVolumen() {
		return volumen;
	}





	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}





	public int getDiametro() {
		return diametro;
	}





	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}





	public int getDistanciaSol() {
		return distanciaSol;
	}





	public void setDistanciaSol(int distanciaSol) {
		this.distanciaSol = distanciaSol;
	}





	public tipoPlaneta getTipoPlaneta() {
		return tipoPlaneta;
	}





	public void setTipoPlaneta(tipoPlaneta tipoPlaneta) {
		this.tipoPlaneta = tipoPlaneta;
	}





	public boolean isObserSimpleVista() {
		return ObserSimpleVista;
	}





	public void setObserSimpleVista(boolean obserSimpleVista) {
		ObserSimpleVista = obserSimpleVista;
	}

	
	//Sobreescribimos el toString.
	@Override
	public String toString() {
		return "Planeta [nombrePlaneta=" + nombrePlaneta + ", cantidadSat=" + cantidadSat + ", masa=" + masa
				+ ", volumen=" + volumen + ", diametro=" + diametro + ", distanciaSol=" + distanciaSol
				+ ", tipoPlaneta=" + tipoPlaneta + ", ObserSimpleVista=" + ObserSimpleVista + "]";
	}

	
	//METODOS PROPIOS.
	
	//Metodo 1: Mostrar atributos en pantalla.
	public String mostrarAtributros() {
		String atributos = (getNombrePlaneta() + " " + getCantidadSat() + " " + getMasa() + " " + getVolumen() + " " + getDiametro() + " " + getDistanciaSol());
		return atributos;
	}
	
	//Metodo 2: Calcular denisidad.
	public double calcularDensidad() {
		double calculo = (masa / volumen);
		return calculo;
	}
	
	//Metodo 3: Determinar si el planeta es exterior o no.
	public boolean planetaExterior() {
		if(distanciaSol > 509) {
			return false;
		}
		else
			return true;
	}
}
