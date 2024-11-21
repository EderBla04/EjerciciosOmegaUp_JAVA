package NOSE;

	import java.util.Scanner;

	public class Tarea3 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 Scanner Kfc= new Scanner (System.in);
		        double x,y,z,root,tan;
		        System.out.println("Dame el eje x");
		        x=Kfc.nextDouble();
		        System.out.println("Dame el eje y");
		        y=Kfc.nextDouble();
		        System.out.println("Dame el eje z");
		        z=Kfc.nextDouble();
		        root=Math.sqrt((x*x)+(y*y)+(z*z));
		        tan=Math.atan(y/x);
		        z=Math.acos(z/root);
		        System.out.println("P("+root+","+tan+","+z+")");
		}

	}

