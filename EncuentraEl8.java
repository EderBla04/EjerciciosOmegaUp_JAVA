package NOSE;

import java.util.Scanner;

public class EncuentraEl8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, arr[], aux, mitad;
		
		boolean encontrado = false;
		
		n=sc.nextInt();
		
		arr = new int [n];
		
		for(int i=0; i<n; i++) {
			
			arr[i]  = sc.nextInt();
			
		}
		
		for(int i=0; i<n; i++) {
			
			for(int j=i+1; j<n; j++) {
				
				if(arr[i] > arr[j]) {
					
					aux = arr[i];
					
					arr[i] = arr[j];
					
					arr[j] = aux;
					

					
					
					
				}	
				
			}
			
		}
		

			
			int inicio=0;
			int fin= n-1;
			aux=0;
			
			do {
				
				mitad=(inicio+fin) /2;
				
				if(arr[mitad]==8) {
					
					encontrado =! encontrado;
					
					break;
					
					
				}
				
				if(arr[mitad]<8) {
					inicio=mitad+1;
					
										
				}
				else fin=mitad-1;
				
			}while(inicio <= fin);
			
			if(encontrado) System.out.println(1);
			else System.out.println(0);
			
			
		}

}
