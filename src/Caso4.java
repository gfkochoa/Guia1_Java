import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		// Entrada de datos
		Scanner sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0;
		
		System.out.print("Ingrese primer numero: ");
		n1 = sc.nextFloat();
		
		System.out.print("Ingrese segundo numero: ");
		n2 = sc.nextFloat();
		
		// Procesamiento
		float suma = n1 + n2;
		float resta = n1 - n2;
		float producto = n1 * n2;
		float division = n1 / n2;
		float resto_entero = n1 % n2;
		
		// Salida de resultados
		System.out.println("------------------");
		System.out.println("Resultados");
		System.out.println("------------------");
		System.out.println("Suma: " + suma);
		System.out.println("Resta: " + resta);
		System.out.println("Producto: " + producto);
		System.out.println("Division: " + division);
		System.out.println("Resto entero: " + resto_entero);

	}

}
