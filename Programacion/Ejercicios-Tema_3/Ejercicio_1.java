public class Ejercicio_1{
  public static void main (String[] args){
    
    int val1 ,val2;
    
    System.out.print("Dame el primer valor : ");
    
    val1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Dame el segundo valor : ");
    
    val2 = Integer.parseInt(System.console().readLine());
    
    int result= val1 * val2;
    
    System.out.println("El valor "+val1+" por el valor "+val2+" es : "+result);
    
    }
  }
