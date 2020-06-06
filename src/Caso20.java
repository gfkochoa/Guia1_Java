import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese Precio de Compra: ");
		float pc = sc.nextFloat();
		
		float ganancia = pc * 0.42f;
		float pv = pc + ganancia;
		
		System.out.println("Precio de Venta: " + df.format(pv));

	}

}
