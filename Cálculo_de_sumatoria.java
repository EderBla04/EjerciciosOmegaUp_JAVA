package NOSE;

import java.util.Scanner;

public class Cálculo_de_sumatoria {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, suma=0;
		
		n=sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			
			suma+=i;
			
			
		}
		
		System.out.println(suma);
	}

}
