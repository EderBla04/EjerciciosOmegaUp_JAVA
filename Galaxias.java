package NOSE;

import java.util.Scanner;

public class Galaxias {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a < b) {
			System.out.print("True ");
			
			
		}else System.out.print("False ");
		
		if(c > a)System.out.print("True ");
		else System.out.print("False ");
		
		if(a==b) System.out.print("True ");
		else System.out.print("False ");
		
		if(a != b) System.out.print("True ");
		else System.out.println("False ");
		
		if(c <=  b) System.out.print("True");
		else System.out.print("False");
		
		
		
		
		
		
	}

}
