import java.util.Locale;
import java.util.Scanner;

public class Exerc_proposto03_estrFor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		int n = sc.nextInt();

		
		for(int i=0;i<n;i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double mediaP =  (a * 2.0 +  b * 3.0 + c * 5.0) / 10.0;
			
			System.out.printf("%.1f%n", mediaP);
		
		}

		sc.close();

	}
	
}


