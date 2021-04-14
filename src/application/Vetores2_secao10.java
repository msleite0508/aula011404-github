package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product_vect2;

public class Vetores2_secao10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		Product_vect2 [] vect = new Product_vect2[n];
		
		for(int i=0;i<vect.length;i++) {
			String name = sc.nextLine();
			sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product_vect2(name, price);
		}
		
		double sum = 0;
		for(int i=0;i<vect.length;i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		
		sc.close();
	}

}
