import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Número de aprobados: ");
		int aprob = sc.nextInt();
		
		System.out.print("Número de desaprobados: ");
		int desaprob = sc.nextInt();
		
		System.out.print("Número de retirados: ");
		int ret = sc.nextInt();
		
		int total = aprob + desaprob + ret;
		float pa = (aprob * 100.0f) / total;
		float pd = (desaprob * 100.0f) / total;
		float pr = (ret * 100.0f) / total;
		
		System.out.println("Aprobados: " + df.format(pa) + "%");
		System.out.println("Desaprobados: " + df.format(pd) + "%");
		System.out.println("Retirados: " + df.format(pr) + "%");

	}

}
