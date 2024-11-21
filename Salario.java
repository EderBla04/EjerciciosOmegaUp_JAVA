package NOSE;

import java.util.Scanner;

public class Salario {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		x=sc.nextInt();
		y=sc.nextInt();
		
		if(x <= 40) System.out.println(menosDe40Horas(x , y));
		
	    else if(x > 40 && x < 50){
	        
	        
	    	System.out.println(massDe40Horas(x, y));
	        
	    }
		
	    else System.out.println(masDe50Horas(x, y));
		
		
		
		
	}
	
	static double  menosDe40Horas(double x, double y) {
		
		return x*y;
		
	}
	
	static double  massDe40Horas(double x, double y) {

		
		return (40*y)+ (((x-40)*(y*1.5)));
		
	}
	
	static double  masDe50Horas(double x, double y) {
		
		return (40*y)+ (((x-40)*(y*2)));
		
	}

}
