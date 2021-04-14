import java.util.Locale;
import java.util.Scanner;

public class Exerc_resolvido04_for_soma_consecutivosV1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int min;
		int max;
		
		if(x < y) {
			min = x;
			max = y;
		}else {
			min = y;
			max = x;
		}
		int soma = 0;
		for(int i = min + 1; i < max; i ++) {
			if(i % 2 != 0) {
				soma = soma + i;
			}
			
		}
		System.out.println(soma);
		
		sc.close();
	}

}
