package logica;

public class Fecha {
	private int dia;
	private int anio;
	private int mes;
	
	//constructor (fields)
	public Fecha(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	//To_String
	@Override
	public String toString() {
		return "(dia=" + dia + ", mes=" + mes + ", anio=" + anio+")";
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	

	
}
