package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.BusinessAccount_sec14_heranca;
import entities.SavingsAccount;
import entities.account_sec14_heranca;

public class Program_sec14_classesAbstratas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<account_sec14_heranca> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Maria", 500.00, 0.01));
		list.add(new BusinessAccount_sec14_heranca(1002, "Ana", 1000.00, 400.0));
		list.add(new SavingsAccount(1003, "Maria", 500.00, 0.01));
		list.add(new BusinessAccount_sec14_heranca(1004, "Ana", 1000.00, 400.0));
		
		Double sum = 0.0;
		for(account_sec14_heranca acc : list) {
			sum += acc.getBalance();
				
		}
		System.out.printf("Total balance: %.2f", sum);
		System.out.println();
		
		for(account_sec14_heranca acc : list) {
			acc.deposit(10.00);
		}
		
		for(account_sec14_heranca acc : list) {
			System.out.printf("Update balance for account: %d: %.2f%n", acc.getNumber(),acc.getBalance());
		}
		
		
	}

}
