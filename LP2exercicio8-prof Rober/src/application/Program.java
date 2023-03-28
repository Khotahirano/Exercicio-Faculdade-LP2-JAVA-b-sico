package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, antecessor, sucessor;
		
		System.out.print("Digite um número inteiro: ");
        numero = sc.nextInt();

        antecessor = numero - 1;
        sucessor = numero + 1;

        System.out.printf("O antecessor de %d é %d e o sucessor é %d\n", numero, antecessor, sucessor);
		
		sc.close();
	}

}
