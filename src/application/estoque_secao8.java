package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class estoque_secao8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Price: ");
		Double price = sc.nextDouble();
		
		
		
		Product product = new Product(name, price);
//		
//		product.setName("Computer");
//		System.out.println("Updated name: " + product.getName());
//		product.setPrice(1200.00);
//		System.out.println("Updated price: " + product.getPrice());
//		
		System.out.println();
		System.out.println("Product data: "+ product);
		
		
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.AddProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: "+ product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.RemoveProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: "+ product);
	
		
		sc.close();
		
	}

}
