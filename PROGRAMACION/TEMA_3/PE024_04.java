public class PE024_04{
  public static void main (String[] args){
    
    double val1, val2;
    
    System.out.print("Dame el primer valor : ");
    
    val1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Dame el segundo valor : ");
    
    val2 = Integer.parseInt(System.console().readLine());
    
    double suma = val1 + val2, resta = val1 - val2, divi = val1 / val2, mult = val1 * val2;
    
    System.out.println("Los valores son: "+val1+" y "+val2);
    System.out.println("La suma da: " + suma);
    System.out.println("La resta da: " + resta);
    System.out.println("La division da: " + divi);
    System.out.println("La multiplicacion da: " + mult);
    }
  }
