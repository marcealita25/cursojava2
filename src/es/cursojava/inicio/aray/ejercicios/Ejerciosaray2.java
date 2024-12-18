package es.cursojava.inicio.aray.ejercicios;

import java.util.Scanner;

public class Ejerciosaray2 {

public static void main(String[] args) {
	 
		int [][] numeros = new int [4][4];
		
		for (int i = 0; i<numeros.length ; i ++) {
			for (int j=0; j< numeros [i].length ; j++) {
				Scanner scan = new Scanner(System.in);
				System.out.println("Introduce un numero para la posición ["+i+"]["+j+"]");
						numeros [i][j]= scan.next();
			  //System.out.print(numeros[i][j]+"\t");
						
						}
			
		}
            System.out.println();
            for(int i=0; i<numeros)
            
}
          
            
}
