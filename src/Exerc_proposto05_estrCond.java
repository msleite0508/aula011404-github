import java.util.Locale;
import java.util.Scanner;

public class Exerc_proposto05_estrCond {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double soma;

		if (codigo == 1) {
			soma = quantidade * 4.00;
		} else if (codigo == 2) {
			soma = quantidade * 4.50;
		} else if (codigo == 3) {
			soma = quantidade * 5.00;
		} else if (codigo == 4) {
			soma = quantidade * 2.00;
		} else {
			soma = quantidade * 1.50;
		}
		System.out.printf("Total: R$ %.2f%n", soma);
		sc.close();
	}

}
			
