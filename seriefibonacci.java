package NOSE;

import java.util.Scanner;

public class seriefibonacci {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, c1=0, c2=1, suma=0;
		
		System.out.println("Ingrese el numero de valores");
		 n = sc.nextInt();
		 

		
		 System.out.println("Los numeros de la serie son: ");
		System.out.print(c1+" ");


		 
		 for(int i=1; i<n; i++) {
			 
			 
			 suma = c1+c2;
			 
			 System.out.print(" "+suma+" ");
			 
			 c2=c1;
			 c1=suma;
		 }
		
		
		
	}

}
