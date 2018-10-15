public class PE040_21{
  public static void main(String[] args){
    System.out.println("Escribe las notas:");
    System.out.print("Nota 1º examen: ");
    int not1 = Integer.parseInt(System.console().readLine());
    System.out.print("Nota 2º examen: ");
    int not2 = Integer.parseInt(System.console().readLine());
    String result;
    if (((not1+not2)/2)<5){
      System.out.print("¿Cual ha sido el resultado de la recuperación? (apto/no apto): ");
      String respuesta = System.console().readLine();
      if(respuesta.equals("apto")){
        result = "Tu nota de Programacion es 5";
        }else{
          result = "Tu nota de Programacion es "+(double)(not1+not2)/2;
          }
      }else{
        result = "Tu nota de Programacion es "+(double)(not1+not2)/2;
        }
    System.out.println(result);
    }
  }
