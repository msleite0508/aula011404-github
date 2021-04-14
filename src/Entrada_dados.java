import java.util.Locale;
import java.util.Scanner;

public class Entrada_dados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

//		String x;
//		x = sc.next();
//		System.out.println("Voce digitou:  " + x);

//		int x;
//		x = sc.nextInt();
//		System.out.println("Voce digitou:  " + x);
//		
//		
//		sc.close();
//		

//		double x;
//		x = sc.nextDouble();
//		System.out.printf("Voce digitou: %.2f%n", x);
//		
//		
//		sc.close();

//		char x;
//		x = sc.next().charAt(0);
//		System.out.println("Voce digitou: "+ x);
//		
//		
//		sc.close();

		String x;
		int y;
		double z;

		System.out.println("Digite abaixo os dados");
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();

		System.out.println("Dados digitados");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		sc.close();

//		
	}

}
