package logica;

public class Alumno {
	private String apellido;
	private int grupo;
	private double cuotaBase;
	private Fecha nacimiento;
	
	//constructor (fields)
	public Alumno() {}
	public Alumno(String apellido, int grupo, double cuotaBase, Fecha nacimiento) {
		super();
		this.apellido = apellido;
		this.grupo = grupo;
		this.cuotaBase = cuotaBase;
		this.nacimiento = nacimiento;
	}
	
	//To_String
	@Override
	public String toString() {
		return "alumno [apellido=" + apellido + ", grupo=" + grupo + ", cuotaBase=" + cuotaBase + ", nacimiento= " + nacimiento + "]";
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getGrupo() {
		return grupo;
	}
	public void setGrupo(int grupo) {
		this.grupo = grupo;
	}
	public double getCuotaBase() {
		return cuotaBase;
	}
	public void setCuotaBase(double cuotaBase) {
		this.cuotaBase = cuotaBase;
	}
	public Fecha getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(Fecha nacimiento) {
		this.nacimiento = nacimiento;
	}
	public double cuotaNeta() { // cuotaNeta() con if anidado
	    double monto = cuotaBase; // 100 %
	    if (grupo == 1 || grupo == 2)
	        monto = cuotaBase * 0.60; // 60 %
	    else if (grupo == 3 || grupo == 4)
	        monto = cuotaBase * 0.80; // 80 %
	    return monto;
	}
	
	

}
