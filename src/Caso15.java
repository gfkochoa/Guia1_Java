import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso15 {

	public static void main(String[] args) {
		// 100 soles -> 100 / 3.2
		// 100 dólares -> 100 * 3.2
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Cantidad: ");
		int cantidad = sc.nextInt();
		
		System.out.print("Precio: ");
		float precio = sc.nextFloat();
		
		float importe1, importe2, importe3;
		importe1 = cantidad * precio;
		importe2 = importe1 / 3.24f;
		importe3 = importe1 / 3.75f;
		
		System.out.println("Importe en soles.....: " + df.format(importe1));
		System.out.println("Importe en dólares...: " + df.format(importe2));
		System.out.println("Importe en euros.....: " + df.format(importe3));

	}

}
