package application;

import java.util.Scanner;
import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		CurrencyConverter converter = new CurrencyConverter();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("What is the dollar price?");
		converter.dolar = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		converter.buy = sc.nextDouble();
		System.out.println("Amount to be paid in reais = " + converter.toString());
		

	}

}
