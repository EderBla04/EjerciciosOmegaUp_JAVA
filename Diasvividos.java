package NOSE;

import java.util.Scanner;

public class Diasvividos {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        // Edad en años
		System.out.println("Ingrese su edad");
        int edadEnAnos = sc.nextInt(); // Reemplaza esto con la edad real

        // Año actual
        int anioActual = 2024; // Reemplaza esto con el año actual

        // Año de nacimiento
        int añoNacimiento = anioActual - edadEnAnos;

        // Calcular la cantidad de días
        int diasVividos = edadEnAnos * 365;

        // Añadir los días de los años bisiestos
        for (int i = añoNacimiento; i < añoNacimiento + edadEnAnos; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                diasVividos++;
            }
        }

        System.out.println("La persona ha vivido " + diasVividos + " días.");
    }

}
