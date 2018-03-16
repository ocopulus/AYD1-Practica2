package ayd1;

public class AYD1 {

    public static void main(String[] args) {
        
    }
	
	public String Suma(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int c1 = a1 + b1;
        String resultado = Integer.toString(c1, 2);
        return resultado;
    }
    
    public String Resta(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int c1 = a1 - b1;
        String resultado = Integer.toString(c1, 2);
        return resultado;
    }

    public String Dividir(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int c1 = a1 / b1;
        String resultado = Integer.toString(c1, 2);
        return resultado;
    }     
	
	public String Multiplicacion(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int c1 = a1 * b1;
        String resultado = Integer.toString(c1, 2);
        return resultado;
    }
    public String Potencia(String a,String b){
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int resultado = 1;
        for (int x = 0; x<b1; x++){
            resultado = resultado * a1;

        }
        return resultado.toString;
    }
    }
     
    public String Multiplicacion(String a) {
        int a1 = Integer.parseInt(a, 2);
        int c1 = Math.sqrt(a1);
        String resultado = Integer.toString(c1, 2);
        return resultado;
    }

}
