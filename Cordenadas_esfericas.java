package NOSE;

import java.util.Scanner;

public class Cordenadas_esfericas {
	
		
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese las coordenadas cartesianas (x, y, z):");
	        System.out.print("x: ");
	        double x = scanner.nextDouble();

	        System.out.print("y: ");
	        double y = scanner.nextDouble();

	        System.out.print("z: ");
	        double z = scanner.nextDouble();

	        scanner.close();

	        double radio = Math.sqrt(x * x + y * y + z * z);
	        double theta = Math.atan2(y, x);
	        double phi = Math.acos(z / radio);

	        System.out.println("\nCoordenadas Esféricas:");
	        System.out.println("Radio (r): " + radio);
	        System.out.println("Ángulo Phi (\u03D5): " + phi + " radianes");
	        System.out.println("Ángulo Theta (\u03B8): " + theta + " radianes");
	    }
}
