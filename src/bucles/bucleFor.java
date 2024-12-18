package bucles;

public class bucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		for (int i=0 ; i<10 ; i++ ) {
	         System.out.println("5x"+i+"="+(5*i));
	         
	    for  (int i =1; i<=10 ; i++ ) {
	    	 int resultado = 5*1 ;
	    	 if(resultado%2==0) {
	    		 System.out.println("5x"+i +"="+resultado);
	    		 
	    	 }
	    }
	         
		}
		//instruccion continue
		for  (int i = 0 ; i<100 ; i++ ){
			
			if (i%2==0) {
				continue;
	       System.out.println("=====================")
				
			}
			System.out.println("Pasa");
			System.out.println(i);
			
			
		    
			
			
			System.out.println("Termina");
		
	}


	
	}
