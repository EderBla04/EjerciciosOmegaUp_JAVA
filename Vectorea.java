package NOSE;

import java.util.Scanner;

public class Vectorea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				int a1,a2,b1,b2,r;
				
				System.out.println("Ingrese el punto a1 = ");
				a1=sc.nextInt();
				System.out.println("Ingrese el punto a2 = ");
				a2=sc.nextInt();
				System.out.println("Ingrese el punto b1 = ");
				b1=sc.nextInt();
				System.out.println("Ingrese el punto b2 = ");
				b2=sc.nextInt();
				System.out.println("A = ("+a1+","+a2+")");
				System.out.println("B = ("+b1+","+b2+")");
				r=a1*b1+a2*b2;
				System.out.println("R = "+r);
			}

		

	}


