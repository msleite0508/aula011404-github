package application;

import entities.BusinessAccount_sec14_heranca;
import entities.SavingsAccount;
import entities.account_sec14_heranca;

public class Program_sec14_heranca {

	public static void main(String[] args) {

		//HERANÇA
//		BusinessAccount_sec14_heranca conta = new BusinessAccount_sec14_heranca();
//		conta.deposit(amount);
		
		account_sec14_heranca acc = new account_sec14_heranca(1001, "Alex", 0.00);
		BusinessAccount_sec14_heranca bacc = new BusinessAccount_sec14_heranca(1002, "Maria", 0.00, 500.00);
		
		//UPCASTING
		account_sec14_heranca acc1 = bacc;
		account_sec14_heranca acc2 = new BusinessAccount_sec14_heranca(1003,"bob", 0.00, 200.00);
		account_sec14_heranca acc3 = new SavingsAccount(1004, "Ana", 0.00, 0.01);
		
		//DOWNCASTING
		
		BusinessAccount_sec14_heranca acc4 = (BusinessAccount_sec14_heranca) acc2;
		acc4.getLoanLimit();
		//BusinessAccount_sec14_heranca acc5 = (BusinessAccount_sec14_heranca) acc3;
		
		if(acc3 instanceof BusinessAccount_sec14_heranca) {
			BusinessAccount_sec14_heranca acc5 = (BusinessAccount_sec14_heranca) acc3;
			acc5.setLoanLimit(500.00);
			System.out.println("Loan !");
		}
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update !");
		}
		
		account_sec14_heranca acc6 = new account_sec14_heranca(2000, "Alex", 1000.0);
		acc6.withDraw(200.0);
		System.out.println(acc6.getBalance());
		
		account_sec14_heranca acc7 = new SavingsAccount(2001, "Maria", 1000.0, 0.01);
		acc7.withDraw(200.0);
		System.out.println(acc7.getBalance());
		
		account_sec14_heranca acc8 = new BusinessAccount_sec14_heranca(2003, "Joao", 1000.0, 500.0);
		acc8.withDraw(200.0);
		System.out.println(acc8.getBalance());
		
		//polimorfismo
		account_sec14_heranca x = new account_sec14_heranca(2000, "Alex", 1000.0);
		x.withDraw(50.0);
		System.out.println(x.getBalance());
		
		account_sec14_heranca y = new SavingsAccount(2002, "Joao", 1000.0, 0.01);
		y.withDraw(50.0);
		System.out.println(y.getBalance());
	}

}
