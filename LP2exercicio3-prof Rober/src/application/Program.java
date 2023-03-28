package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);		
		
        String name;
        double dist, time, avarageSpeed; 
        
        
        System.out.println("Pilot name: ");
        name = sc.nextLine();
        
        System.out.println("Writ your Distance in Kilometer: ");
        dist = sc.nextDouble();
        
        System.out.println("Writ your time in hours: ");
        time = sc.nextDouble();
        
        avarageSpeed = dist / time;
        
        System.out.println("The avarage speed of " + name + " are " + avarageSpeed + " km/h.");
        
        //Experimentei fazer o exercício em inglês para treinar. 
        
        sc.close();
	}

}
