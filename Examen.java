package NOSE;

import java.util.Scanner;

public class Examen {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String opcion;
		int n, control = 0;
		
		System.out.println("¿Cuantos alumnos va a registrar?");
		n = sc.nextInt();
		
		String matricula[] = new String [n];
		String nombre[] = new String [n];
		String carrera[] = new String [n];
		int edad[] = new int [n];
		double promedio[] = new double [n];
		String periodo[] = new String [n];
		String beca[] = new String [n];
		
		
		String carta = "Lamentablemente usted no alcanzo el promedio para una beca,\nPorfavor este "
				+ "es el momento perfecto para comenzar de nuevo, para aprender de las experiencias anteriores y "
				+ "para esforzarse aún más ";
		
		
		for(int i=0; i<n; i++) {
			
			System.out.println("Ingrese la matricula del alumno numero "+(i+1));
			matricula[i]= sc.next();
			System.out.println("Ingrese el nombre del alumno numero "+(i+1));
			nombre[i]= sc.next();
			System.out.println("Ingrese la carrera del alumno numero "+(i+1));
			carrera[i]= sc.next();
			System.out.println("Ingrese la edad del alumno numero "+(i+1));
			edad[i]=sc.nextInt();
			System.out.println("Ingrese el ultimo promedio del alumno numero "+(i+1));
			promedio[i]=sc.nextDouble();
			System.out.println("Ingrese el periodo del alumno numero "+(i+1));
			periodo[i]=sc.next();
			
			if(edad[i]>18) {
				
				if(promedio[i]>=9) {
					beca[i]="2000.00";
					
				}
				else if(promedio[i]>=7.5  ) {
					beca[i]="1000.00";
					
					}
				else if(promedio[i]>=6.0  ) {
					beca[i]="500.00";
					
					
				}
				else {
					beca[i]=carta;
				
					}
				

			}
			if(edad[i]<=18) {
				
				if(promedio[i]>=9) {
					beca[i]="3000.00";
					
				}
				else if(promedio[i]>=8  ) {
					beca[i]="1500.00";
					
					}
				else if(promedio[i]>=6.0  ) {
					beca[i]="100.00";
					
					
				}
				else {
					beca[i]=carta;
					
					}
				

			}
			
		
		}
		
		
		
		
		do {
				
		Menu.menu();
		System.out.print("Eliga una opcion: ");
	    opcion=sc.next();
		switch(opcion) {
		
		case "1":
		       for (int i = 0; i < n - 1; i++) {
		            for (int j = 0; j < n - i - 1; j++) {
		                if (promedio[j] < promedio[j + 1]) {

		                    double tempPromedio = promedio[j];
		                    promedio[j] = promedio[j + 1];
		                    promedio[j + 1] = tempPromedio;
		                    
		                    String tempString = matricula[j];
		                    matricula[j] = matricula[j + 1];
		                    matricula[j + 1] = tempString;

		                    tempString = nombre[j];
		                    nombre[j] = nombre[j + 1];
		                    nombre[j + 1] = tempString;

		                    tempString = carrera[j];
		                    carrera[j] = carrera[j + 1];
		                    carrera[j + 1] = tempString;

		                    int tempInt = edad[j];
		                    edad[j] = edad[j + 1];
		                    edad[j + 1] = tempInt;

		                    tempString = periodo[j];
		                    periodo[j] = periodo[j + 1];
		                    periodo[j + 1] = tempString;

		                    tempString = beca[j];
		                    beca[j] = beca[j + 1];
		                    beca[j + 1] = tempString;


		                }
		            }
		            
		       }
		       
		        for (int i = 0; i < n; i++) {
		            System.out.println("Matricula: " + matricula[i] + ", Nombre: " + nombre[i] + ", Carrera: " + carrera[i] + ", Edad: " + edad[i] + ", Promedio: " + promedio[i] + ", Periodo: " + periodo[i] + ", Beca: " + beca[i] );
		        }
			
			break;
			
		case "2":
			   for (int i = 0; i < n; i++) {
		            System.out.println("Matricula: " + matricula[i] + ", Nombre: " + nombre[i] + ", Carrera: " + carrera[i] + ", Edad: " + edad[i] + ", Promedio: " + promedio[i] + ", Periodo: " + periodo[i] + ", Beca: " + beca[i]);
		        }
			break;
		case "3":
			 System.out.println("Ingrese la carrera:");
		        String carreraBuscada = sc.next();
		        for (int i = 0; i < n; i++) {
		            if (carrera[i].equalsIgnoreCase(carreraBuscada) && !beca[i].equals("Lamentablemente usted no alcanzo el promedio para una beca,\n Porfavor este es el momento perfecto para comenzar de nuevo, para aprender de las experiencias anteriores y para esforzarse aún más ")) {
		                System.out.println("Matricula: " + matricula[i] + ", Nombre: " + nombre[i] + ", Carrera: " + carrera[i] + ", Beca: " + beca[i] );
		            }
		        }
			break;
        case "4":
           
            boolean menores = true;
            
            for (int i = 0; i < n; i++) {
                if (menores && edad[i] <= 18) {
                    System.out.println("Matricula: " + matricula[i] + ", Nombre: " + nombre[i] + ", Edad: " + edad[i]);
                } else if (!menores && edad[i] > 18) {
                    System.out.println("Matricula: " + matricula[i] + ", Nombre: " + nombre[i] + ", Edad: " + edad[i]);
                }
            }
            break;
        case "5":
            ;
            boolean menores2 = false;
            for (int i = 0; i < n; i++) {
                if (menores2 && edad[i] <= 18) {
                    System.out.println("Matricula: " + matricula[i] + ", Nombre: " + nombre[i] + ", Edad: " + edad[i]);
                } else if (!menores2 && edad[i] > 18) {
                    System.out.println("Matricula: " + matricula[i] + ", Nombre: " + nombre[i] + ", Edad: " + edad[i]);
                }
            }
            break;
        case "6":
            for (int i = 0; i < n; i++) {
                if (beca[i].equals("3000.00")) {
                    System.out.println("Matricula: " + matricula[i] + ", Nombre: " + nombre[i] + ", Beca: " + beca[i]);
                }
            }
            break;
        case "7":
            for (int i = 0; i < n; i++) {
                if (beca[i].equals("2000.00")) {
                    System.out.println("Matricula: " + matricula[i] + ", Nombre: " + nombre[i] + ", Beca: " + beca[i]);
                }
            }
            break;
        case "8":
            for (int i = 0; i < n; i++) {
                if (beca[i].equals("1500.00")) {
                    System.out.println("Matricula: " + matricula[i] + ", Nombre: " + nombre[i] + ", Beca: " + beca[i]);
                }
            }
            break;
        case "9":
            for (int i = 0; i < n; i++) {
                if (beca[i].equals("1000.00")) {
                    System.out.println("Matricula: " + matricula[i] + ", Nombre: " + nombre[i] + ", Beca: " + beca[i]);
                }
            }
            break;
        case "10":
            for (int i = 0; i < n; i++) {
                if (beca[i].equals("500.00")) {
                    System.out.println("Matricula: " + matricula[i] + ", Nombre: " + nombre[i] + ", Beca: " + beca[i]);
                }
            }
            break;
        case "11":
            for (int i = 0; i < n; i++) {
                if (beca[i].equals("100.00")) {
                    System.out.println("Matricula: " + matricula[i] + ", Nombre: " + nombre[i] + ", Beca: " + beca[i]);
                }
                
            }
            break;
            
        case "12":
			System.out.println(carta);
			break;
		case "13": System.out.println("Saliendo....");
		control=13;
		
			break;
		
		
		}
		}while(control!=13);
		
		
		
	}

}
