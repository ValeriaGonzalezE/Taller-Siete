package ActividadSiete;

public class PuntoCuatro {

public static void main(String[] args) {
		
	//ERROR DE SINTAXIS
	
	int i = 1;
	int j = 0;
	
	if(i=j) {
		System.out.println("son temrinos iguales");
	}

	
	
	
	
	//ERROR LOGICO 
	// DEBE IMPRIMIR UNA LISTA QUE DIGA EL NUMERO H -1 ES IGUAL A EL NUMERO K CINCO VECES HACIA ABAJO
	
	int h = 0;
	for( h = 0;h < 10;h ++);
		int k = h++;
	System.out.println("el numero " + h + " - 1 es igual a " + k);
	
    
	

	
		// ERROR DE EXCEPCION 
		// nos marca error al ejecutar ya que ningun numero peude ser dividido entre 0
		
		int dividendo = 5;
		int divisor = 0;
		int resultado = dividendo/divisor;
		
	System.out.println(resultado);
	 

  }
	
}
