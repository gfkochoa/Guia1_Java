import java.util.Scanner;

public class Caso22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nota 1: ");
		int nota1 = sc.nextInt();
		
		System.out.print("Ingrese nota 2: ");
		int nota2 = sc.nextInt();
		
		System.out.print("Ingrese nota 3: ");
		int nota3 = sc.nextInt();
		
		float promp = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10.0f;
		
		System.out.println("Promedio: " + promp);

	}

}
