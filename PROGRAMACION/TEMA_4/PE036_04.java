public class PE036_04{
  public static void main (String[] args){
    System.out.print("Introduce extra hours: ");
    int hourExt = Integer.parseInt(System.console().readLine());
    
    int hourExtSem = hourExt - 40 ;
    int cost12, cost16, total;
    String result = "El sueldo semanal que le corresponde es de : ";
    
    if (hourExtSem <= 0){
      //el mismo resultado del cost12
        total = cost12 = hourExt * 12;
        result += total + " euros";
      }else{
        cost16 = hourExtSem * 16;
        cost12 = (hourExt - hourExtSem)*12;
        total = cost12 + cost16;
        result += total + " euros";
        }
      System.out.println(result);
    }
  }
