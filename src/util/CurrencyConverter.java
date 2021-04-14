package util;

public class CurrencyConverter {
	
	public static final double tax = 0.06; 
	
	public static double converter(double priceDollar, double amount) {
		double valor = priceDollar * amount;
		return valor += valor * tax;
	}

}
