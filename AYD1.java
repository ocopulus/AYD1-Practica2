package ayd1;

public class AYD1 {

    public static void main(String[] args) {
        
    }
	
	public String Suma(String a, String b) {
         int a1 = 0;
         int b1 = 0;
         int nueva_Linea;
        try{
            a1 = Integer.parseInt(a, 2);
            b1 = Integer.parseInt(b, 2);
        }catch (Exception e) {
            return "";
        }
        int c1 = a1 + b1;
        
        String resultado = Integer.toString(c1, 2);
        
        return resultado;
    }

    public String Resta(String a, String b) {
         int a1;
         int b1;
        try{
            a1 = Integer.parseInt(a, 2);
            b1 = Integer.parseInt(b, 2);
        }catch (Exception e) {
            return "";
        }
        int c1 = a1 - b1;
        String resultado = Integer.toString(c1, 2);
        return resultado;
    }

    public String Dividir(String a, String b) {
       

        int a1;
         int b1;
        try{
            a1 = Integer.parseInt(a, 2);
            b1 = Integer.parseInt(b, 2);
        }catch (Exception e) {
            return "";
        }
        if(b1==0) return "error";
        int c1 = a1 / b1;
        String resultado = Integer.toString(c1, 2);
        return resultado;
    }     
	
	public String Multiplicacion(String a, String b) {
        int a1;
         int b1;
        try{
            a1 = Integer.parseInt(a, 2);
            b1 = Integer.parseInt(b, 2);
        }catch (Exception e) {
            return "";
        }
        int c1 = a1 * b1;
        String resultado = Integer.toString(c1, 2);
        return resultado;
    }

    public String Potencia(String a,String b){
        int a1;
         int b1;
        try{
            a1 = Integer.parseInt(a, 2);
            b1 = Integer.parseInt(b, 2);
        }catch (Exception e) {
            return "";
        }
        int resultado = 1;
        if(b1 == 0) return "1";
        for (int x = 0; x<b1; x++){
            resultado = resultado * a1;   
        }
        return resultado.toString;
    }
     

    public String RaizCuadrada(String a) {
       int a1;
       int c1;
       try{
        int a1 = Integer.parseInt(a, 2);
        int c1 = Math.sqrt(a1);
        }catch (Exception e) {
            return "";
        }
        String resultado = Integer.toString(c1, 2);
        return resultado;
    }

    public String Modular(String a) {
       int a1;
         int b1;
        try{
            a1 = Integer.parseInt(a, 2);
            b1 = Integer.parseInt(b, 2);
        }catch (Exception e) {
            return "";
        }
        int c1 = a1 % b1;
        String resultado = Integer.toString(c1, 2);
        return resultado;
    }

}
