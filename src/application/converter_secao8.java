package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class converter_secao8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double priceDollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		
		double conv = CurrencyConverter.converter(priceDollar, amount);
		
		System.out.printf("Amount to be pain in reais = %.2f", conv);
		sc.close();
	}

}
