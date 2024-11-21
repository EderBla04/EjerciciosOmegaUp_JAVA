package NOSE;

import java.util.Scanner;

public class Minecraf2D {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		String matriz[][];
		
		n=sc.nextInt();
		
		sc.nextLine();
		
		matriz = new String [n][n];
		
        for (int i = 0; i < n; i++) {
            String linea = sc.nextLine(); 
            
            for (int j = 0; j < n; j++) {
                matriz[i][j] = String.valueOf(linea.charAt(j)); 
            }
        }
        
        for (int i = 0; i < n; i++) {
           
            
            for (int j = 0; j < n; j++) {
            	
            	if(matriz[i][j].equals("X")) {
            		
            		System.out.println(matriz[i][j]);
            		
            		moverse(i, j, n, matriz);
            		
            		
            	}
                
            }
        }
        
        

		
	}
	
	static void moverse(int i, int j,int n, String matriz[][]) {
		
		
		if(j+1<n && matriz[i][j+1].equals(".") ) {
			
			matriz[i][j+1] = "#" ;
			System.out.println("DERECHA");
			
			moverse(i, j+1, n, matriz);
		}
		
		if(i+1<n && matriz[i+1][j].equals(".") ) {
			
			matriz[i+1][j] = "#" ;
			System.out.println("ABAJO");
	
			moverse(i+1, j, n, matriz);
		}
		
		if(j-1>=0 && matriz[i][j-1].equals(".")) {
			
			matriz[i][j-1] = "#" ;
			
			System.out.println("IZQUIERDA");

			moverse(i, j-1, n, matriz);
			
		}
		
	    if(i-1>=0 && matriz[i-1][j].equals(".")) {
	    	
	    	matriz[i-1][j] = "#" ;
	    	
	    	System.out.println("ARRIBA");

			moverse(i-1, j, n, matriz);
			
		}
	}

}
