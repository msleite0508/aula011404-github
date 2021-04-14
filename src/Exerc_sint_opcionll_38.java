import java.util.Locale;
import java.util.Scanner;

public class Exerc_sint_opcionll_38 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite os minutos: ");
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		
		if(minutos > 100) {
			conta += (minutos - 100) * 2.00;
		}
		System.out.printf("Valor a pagar R$ %.2f%n", conta);

		sc.close();
	}
	

}
