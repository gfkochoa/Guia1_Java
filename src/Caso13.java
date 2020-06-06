import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingresar Nombre: ");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese Apellido: ");
		String apell = sc.nextLine();
		
		System.out.println("Alumno: " + nombre.concat(" ").concat(apell));

	}

}
