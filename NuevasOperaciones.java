public class Operaciones{


	public int factorial(int num){
		if ( numero <= 1 ) {
        	return 1;
        } else {
            return numero*factorial(numero-1);
        }
	}

}