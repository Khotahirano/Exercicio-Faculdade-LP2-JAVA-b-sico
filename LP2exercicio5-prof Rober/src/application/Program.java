package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		 
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 
		 
		 double C, F;
		 		
		 System.out.print("Digite a temperatura em Celsius: ");
		 C = sc.nextDouble();
		 F = 9.0 * C / 5.0 + 32.0;
		 System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
		
		 sc.close(); 


	}

}
