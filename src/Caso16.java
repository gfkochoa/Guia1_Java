import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese horas trabajadas: ");
		int ht = sc.nextInt();
		
		System.out.print("Ingrese tarifa por hora: ");
		float tph = sc.nextFloat();
		
		float sueldo = ht * tph;
		float bono = sueldo * 0.05f;
		float total = sueldo + bono;
		float tdolar = total / 3.24f;
		
		System.out.println("Sueldo: " + df.format(sueldo));
		System.out.println("Bono: " + df.format(bono));
		System.out.println("Total: " + df.format(total));
		System.out.println("Total en dólares: " + df.format(tdolar));

	}

}
