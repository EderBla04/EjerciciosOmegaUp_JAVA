package NOSE;

import java.util.Scanner;

public class factorial {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, f=1;
		
		n=sc.nextInt();
		
		for(int i=2; i<=n; i++) {
			
			f*=i;
			
		}
		
		System.out.println(f);
	}

}
