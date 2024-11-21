package NOSE;

import java.util.Scanner;

public class ConteoBasicos {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		A=sc.nextInt();
		B=sc.nextInt();
		
		imprimir(A, B);
		
	}
	
	
	public static void imprimir(int a, int b) {
		
		System.out.println(a);
		
		if(a < b) {
			
			a++;
			
			imprimir(a, b);
		}
		
		
	}

}
