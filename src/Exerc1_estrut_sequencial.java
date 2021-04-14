import java.util.Locale;
import java.util.Scanner;

public class Exerc1_estrut_sequencial {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os valores abaixo");
		System.out.print("Largura: ");
		double largura = sc.nextDouble();
		
		System.out.print("Comprimento: ");
		double comprimento = sc.nextDouble();
		
		System.out.print("Valor do metro quadrado: ");
		double metroQuadrado = sc.nextDouble();
		 
		double area = largura * comprimento;
		double preco = area * metroQuadrado;

				
		System.out.printf("AREA =  %.2f%n", area );
		System.out.printf("VALOR =  %.2f%n", preco );
		
		sc.close();
		
	}

}
