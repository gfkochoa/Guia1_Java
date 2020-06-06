import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine();
		
		int cantidad = nombre.length(); // Cantidad de caracteres
		
		System.out.println("Cantidad de caracteres: " + cantidad);

	}

}
