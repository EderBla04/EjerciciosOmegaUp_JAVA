package NOSE;

import java.util.Scanner;

public class Etapas {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int L;
	
	L= sc.nextInt();
	
	if(L >= 0 && L<= 3) {
		
		System.out.println("BEBE");
		
	}
	
	if(L >= 4 && L<= 14) {
		
		System.out.println("NINO");
	}
	
	if(L >= 15 && L<= 18) {
		
		System.out.println("JOVEN");
		
	}
	
	if(L >= 19 && L<= 65) {
		
		System.out.println("ADULTO");
		
	}
	
	if(L >= 65 ) {
		
		
		System.out.println("ADULTO 3RA");
	}
	
	
	
	
}

}
