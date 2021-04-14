import java.util.Locale;
import java.util.Scanner;

public class Exerc_proposto03_estrCond {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
			}
		
		
		sc.close();
	
	}

}
