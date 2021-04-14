import java.util.Locale;
import java.util.Scanner;

public class Exerc_proposto02_estrCond {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		
		if(N1 % N2 == 0 || N2 % N1 == 0)
			System.out.println("São multiplos");
		else {
			System.out.println("Não são multiplos");
		}
		
		sc.close();
	
	}

}
