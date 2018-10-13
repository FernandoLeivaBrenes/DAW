public class Ejercicio_3{
  public static void main (String[] args){
    
    double EURO = 0.006013, peseta;
    
    System.out.print("Introduce el valor en pesetas = ");
    
    peseta = Double.parseDouble(System.console().readLine());
    
    double result = EURO * peseta;
    
    System.out.println("  "+peseta+" son "+result+" €");
    
    }
  }
