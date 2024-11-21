package NOSE;

import java.util.Scanner;

public class ProductoTriple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector1 = new int[3];
        int[] vector2 = new int[3];
        int[] vector3 = new int[3];

        System.out.println("Ingrese los 3 valores del primer vector:");
        for (int i = 0; i < 3; i++) vector1[i] = scanner.nextInt();

        System.out.println("Ingrese los 3 valores del segundo vector:");
        for (int i = 0; i < 3; i++) vector2[i] = scanner.nextInt();

        System.out.println("Ingrese los 3 valores del tercer vector:");
        for (int i = 0; i < 3; i++) vector3[i] = scanner.nextInt();

        int[] cruz = new int[]{
            vector2[1] * vector3[2] - vector2[2] * vector3[1],
            vector2[2] * vector3[0] - vector2[0] * vector3[2],
            vector2[0] * vector3[1] - vector2[1] * vector3[0]
        };

        int productoTriple = vector1[0] * cruz[0] + vector1[1] * cruz[1] + vector1[2] * cruz[2];

        System.out.println("El producto triple es: " + productoTriple);
        scanner.close();
    }
}
