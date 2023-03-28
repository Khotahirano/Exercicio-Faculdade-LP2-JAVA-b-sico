//Laboratório de Programação 2 - Turma: 2HC2 - Pedro de Almeida Pimentel Neto

//Exercício 2 - Realizarei uma viagem de vários dias em meu automóvel, 
//e gostaria de saber a quilometragem média por litro de gasolina. 
//Para isto, anotarei a quilometragem no velocímetro ao sair de viagem,
//e depois ao chegar. Também vou somar toda a gasolina que comprar 
//para o carro. Você poderia fazer um programa que me desse,
//com estes dados, quantos km fiz, em média, por litro de gasolina? 



package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double kmSaida,kmChegada, litrosGasolina,kmTotal,kmLitro;
		
		
		
		
		System.out.println("Digite a quilometragem ao sair de viagem: ");
        kmSaida = sc.nextDouble();
        
        System.out.println("Digite a quilometragem ao chegar de viagem: ");
        kmChegada = sc.nextDouble();
        
        sc.nextLine();
        
        System.out.println("Digite a quantidade de litros de gasolina comprados: ");
        litrosGasolina = sc.nextDouble();
        
        kmTotal = kmChegada - kmSaida;
        kmLitro = kmTotal / litrosGasolina;
        
        System.out.println("A média de quilometragem por litro de gasolina é: " + kmLitro + " km/L");
		
		sc.close();
	}

}
