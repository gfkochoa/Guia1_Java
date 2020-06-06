
public class Caso6 {

	public static void main(String[] args) {
		float rpta1 = 0, rpta2 = 0, rpta3 = 0, rpta4 = 0;
		
		rpta1 = (float) Math.pow(5, 3);
		rpta2 = (float) Math.pow(81, 1/2.0);
		rpta3 = (float) Math.pow(125, 1/3.0);
		rpta4 = (float) (Math.pow(256, 1/4.0) + Math.pow(25, 1/2.0));
		
		System.out.println("------------------");
		System.out.println("Resultados");
		System.out.println("------------------");
		System.out.println("Respuesta 1: " + rpta1);
		System.out.println("Respuesta 2: " + rpta2);
		System.out.println("Respuesta 3: " + rpta3);
		System.out.println("Respuesta 4: " + rpta4);
	}

}
