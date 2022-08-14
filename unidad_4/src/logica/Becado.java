package logica;

public class Becado extends Alumno {

	private double saldoBeca;
	
	//Constructores
	public Becado() {
		super();
	}
	public Becado(double saldoBeca,String apellido, int grupo, double cuotaBase, Fecha nacimiento) {
		super(apellido, grupo, cuotaBase, nacimiento);
	    this.saldoBeca=saldoBeca;
	}
	public double getSaldoBeca() {
		return saldoBeca;
	}
	public void setSaldoBeca(double saldoBeca) {
		this.saldoBeca = saldoBeca;
	}
	@Override
	public String toString() {
		return super.toString()+"saldoBeca=" + saldoBeca;
	}
	@Override
	public double cuotaNeta() {
		return (super.cuotaNeta()-saldoBeca);
	}
	


}
