import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
//		int y = 32;
//		double x = 10.35784;
//		String nome = "Maria";
//		int idade = 31;
//		double renda = 4000.0;
//		
//		System.out.println(y);
//		System.out.println(x);
//		System.out.printf("%.2f%n", x);
//		System.out.printf("%.4f%n", x);
//		Locale.setDefault(Locale.US);
//		System.out.printf("%.4f%n", x);
//
//		System.out.println("RESULTADO = " + x + " METROS");
//		System.out.printf("RESULTADO = %.2f metros%n", x);
//		
//		System.out.println("Olá Mundo!");
//		System.out.println("Bom dia!");
//		
//		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
//
//	
//		double x = 3.0;
//		double y = 4.0;
//		double z = -5.0;
//		double A, B, C;
//		
//		A = Math.sqrt(x);
//		B = Math.sqrt(y);
//		C = Math.sqrt(25.0);
//		
//		System.out.println("Raiz quadrada de " + x + " = " + A);
//		System.out.println("Raiz quadrada de " + y + " = " + B);
//		System.out.println("Raiz quadrada de 25 = " + C);
//		
//		A = Math.pow(x, y);
//		B = Math.pow(x, 2.0);
//		C = Math.pow(5.0, 2.0);
//		
//		System.out.println(x + " elevado a " + y + " = " + A);
//		System.out.println(x + " elevado ao quadrado = " + B);
//		System.out.println("5 elevado ao quadrado = " + C);
//		
//		A = Math.abs(y);
//		B = Math.abs(z);
//		
//		System.out.println("Valor absoluto de " + y + " = " + A);
//		System.out.println("Valor absoluto de " + z + " = " + B);
		
//		int x = 5;
//		
//		System.out.println("Bom dia");
//		
//		if (x < 0) {
//			System.out.println("Boa tarde");
//		}
//		
//				
//		System.out.println("Boa noite");
		
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.println("Bom dia");
		}
		else if(hora < 18) {
			System.out.println("Boa tarde");
		}
		else {
			System.out.println("Boa noite");
		}
		
		sc.close();
		
	}
}

	
