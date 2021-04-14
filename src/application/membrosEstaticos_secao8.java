package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class membrosEstaticos_secao8 {
//	public static final double PI = 3.14159; versao 1
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
//		Calculator calc = new Calculator(); versão 2 foi retirado para a versao 3
//		double c = calc.circumference(radius);versão 2 foi retirado para a versao 3
//		
//		double v = calc.volume(radius);versão 2 foi retirado para a versao 3
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);

		
		System.out.printf("Circumference: %.2f%n", c);
		
		System.out.printf("Volume: %.2f%n", v);
		
//		System.out.printf("PI: %.2f%n", calc.PI); versão 2 foi retirado para a versao 3
		
		System.out.printf("PI: %.2f%n", Calculator.PI);
		sc.close();
	}

	//versão 1
//	public static double circumference(double radius) {
//		return 2.0 * PI * radius;
//	}
//	
//	public static double volume(double radius) {
//		return 4.0 * PI * radius * radius * radius / 3.0;
//	}
	
	
}
