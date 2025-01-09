package javabean;

public class Empleado {
	/*
	 * ATRIBUTOS DE CLASE
	 * 
	 */
	public static final double SALARIO_MINIMO; 
	public static final double SALARIO_MAXIMO;
	
	static {
		SALARIO_MAXIMO = 1_000_000;
		SALARIO_MINIMO = 1_000;
	}
	
	//atributos de instancia o de objeto
	private int idEmpleado;
	private String nombre;
	private String apellidos;
	private double salario;
	private double complementos;
	private char genero;
	
	
	//constructor con todos los datos.
	public Empleado(int idEmpleado, String nombre, String apellidos, double salario, double complementos,
			char genero) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
		this.complementos = complementos;
		this.genero = genero;
	}
	//constructor sin nada (sin datos)
	public Empleado() {
		
	}
	
	//montonera de metodos
		//getter and setter
	
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalarioMenusal(double salario) {
		this.salario = salario;
	}
	public double getComplementos() {
		return complementos;
	}
	public void setComplementos(double complementos) {
		this.complementos = complementos;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", salarioMensual=" + salario + ", complementos=" + complementos + ", genero=" + genero + "]";
	}
	
	//metodos propios
	public String nombreCompleto() {
		return nombre + " " + apellidos;
	}
	
	public String literalGenero() {
		if (genero == 'H')
			return "Hombre";
		else
			return "Mujer";
	}
	
	public double salarioAnual() {
		return salario / 14;
	}
	
	public double salarioAnual(int meses) {
		return salario / meses;
	}
	
	public double salarioBrutoAnual() {
		return salario + complementos;
	}
	
	public String tipoSalario() {
		if (salarioBrutoAnual() < 20000)
			return "Salario bajo";
		
		if (salarioBrutoAnual() >= 20000 && salarioBrutoAnual() <= 40000)
			return "Salario Medio";
		else
			return "Salario Alto";
	}
	
	public static double tuSarlarioMenusal(double salario, int meses) {
		return salario / meses;
		
	}
	
	}
	
	

