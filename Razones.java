package NOSE;

import java.util.Scanner;

public class Razones {
	
	public static void main(String[] args) {
		 // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar los valores
        System.out.print("Ingresa el valor del cateto adyacente: ");
        int catetoAdyacente = scanner.nextInt();

        System.out.print("Ingresa el valor del cateto opuesto: ");
        int catetoOpuesto = scanner.nextInt();

        System.out.print("Ingresa el valor de la hipotenusa: ");
        int hipotenusa = scanner.nextInt();
        
        System.out.println("sen α= "+catetoOpuesto+"/"+hipotenusa);
        System.out.println("cos α= "+catetoAdyacente+"/"+hipotenusa);
        System.out.println("tan α= "+catetoOpuesto+"/"+catetoAdyacente);
        System.out.println("cot α= "+catetoAdyacente+"/"+catetoOpuesto);
        System.out.println("sec α= "+hipotenusa+"/"+catetoAdyacente);
        System.out.println("csc α= "+hipotenusa+"/"+catetoOpuesto);		
	}

}
