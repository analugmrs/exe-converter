package util;

public class CurrencyConverter {
	
	public double dolar;
	public double buy;
	
	public double converter () {
		return this.dolar = (dolar + ((6*dolar)/100)) * buy;
	}
	
	public String toString() {
		return "R$"
			+ String.format("%.2f", converter());
	}
}
