import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese Precio de Compra: ");
		float pc = sc.nextFloat();
		
		float descuento = pc * 0.12f;
		float pv = pc - descuento;
		
		System.out.println("Precio de Venta: " + df.format(pv));

	}

}
