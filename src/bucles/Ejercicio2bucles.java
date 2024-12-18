package bucles;

public class Ejercicio2bucles {

	public Ejercicio2bucles() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scaner scan = new Scaner (System in);
		int interacciones=0; 
		int contadorMultiposde3 = 0;
		int contsdorMultiplosde5 = 0;
		
		do {
		   System.out.println("Escribir un numero");
		   int numero =scan nextInt();
		   if(numero%3==0) {
				contadorMultiplosDe3++;
				
			
			}
			if (numero%5==0) {
				contadorMultiplosDe5++;
			}
			
			iteraciones++;
		while(iteraciones<10);
		
		System.out.println("Hay " + contadorMultiplosDe3 + " multiplos de 3");
		System.out.println("Hay " + contadorMultiplosDe5 + " multiplos de 5");
	



		
		
		
		
		
	}

}
