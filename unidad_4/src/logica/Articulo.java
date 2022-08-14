package logica;

public class Articulo {

	private int codigo;
	private String nombre;
	private double precioCosto;
	private Fecha vencimiento;
	
	public Articulo() {}
	public Articulo(int codigo, String nombre, double precioCosto, Fecha vencimiento) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precioCosto = precioCosto;
		this.vencimiento = vencimiento;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecioCosto() {
		return precioCosto;
	}
	public void setPrecioCosto(double precioCosto) {
		this.precioCosto = precioCosto;
	}
	public Fecha getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(Fecha vencimiento) {
		this.vencimiento = vencimiento;
	}
	@Override
	public String toString() {
		return "codigo=" + codigo + ", nombre=" + nombre + ", precioCosto=" + precioCosto + ", vencimiento="
				+ vencimiento;
	}
	
	public double precioVenta() {
		return 10;
	}
	
	
}
