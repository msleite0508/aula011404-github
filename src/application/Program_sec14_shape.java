package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle_sec14;
import entities.Rectangle_sec14;
import entities.Shape;
import entities.enums.Color;

public class Program_sec14_shape {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if(ch == 'r') {
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				System.out.print("Height: ");
				Double height = sc.nextDouble();
				list.add(new Rectangle_sec14(color, width, height));
			}
			else {
				if(ch == 'c') {
					System.out.print("Radius: ");
					Double radius = sc.nextDouble();
					list.add(new Circle_sec14(color, radius));
				}
			}
	
		}
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for(Shape shape : list) {
			System.out.printf("%.2f%n", shape.area());
		}
		
		sc.close();
		
		
	}

}
