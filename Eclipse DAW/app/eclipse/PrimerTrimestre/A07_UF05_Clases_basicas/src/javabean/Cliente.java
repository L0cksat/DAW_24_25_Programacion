package javabean;

public class Cliente {

	/*
	 * Los atributos de instancia/objeto son privados a la clase -> Es Java quien maneja
	 * el contenido de las variables
	 */
	private String cif;
	private String nombre;
	private double facturaAnual;
	private int numeroEmpleados;
	
	public Cliente(String cif, String nombre, double facturaAnual, int numeroEmpleados) {
		super();
		this.cif = cif;
		this.nombre = nombre;
		this.facturaAnual = facturaAnual;
		this.numeroEmpleados = numeroEmpleados;
		//getter and setter
	}
	public Cliente() {
		super();
	}
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getFacturaAnual() {
		return facturaAnual;
	}
	public void setFacturaAnual(double facturaAnual) {
		this.facturaAnual = facturaAnual;
	}
	public int getNumeroEmpleados() {
		return numeroEmpleados;
	}
	public void setNumeroEmpleados(int numeroEmpleados) {
		this.numeroEmpleados = numeroEmpleados;
	}
	@Override
	public String toString() {
		return "Cliente [cif=" + cif + ", nombre=" + nombre + ", facturaAnual=" + facturaAnual + ", numeroEmpleados="
				+ numeroEmpleados + "]";
	}
	
	//metodos propios
	
	
}
