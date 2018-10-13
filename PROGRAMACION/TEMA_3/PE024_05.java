public class PE024_05{
  public static void main(String[] args){
    
    double base = 0, altH = 0;
    
    System.out.print("Cuanto mide su base: ");
    base=Double.parseDouble(System.console().readLine());
    
    System.out.print("Cuanto mide su altura: ");
    altH=Double.parseDouble(System.console().readLine());
    
    double result = base * altH;
    
    System.out.println("El area del rectangulo (base*altura) es : "+ result);
    }
  }
