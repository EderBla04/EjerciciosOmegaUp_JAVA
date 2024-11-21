package NOSE;

import java.util.Scanner;

public class DosVectores {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, suma=0, multiplicacion, arr1[],  arr2[];
		
		n=sc.nextInt();
		
		arr1 = new int[n];
		
		arr2 = new int[n];
		
		for(int  i=0; i<n; i++) {
			
			
			arr1[i] = sc.nextInt();
			
			
			
			
		}
		
		for(int  i=0; i<n; i++) {
			
			
			arr2[i] = sc.nextInt();
			
			
			
			
		}
		
		for(int  i=0; i<n; i++) {
			
			multiplicacion = arr1[i] * arr2[i];
			
			suma+= multiplicacion;
			
		}
		
		System.out.println(suma);
		
		
		
	}

}
