package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class retangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangle ret = new Retangle();
		
		System.out.println("Enter retangle width and heigth:");
		ret.width = sc.nextDouble();
		ret.height = sc.nextDouble();
		
		System.out.println();
		System.out.println(ret);
		
		
		
		
		sc.close();
		
	
	}

}
