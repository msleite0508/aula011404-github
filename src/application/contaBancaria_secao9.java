package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria_secao9;

public class contaBancaria_secao9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ContaBancaria_secao9 conta;
		
		System.out.print("Enter number number: ");
		int number = sc.nextInt();
		System.out.print("Enter number holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			conta = new ContaBancaria_secao9(number, holder,initialDeposit);
		}else {
			conta = new ContaBancaria_secao9(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		conta.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		conta.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		sc.close();
	}

}
