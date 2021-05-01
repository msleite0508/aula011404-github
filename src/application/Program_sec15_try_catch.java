package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program_sec15_try_catch {

	public static void main(String[] args) {

		method1();
		System.out.println("End of program");
		
	}
	
	public static void method1() {
		
		System.out.println("******** Method1 start **********");
		method2();
		System.out.println("******** Method1 end **********");

	}
	
	public static void method2() {
		System.out.println("******** Method2 start **********");
		Scanner sc = new Scanner(System.in);
		
		try{
		String[] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
		}	
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position !");
			e.printStackTrace();
			sc.hasNext();
		}
		catch (InputMismatchException e) {
			System.out.println("Input Error !");
		}
		
		sc.close();
		System.out.println("******** Method2 end **********");
	}

}
