public class PE037_09{
  public static void main(String[] args){
    System.out.println("Este programa resuelve ecuaciones de segundo grado del tipo [ax\u00B2 + bx + c = 0]");
    System.out.print("Por favor, introduzca el valor de [a]: ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.print("Ahora introduzca el valor de [b]: ");
    double b = Double.parseDouble(System.console().readLine());
    System.out.print("Por último, introduzca el valor de [c]: ");
    double c = Double.parseDouble(System.console().readLine());
    
    // 0x^2 + 0x + 0 = 0
    if((a==0)&&(b==0)&&(c==0)){
      System.out.println("La ecuacion tiene infinitas soluciones.");
    }
    
    // 0x^2 + 0x + n = 0 siendo n distinto de 0
    if((a==0)&&(b==0)&&(c!=0)){
      System.out.println("La ecuacion no tiene solución.");
    }
    
    // nx^2 + mx + 0 = 0 siendo n y m distinto de 0
    if((a!=0)&&(b!=0)&&(c==0)){
      System.out.println("x1 = 0");
      System.out.println("x2 = "+ (-b/a));
    }
    
    // 0x^2 + nx + m = 0 siendo n y m distinto de 0
    if((a==0)&&(b!=0)&&(c!=0)){
      System.out.println("x1 = x2 = "+ (-c/b));
    }
    
    // nx^2 + mx + l = 0 siendo n, m y l distinto de 0
    if((a!=0)&&(b!=0)&&(c!=0)){
      double disc = b*b - (4*a*c);
      if (disc<0){
        System.out.println("No tienen soluciones reales.");
        }else{
          System.out.println("x1 = "+ (-b + Math.sqrt(disc))/2*a);
          System.out.println("x2 = "+ (-b - Math.sqrt(disc))/2*a);
          }
      }
    }
  }
