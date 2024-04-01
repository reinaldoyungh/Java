package entities;

public class CurrencyConverter {

	public double dollarPrice;
	public double dollarBuy;
	public double dollarResult;
	public static double iof = 6.0;
	
	public static double calculatorIof(double value) {
		return value * (iof/100);
	}
	
	public void calculatorPaid() {
		double p = dollarBuy * dollarPrice;
		double result = calculatorIof(p) + p;
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
	}
}
