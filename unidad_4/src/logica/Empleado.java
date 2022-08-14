package logica;

import java.util.Scanner;

public class Empleado {
	 
	  private String cedula;
	  private String nombre;
	  private double sueldo;
	  private Fecha fechaIngreso; 
	  
	   public Empleado(String c,String n, double s, Fecha fI) {
			cedula=c;
			nombre=n;
			sueldo=s;
			fechaIngreso=fI;
	    	
      }
//------------------------------------
		public Empleado(){
	    
	  }
		public String getCedula(){
	    return cedula;
	  }
		public String getNombre(){
	    return nombre;
	  }
		public double getSueldo(){
	    return sueldo;
	  }
		public Fecha getFechaIngreso(){
		    return fechaIngreso;
						}
	  
//------------------------------------
		public void setCedula(String c){
			this.cedula=c;  
	  }
		public void setNombre(String n){
			this.nombre=n;  
	  }
		public void setSueldo(double s){
			this.sueldo=s;  
	  }
		public void setFechaIngreso(Fecha fI){
			this.fechaIngreso=fI;
					}
	  
//------------------------------------
		//Metodo especificos
//fecha actual
		public int antiguedad(Fecha f) {
			return (f.getAnio()-fechaIngreso.getAnio());
		}
//------------------------------------
	  @Override
	  public String toString(){
	    return("Cedula: " +cedula+
	          " Nombre: " +nombre+
	          " Sueldo: " +sueldo +
	          " Fecha Ingreso; " + fechaIngreso);
	  }
	 
	 
}
