import java.util.Locale;
import java.util.Scanner;

public class Exemplo__estrut_repetitiva_while {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com um número: ");
		int x = sc.nextInt();
		int soma = 0;

		while (x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}

		System.out.println("SOMA: " + soma);
		sc.close();

	}

}
