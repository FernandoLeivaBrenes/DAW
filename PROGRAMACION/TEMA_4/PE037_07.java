public class PE037_07{
  public static void main (String[] args){
    System.out.println("Calculo media aritmetica de tres notas:");
    System.out.print("Primera nota : ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("Segunda nota : ");
    double nota2 = Double.parseDouble(System.console().readLine());
    System.out.print("Tercera nota : ");
    double nota3 = Double.parseDouble(System.console().readLine());
    System.out.println("La media entre las notas introducidas es: "+ String.format("%.2f",((nota1+nota2+nota3)/3)));
    }
  }
