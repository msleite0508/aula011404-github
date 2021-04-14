import java.util.Locale;
import java.util.Scanner;

public class Exerc5_proposto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		int num = sc.nextInt();
//		int horas = sc.nextInt();
//		double valor = sc.nextDouble();
//		double sal = horas * valor;
		
		int num,horas;
		double valorHora,sal;
		
		num = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		sal = horas * valorHora;
		
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = US %.2f%n", sal);
		
		
		sc.close();
	
	}

}
