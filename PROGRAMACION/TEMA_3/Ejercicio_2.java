public class Ejercicio_2{
  public static void main (String[] args){
    
    double euro, PESETA=166.385;
    
    System.out.print("Introduce el valor en euros = ");
    
    euro = Double.parseDouble(System.console().readLine());
    
    double result = euro * PESETA;
    
    System.out.println("  "+euro+" € son "+result+"pesetas");
    
    }
  }
