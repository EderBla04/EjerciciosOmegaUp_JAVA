package NOSE;

import java.util.Scanner;

public class NumerosNaturales {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		a=sc.nextInt();
		b=sc.nextInt();
		
		recursivo(a, b, a);
		

	}
	
	public static void recursivo(int a, int b, int aux) {
		
		
	
	if(a<=b){
		
		if(a%aux==0) {
			
			System.out.println(a);
		}
		
		a++;
		
		recursivo(a, b, aux);
		
		
	}
	
	}
	
	
	

}
