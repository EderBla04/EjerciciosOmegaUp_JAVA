package NOSE;

import java.util.Scanner;

public class ConvertirDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número decimal:");
        int numeroDecimal = scanner.nextInt();
        System.out.println("Ingrese la base a la que quiere convertir (1=Binario, 2=Hexadecimal, 3=Octal):");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("El número en binario es: " + Integer.toString(numeroDecimal, 2));
                break;
            case 2:
                System.out.println("El número en hexadecimal es: " + Integer.toString(numeroDecimal, 16));
                break;
            case 3:
                System.out.println("El número en octal es: " + Integer.toString(numeroDecimal, 8));
                break;
            default:
                System.out.println("La opción proporcionada no es válida. Debe ser 1 (Binario), 2 (Hexadecimal) o 3 (Octal).");
                break;
        }

    }
}

