package NOSE;

import java.util.Scanner;

public class Once {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long n, aux, part1, part2, suma;
		
		n=sc.nextLong();
		
		 
		
		part1 = n/10000000;
		
	    aux = n % 10000000;
	    
	    part2 = aux /10000;
	    
	    aux = aux % 10000;
	    
	    System.err.println(part1);
	    
	   System.out.println(part2);
	   
	   System.out.println(aux);
	    
	    suma = part1 + part2 + aux; 
		 
		System.out.println(suma);
	}

}
