package NOSE;

import java.util.Scanner;

public class Alreves {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, num, op=0;
		
		
		
		do {
		System.out.println("Ingresa el numero");
		num= sc.nextInt();
		
		a = num/10;
		
		b= num - (a*10);
		
		System.out.println(b+""+a);
		
		System.out.println("Hacerlo otra vez?(1=n0, cualquier numero=si)");
		op= sc.nextInt();
		}while(op!=1);
	}

}
