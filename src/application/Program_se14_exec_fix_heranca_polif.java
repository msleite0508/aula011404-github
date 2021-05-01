package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product_sec14_heranca_polif;
import entities.UsedProduct;

public class Program_se14_exec_fix_heranca_polif {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		 
		List<Product_sec14_heranca_polif> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Customs fee: ");
				Double customFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customFee));
				
			}else {
				if(ch == 'u') {
					System.out.print("Manufacture date (DD/MM/YYYY):");
					Date manufacturedDate = sdf.parse(sc.next());
					list.add(new UsedProduct(name, price, manufacturedDate));
					
				}
				else {
					list.add(new Product_sec14_heranca_polif(name, price));
				}
			}
			
		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product_sec14_heranca_polif prod : list) {
			System.out.println(prod.priceTag());
		}
		
		
		
		sc.close();
			
	}

}
