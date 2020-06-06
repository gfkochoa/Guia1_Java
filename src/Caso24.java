import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese monto 1: ");
		float monto1 = sc.nextFloat();
		
		System.out.print("Ingrese monto 2: ");
		float monto2 = sc.nextFloat();
		
		System.out.print("Ingrese monto 3: ");
		float monto3 = sc.nextInt();
		
		float rpta1 = (monto1 / 5) + (monto2 * 0.2f);
		float rpta2 = (monto3 + monto3 * 0.6f) / 2;
		float rpta3 = (monto1 + monto2 + monto3) * 0.92f;
		
		System.out.println("La quinta parte del primer monto más el 20% del segundo monto: " + df.format(rpta1));
		System.out.println("La mitad del aumento en 60% del tercer monto: " + df.format(rpta2));
		System.out.println("Disminuya en 8% la suma de los tres montos: " + df.format(rpta3));
		

	}

}
