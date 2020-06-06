import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Nombre del producto: ");
		String nombre = sc.nextLine();
		
		System.out.print("Precio: ");
		float precio = sc.nextFloat();
		
		System.out.print("Cantidad: ");
		int cantidad = sc.nextInt();
		
		float importe = precio * cantidad;
		float igv = importe * 0.18f;
		float descuento = importe * 0.03f;
		float total = importe + igv - descuento;
		
		System.out.println("Importe: " + df.format(importe));
		System.out.println("IGV: " + df.format(igv));
		System.out.println("Descuento: " + df.format(descuento));
		System.out.println("Total: " + df.format(total));

	}

}
