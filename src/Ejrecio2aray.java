

public class Ejrecio2aray {

	public Ejrecio2aray() {
		
	}

	public static void main(String[] args) {
		int[] numeros = {4,8,15,16,23,42 } ;
		
	for (int numero : numeros) {
		System.out.println(numero);
		
	}
		
		//calculo de la meia de todos los numeros
	    int suma = 0; 
		for(int numero : numeros) {
			suma += numero ;
			//summa +summa = numero;
		}
		System.out.println("La medida de todos los numeros es : "+ suma/numeros.length);
		
		
		int numMayor = 0;
		int numMenor = Integer.MAX_VALUE;
		for (int i = 0 ; i<numeros.length ; i++) {
			if (numeros[i]>numMayor) {
				numMayor = numeros [i];
			}
			if (numeros[i]>numMenor) {
				numMenor  = numeros [i];
			
		}
		
		System.out.println("Mayor"+numMayor );
		System.out.println("Menor"+numMenor );
		}
		
	}
	
}


		
		
	
	



