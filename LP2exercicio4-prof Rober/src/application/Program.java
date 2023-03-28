package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double chopValue, pizzaValue, totalValue, garcomValue, totalWithGarcom, valuePerPerson;
        int chopQuantity,roofQuantity, peopleQuantity;
        
        System.out.println("Digite quantas pessoas participam deste pedido?");
        peopleQuantity = sc.nextInt();
        
        System.out.print("Quantas tulipas de chope foram pedidas? ");
        chopQuantity = sc.nextInt();
        
        System.out.print("Quantas coberturas foram pedidas na pizza grande? ");
        roofQuantity = sc.nextInt();
        
        chopValue = chopQuantity * 1.8;
        pizzaValue = 25 + roofQuantity * 3.5;
        totalValue = chopValue + pizzaValue;
        garcomValue = totalValue * 0.1;
        totalWithGarcom = totalValue + garcomValue;
        valuePerPerson = totalWithGarcom / peopleQuantity;
        
        System.out.printf("Valor total: R$ %.2f\n", totalWithGarcom);
        System.out.printf("Valor por pessoa (para %d pessoas): R$ %.2f\n", peopleQuantity, valuePerPerson);
        
        sc.close();
	}

}
