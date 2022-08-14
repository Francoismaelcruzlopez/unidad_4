package consola;
import logica.*;
public class principal_becado {

	public static void main(String[] args) {
		Fecha f= new Fecha(18,1,2000);
		Becado b1 = new Becado(100,"Perez", 1, 1000, f);
		Becado b2 = new Becado();
		b2.setApellido("Ruiz");
		b2.setGrupo(2);
		b2.setCuotaBase(2000);
		b2.setNacimiento(f);
		b2.setSaldoBeca(3000);
		
		Alumno a1 = new Alumno(b2.getApellido(), b2.getGrupo(), b2.getCuotaBase(), b2.getNacimiento());
		System.out.println("la cuota neta de a1 es: "+a1.cuotaNeta());
		System.out.println("la cuota de b1 es: "+b1.cuotaNeta());
	}

}
