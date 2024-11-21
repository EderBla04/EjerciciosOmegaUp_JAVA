package NOSE;

import java.util.Scanner;

public class SalvadorYsusAlumnos {
	
	

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double cal1, cal2, cal3;
		
		int numerolista;
		
		double aux;
		
		int n=sc.nextInt(); 
		
		
		int arr[] = new int[n];
		double prom[] = new double[n];
		
		for(int i=0; i<n; i++ ) {
			
			numerolista  = sc.nextInt();
			
			arr[i] = numerolista;
			
			
			cal1 = sc.nextDouble();
			cal2 = sc.nextDouble();
			cal3 = sc.nextDouble();
			
				
				prom[i] = ((cal1+cal2+cal3)/3);
				
				
				
			
			
		 }
		
		for(int i=0; i<n; i++) {
			
			for(int j=i+1; j<n; j++) {
				
				if(prom[i] <= prom[j]) {
					
					aux = prom[i];
					
					prom[i] = prom[j];
					
					prom[j] = aux;
					
					aux = arr[i];
					
					arr[i]= arr[j];
					
					arr[j]= (int )aux;
					
					
					
				}			
				
			}
			
		}
		
		for(int i=0; i<n; i++ ) {
			
			System.out.println(arr[i]+" "+(int )prom[i]);
		
			
		}
		
		
	}

}
