package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		 
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 
		 double n, triplo, metade, rCubica, elevado; 
		 
		 System.out.println("Digite o número a ser calculado: ");
		 n = sc.nextDouble();
		 
		 triplo = n * 3;
		 metade = n / 2;
		 rCubica = Math.pow(n,(1/3));
		 elevado = Math.pow(n,(2/3));
		 
		 System.out.println();
		 
		 System.out.println("O triplo de " + n + " é: " + String.format("%.2f", triplo));
		 System.out.println("A metade de " + n + " é: " + String.format("%.2f", metade));
		 System.out.println("A raiz cubica de " + n + " é: " + String.format("%.2f", rCubica));
		 System.out.println("O número " + n + " elevado à 2/3 é: " + String.format("%.2f", elevado));
		 
		 
		 sc.close(); 
		 
	}

}
