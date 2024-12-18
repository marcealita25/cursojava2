package bucles;

import java.util.Scanner;

public class Ejercicio4bucles {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	      System.out.println("pinta la tabla del 4");
	   
	      int num = scan.nextInt();
		
		  for (int i = 1 ; i <=10 ; i ++) {
			System.out.println("Tabla del 4" + i);
			 
			for (int j=1; j<=10; j ++ ) {
				
				int resultado = i*j;
				System.out.println(i+" x " + j +" = "+ resultado(4*i));

			}
		}
		

	}

}
