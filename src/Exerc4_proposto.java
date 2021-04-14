import java.util.Locale;
import java.util.Scanner;

public class Exerc4_proposto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codpeca1,codpeca2,numpeca1,numpeca2;
		double valorUnitpeca1,valorUnitpeca2, totalPagar;
		
		codpeca1 = sc.nextInt();
		numpeca1 = sc.nextInt();
		valorUnitpeca1 = sc.nextDouble();
		
		codpeca2 = sc.nextInt();
		numpeca2 = sc.nextInt();
		valorUnitpeca2 = sc.nextDouble();
		
		totalPagar = valorUnitpeca1 * numpeca1 + valorUnitpeca2 * numpeca2;
		
		System.out.printf("VALOR A PAGAR = %.2f%n" ,totalPagar);
		
		sc.close();
	
	}

}
