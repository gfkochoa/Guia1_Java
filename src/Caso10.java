import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = 0;
		
		System.out.print("Radio: ");
		r = sc.nextInt();
		
		float area = (float) (Math.pow(r, 2) * 3.1416);
		float perimetro = 2 * r * 3.1416f;
		
		System.out.println("�rea del c�rculo: " + area);
		System.out.println("Per�metro: " + perimetro);

	}

}
