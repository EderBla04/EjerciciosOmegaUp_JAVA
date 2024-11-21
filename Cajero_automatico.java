package NOSE;

import java.util.Scanner;

public class Cajero_automatico {
	
	static Scanner sc = new Scanner(System.in);
	
	static int aux;
	
	static int cuenta= 1000;
	
	public static void main(String[] args) {
			
		String caracter, controlador="";
		
		while(controlador != "S") {
			
			caracter = sc.next();
			
			switch(caracter) {
			
			case "R":
				
				retiro();
				
				break;
				
			case "D":
				
				ingreso();

				break;
				
			case "C":	
				
				consulta();
				
				break;
				
			case "S":
				
				controlador = "S";
				break;
			
			
			
			}	
		}
		
		
	}
	
	public static void retiro() {
	
		aux = sc.nextInt();
		cuenta -= aux;
		
	}
	
	public static void ingreso() {
		
		aux = sc.nextInt();
		cuenta += aux;
	}
	
	public static void consulta() {
		
		System.out.println("$"+cuenta);
		
	}

}
