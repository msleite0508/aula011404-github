import java.util.Locale;
import java.util.Scanner;

public class Exerc_proposto01_estrCond {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		int N = sc.nextInt();

		
	if (N < 0) {
		System.out.println("NEGATIVO");
	}
	else {
		System.out.println("NÃO NEGATIVO");
	}

		sc.close();

	}

}
