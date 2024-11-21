package NOSE;

import java.util.Scanner;

public class Calculo_Vectorial2 {
	
	public static void main(String[] args) {
		
		double x, y;
		
		int angulo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el componente X: ");
		x = sc.nextDouble();
		
		System.out.print("Ingrese el componente Y");
		y = sc.nextDouble();
		
		System.out.print("Ingrese el angulo entre los componentes: ");
		angulo = sc.nextInt();
		
		double resultante = (x*y) * Math.cos(Math.toRadians(angulo));
		
		System.out.println("El resultante es: "+ resultante);
		
	}

}
