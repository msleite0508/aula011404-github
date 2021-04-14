package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student_fix8;

public class notas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student_fix8 notas = new Student_fix8();
		System.out.print("Name: ");
		notas.name = sc.nextLine();
		System.out.println("Digite as notas:");
		notas.grade1 = sc.nextDouble();
		notas.grade2 = sc.nextDouble();
		notas.grade3 = sc.nextDouble();
		
		System.out.println();
		
//		System.out.println("FINAL GRADE = " + String.format("%.2f",notas.notaFinal()));
		System.out.printf("FINAL GRADE = %.2f%n",notas.notaFinal());

		if(notas.notaFinal() >=60) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
//			System.out.println("MISSING " + notas.missingPoints() + " POINTS");
			System.out.printf("MISSING %.2f POINTS", notas.missingPoints());

		}
		
				
		
		sc.close();
	}

}
