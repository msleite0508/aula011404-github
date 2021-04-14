import java.util.Locale;
import java.util.Scanner;

public class Exerc_proposto07_estrFor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		int n = sc.nextInt();

		
		for (int i=1;i<=n; i++) {
			int prim = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			
			
			System.out.printf("%d %d %d%n", prim,segundo,terceiro);


	

			}
				
	
		sc.close();

	}
	
}


