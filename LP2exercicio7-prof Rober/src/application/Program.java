package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 
		double x1, x2, y1, y2 , distancia;
		
		System.out.println("Digite o primeiro ponto: ");
		x1 = sc.nextDouble();
		
		System.out.println("Digite o segundo ponto: ");
		x2 = sc.nextDouble();
		
		System.out.println("Digite o terceiro ponto: ");
		y1 = sc.nextDouble();
		
		System.out.println("Digite o quarto ponto: ");
		y2 = sc.nextDouble();
		
		distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.println("A distância entre os pontos ("+ String.format("%.2f",x1) 
		                                                  + "," + String.format("%.2f",y1) 
		                                                  + ") e (" + String.format("%.2f",x2) 
		                                                  + "," + String.format("%.2f",y2) + ") é: " + String.format("%.2f", distancia));
		
		sc.close();
	}

}
