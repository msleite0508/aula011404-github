import java.util.Locale;
import java.util.Scanner;

public class Exerc_resolvido02_estrCond {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1,nota2,notafinal;
		
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		
		notafinal = nota1 + nota2;
		
		System.out.printf("NOTA FINAL =  %.1f%n", notafinal);
		
		if(notafinal < 60.0) {
			System.out.println("REPROVADO");
		}
		sc.close();
	}

}
