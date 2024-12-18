package es.cursojava.inicio;

import java.util.Scanner;

public class Ejercicio String {
  
	
	public static void main(String[] args, String error) {
		System.out.println("Introduce tu email");
		Scanner scan = new Scanner (System.in);
		String email = scan.nextLine();
		if (email.contains(" ")) {
			System.out.println("email incorrecto");
			String mensaje;
			if(!email.contains("@")) {
			    error  += "El email debe contener una @";
		}
		
			for(int i=0; i<email.length() ; i++) {
				char caracter = email.charAt(i);
				if (caracter=='@') {
					int contadorArrobas;
					contadorArrobas++;
					
				}
			}
			
		
			if(error.isBlank()) {
				System.out.println("El email"+ email +"es cocorrecto");
		   }else {
			   System.out.println("El email"+ email +" es incorrecto por: "+error);
		   }

		}
	
