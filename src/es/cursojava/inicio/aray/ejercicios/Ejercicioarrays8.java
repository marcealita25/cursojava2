package es.cursojava.inicio.aray.ejercicios;

import java.util.Scanner;

public class Ejercicioarrays8 {

	public static void main (String[] args) {
		
		Scanner aulas = new Scanner (System.in);
		System.out.println("cuantas aulas tiene el colegio");
		int numero = aulas.nextInt();
		int opcion = 0;
		final int OPCION_SALIR = 5;
		int mesas = 2;
		String [][]clase = new String [numero][mesas];
		System.out.println("cada aula caben "+mesas + " mesas");
		
		do {
			System.out.println("\n1. pedir datos");
			System.out.println("2.mostrar alumnos por aula");
			System.out.println("3. buscar alumno");
			System.out.println("4. borrar alumnos");
			System.out.println("5. salir. ");
			
			System.out.println("\nElige una opción");
			Scanner scan = new Scanner(System.in);
			opcion = scan.nextInt();
			
			switch (opcion) {
				case 1: 
					for (int i=0; i< clase.length ; i++) {
						for (int j=0; j< clase[i].length  ;  j++) {
							Scanner scan1 = new Scanner(System.in);
							System.out.println("Introduce número para la posción ["+i+"]["+j+"]" );
							clase [i][j] = scan1.nextLine();
						}
					}
					
				case 2:
					System.out.println();
					for (int i=0; i<clase.length ; i++) {
						for (int j=0; j< clase[i].length  ;  j++) {
							System.out.print(clase[i][j]+"\t");
						}
						System.out.println();
					}
					
				case 3: System.out.println("Has elegido opción "+opcion+", añadir alumno");break;
				case 4: System.out.println("Adios");break;
				case 5: System.out.println("salir");break;
				default: System.out.println("Opción incorrecta");
			}
			
			
		}while(opcion!=OPCION_SALIR);
		

	}
	
}



		
			
			