//Laboratório de Programação 2 - Turma: 2HC2 - Pedro de Almeida Pimentel Neto

//Exercício 1 - Faça um programa que leia três valores inteiros, 
//e calcule e exiba a sua média ponderada. A primeira nota
//tem peso 2, a segunda tem peso 3 e a terceira tem peso 5. 

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor, valor1, valor2, media;

	    
	    	System.out.println("Digite as notas 1, 2 e 3 para o cálculo da média:");
	        valor = sc.nextDouble();
	        valor1 = sc.nextDouble();
	        valor2 = sc.nextDouble();

	        media = (valor * 2.0 + valor1 * 3.0 + valor2 * 5.0) / 10.0;
			
	        System.out.printf("MEDIA = %.2f\n", media);
	    
            sc.close();
  
	} 
}
