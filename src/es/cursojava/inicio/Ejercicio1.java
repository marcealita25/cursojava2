package es.cursojava.inicio;

import java.util.Scanner;
public class Ejercicio1 {
	public static void main (String []args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("introduce la base");
		
		double base = scan.nextInt();
		System.out.println("La base es :"+base);
		
		Scanner scan1 = new Scanner (System.in);
		
		System.out.println("introduce la altura");
		
		double altura = scan1.nextInt();
		System.out.println("La altura es : "+altura);
		
		
	}

}
