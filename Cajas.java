package NOSE;

import java.util.Scanner;

public class Cajas {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int n, n2, arr1[], arr2[], suma1=0, suma2=0;
		
		n=sc.nextInt();
		
		n2= sc.nextInt();
		arr1 = new int [n];
		arr2 = new int [n2];
		
		
		arr1 = new int [n];
		
		for(int i=0; i<n ; i++) {
			
			
			arr1[i] = sc.nextInt();	
			
			suma1+=arr1[i];
		}
		
		for(int i=0; i<n2 ; i++) {
			
			
			arr2[i] = sc.nextInt();
			suma2+=arr2[i];
		}
		
		System.out.println(suma1+" "+suma2);
		
	}

}
