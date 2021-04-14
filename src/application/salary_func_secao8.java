package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee_fix8;

public class salary_func_secao8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee_fix8 emp = new Employee_fix8();
		
		System.out.print("Name: ");
		emp.name =sc.nextLine();
		System.out.print("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.setTax(sc.nextDouble());
		
		System.out.println();
		System.out.println("Employee: " + emp);
		
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increasySalary(percentage);
		
		System.out.println();		
		System.out.println("Updated data: " + emp);
		
		sc.close();
	}

}
