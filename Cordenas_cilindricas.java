package NOSE;

import java.util.Scanner;

public class Cordenas_cilindricas {
	
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

        double radio = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x);
        double altura = z;

        
        System.out.println("\nRadio (x): " + radio);
        System.out.println("Ángulo Theta (y): " + Math.toDegrees(theta) + " grados");
        System.out.println("Altura (z): " + altura);
        
        System.out.println("\nCoordenadas Cilíndricas:");
        System.out.println("("+radio+" , "+Math.toDegrees(theta)+" , "+altura+")");
    }

}
