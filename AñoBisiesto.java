package NOSE;

import java.util.Scanner;

public class AñoBisiesto {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int annio= sc.nextInt();
		
		if(annio%4==0) {
			
			if(annio%100==0 && annio%400>0) {
				
				System.out.println("NO BISIESTO");
				
			}
			
			else if(annio%100==0 && annio%400==0) System.out.println("BISIESTO");
			
			else System.out.println("BISIESTO");

		}
		else System.out.println("NO BISIESTO");
		
	}

}
