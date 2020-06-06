import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int base = 0, altura = 0;
		
		System.out.print("Ingrese base: ");
		base = sc.nextInt();
		
		System.out.print("Ingrese altura: ");
		altura = sc.nextInt();
		
		int area = base * altura;
		int perimetro = 2 * (base + altura);
		
		System.out.println("Área del rectángulo: " + area);
		System.out.println("Perímetro: " + perimetro);

	}

}
