import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número: ");
		int n = sc.nextInt();
		
		// Sumatoria, n = 5, s = 1 + 2 + 3 + 4 + 5 -> 15
		
		int suma = (n * (n + 1)) / 2;
		
		System.out.println("La sumatoria es: " + suma);

	}

}
