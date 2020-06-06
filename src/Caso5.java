import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0;
		
		System.out.print("Ingrese primer numero: ");
		n1 = sc.nextFloat();
		
		System.out.print("Ingrese segundo numero: ");
		n2 = sc.nextFloat();
		
		float rpta1 = (n1 +n2)/2;
		float rpta2 = (float) (n1 + n1*0.2); // CAST -> Conversion de datos
		float rpta3 = n2 - n2*0.3f;
		
		System.out.println("------------------");
		System.out.println("Resultados");
		System.out.println("------------------");
		System.out.println("Promedio: " + rpta1);
		System.out.println("Número 1 aumentado en 20%: " + rpta2);
		System.out.println("Número 2 disminuido en 30%: " + rpta3);

	}

}
