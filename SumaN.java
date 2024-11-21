package NOSE;

import java.util.Scanner;

public class SumaN {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n  =sc .nextInt();
		
		System.out.println(recursivo(n));
		
	}

	
	static int recursivo(int num) {
		
		if(num==0) return 1;
		
		return num* recursivo(num-1);
	}
}
