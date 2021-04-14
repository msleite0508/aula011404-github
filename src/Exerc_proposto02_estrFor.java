import java.util.Locale;
import java.util.Scanner;

public class Exerc_proposto02_estrFor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		int n = sc.nextInt();

		int countIn = 0;
		int countOut = 0;
		
		for(int i=0; i<n;i++) {
			int x = sc.nextInt();
			
			if(x >=10 && x <=20) {
				countIn = countIn + 1;
			}
			else {
				countOut = countOut + 1;
			}

		}	
		
		System.out.println(countIn + " in");
		System.out.println(countOut + " out");
	
		sc.close();

	}
	
}


