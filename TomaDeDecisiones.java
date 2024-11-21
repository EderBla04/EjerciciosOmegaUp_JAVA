package NOSE;

import java.util.Scanner;

public class TomaDeDecisiones {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b ;
		
		a= sc.nextInt();
		b=sc.nextInt();
		
		if(a+b == 5) {
			
			b+=3;
			
			System.out.println((2*a)+b);
			
		}
		else {
			
			a-=1;
			
			if(((7*a)+b) %2 ==0) {
				System.out.println(a-b);
				
				
			}else System.out.println(a*b);
			
		}
		
		
		
		
	}

}
