package consola;
import logica.*;
import java.util.Scanner;
public class Principal_Articulo {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
			Fecha f1=new Fecha(12,3,2022);
			Articulo art1=new Articulo();
			Nacional n=new Nacional();
			Nacional n1=new Nacional("jabon", 1, 100.0, f1, "Montevideo", true  );
		//	System.out.println("Los datos de art1 son: " +art1.toString());
		//	System.out.println(n1);
			
			System.out.println("ingrese el nombre: ");
			String nomb = teclado.nextLine();
			n.setNombre(nomb);
			System.out.println("ingrese el codigo: ");
			int cod = teclado.nextInt();
			n.setCodigo(cod);
			System.out.println("el precio de costo es:");
			double precost = teclado.nextDouble();
			n.setPrecioCosto(precost);
			n.setVencimiento(f1);
			System.out.println("es subsidiado: ");
			boolean sub = teclado.nextBoolean();
			n.setSubsidiado(sub);
			System.out.println("ingrese el departamento: ");
			String dep = teclado.next();
			System.out.println("");
			n.setDepartamento(dep); 
			System.out.println(n); 

		
	}
	

}
