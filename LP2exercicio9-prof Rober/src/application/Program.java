package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double IPI, valorUnitario1, valorUnitario2, valorTotal;
		int codigo1, quantidade1, codigo2, quantidade2;
		
		System.out.print("Digite a porcentagem do IPI a ser acrescido: ");
	    IPI = sc.nextDouble() / 100;

	    System.out.println("Peça 1:");
	    System.out.print("Código: ");
	    codigo1 = sc.nextInt();
	    System.out.print("Valor unitário: ");
	    valorUnitario1 = sc.nextDouble();
	    System.out.print("Quantidade: ");
	    quantidade1 = sc.nextInt();

	    System.out.println("Peça 2:");
	    System.out.print("Código: ");
	    codigo2 = sc.nextInt();
	    System.out.print("Valor unitário: ");
	    valorUnitario2 = sc.nextDouble();
	    System.out.print("Quantidade: ");
	    quantidade2 = sc.nextInt();

	    valorTotal = (valorUnitario1 * quantidade1 + valorUnitario2 * quantidade2) * (IPI + 1);

	    System.out.printf("Valor total a ser pago: " + String.format("%.2f", valorTotal));
		
		sc.close();
	}

}
