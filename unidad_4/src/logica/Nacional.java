package logica;

public class Nacional extends Articulo {
	private String departamento;
	private boolean subsidiado;
	
	//constructores
	public Nacional() {
		super();
	}
	public Nacional(String nombre , int codigo , double precioCosto , Fecha vencimiento, String departamento, boolean subsidiado) {
		super( codigo,nombre,precioCosto, vencimiento);
		this.departamento = departamento;
		this.subsidiado = subsidiado;
	}
	//Setters y Getters
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public boolean getSubsidiado() {
		return subsidiado;
	}
	public void setSubsidiado(boolean subsidiado) {
		this.subsidiado = subsidiado;
	}
	@Override
	public double precioVenta() {
		if (subsidiado==true) {
			return super.precioVenta();
		}
		else 
			if (subsidiado==false && (departamento.equals("Montevideo") || departamento.equals("montevideo"))) {
				return (super.precioVenta()*0.15+super.precioVenta());
			}
			else
				return (super.precioVenta()*0.10+super.precioVenta());
	}
	
	@Override
	public String toString() {
		return super.toString()+" departamento=" + departamento + ",\n subsidiado=" + subsidiado +",\n el precio de venta= "+precioVenta();
	}
	
}
