public class Operaciones{


	public int factorial(int num){
		if ( numero <= 1 ) {
        	return 1;
        } else {
            return numero*factorial(numero-1);
        }
	}

	 public void factorial2(int numero){
        int resultado = 1;
      while(numero > 0){
            resultado = resultado*numero;
            numero--;
        }

}