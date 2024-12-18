package es.cursojava.inicio.aray.ejercicios;

import java.util.Scanner;

public class Ejercicio4aray {

	public static void main(String[] args, int Vidas) {
		String [] palabras = {"destornillador","monitor", "pirata", "murciélago", " metamorfosis"};
		
		int random = (int)(Math.random()*5);
		String palabraJuego = palabras [random];
		
		String[]palabraOculta = palabraJuego.split("");
		System.out.println(palabraJuego);
		
		System.out.println(palabraOculta.length);
		
		int vidas = 6;
		String letraIngresada = "";
		String letrasPropuestas = "";
		
		
		boolean contadorAciertos;
		do {
			boolean palabraAcertada = true;
		    for (String letra :palabraOculta) {
				System.out.print("-");
				if(letrasPropuestas.contains(letra)) {
					System.out.print(letra +"");
				}else  {
					
					System.out.print("-");
					
				}
				if(palabraAcertada) {
					System.out.println("HAS GANADO !!!!");
					break;
				}
		  }
		    System.out.println("\nYa has introducido ");
		    
			System.out.println("\nintroduce una letra");
			Scanner scan = new Scanner(System.in);
			String letraIntroducida = scan.nextLine();
			letrasPropuestas+=letraIntroducida;
			
			boolean acierto = false;
			for (String letra : palabraOculta) {
				 if(!letra.equals(letraIntroducida)) {
					 System.out.println("No has acertado") ;
					if((Vidas)--);
					
					 
					 }
	            }
			
			
			  if (!acierto) {
			    System.out.println("La letra" +vidas + "vidas");
			    		

	
		
	}

	
		
	}
		while(vidas>0 && contadorAciertos);
		


		
	}

}
