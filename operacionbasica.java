package NOSE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class operacionbasica {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingrese un numero entero");
		int n1 = Integer.parseInt(bf.readLine());
		System.out.println("Ingrese otro numero entero");
		int n2 = Integer.parseInt(bf.readLine());
		
		System.out.println(n1*n2);
		
	}

}
