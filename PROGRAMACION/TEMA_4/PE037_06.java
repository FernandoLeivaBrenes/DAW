public class PE037_06{
  public static void main(String[] args){
    System.out.println("Este programa calcula el tiempo que tarda en caer un objeto desde una altura dada aplicando la formula [t=\u221A(2*h)/g] donde g = 9.81 m/s\u00B2");
    double g = 9.81;
    System.out.print("Introduce la altura : ");
    double height = Double.parseDouble(System.console().readLine());
    //Math.sqrt() es una funcion que realiza la raiz cuadrada.
    double t = Math.sqrt((2*height)/g);
    System.out.println("Tarda "+ String.format("%.2f",t) +"segundos");
    }
  }
