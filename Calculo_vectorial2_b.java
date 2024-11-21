package NOSE;

import java.util.Scanner;

public class Calculo_vectorial2_b {
	
	public static void main(String[] args) {
		
		double x, y;
		
		int angulo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el valor del primer vector: ");
		x = sc.nextDouble();
		
		System.out.print("Ingrese el valor del segundo vector: ");
		y = sc.nextDouble();
		
		System.out.print("Ingrese el angulo entre los vectores: ");
		angulo = sc.nextInt();
		
		double resultante = (x*y) * Math.cos(Math.toRadians(angulo));
		
		System.out.println("El resultante es: "+ resultante);
		
	}

}