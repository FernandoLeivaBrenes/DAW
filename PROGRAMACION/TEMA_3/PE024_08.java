public class PE024_08{
  public static void main (String[] args){
    System.out.print("Indique las horas en la semana: ");
    double horas = Double.parseDouble(System.console().readLine());
    int euro_hora = 12;
    
    double result= horas * euro_hora;
    
    System.out.println("Euros por hora: "+euro_hora);
    System.out.println("Salario Semanal: "+result);
    }
  }
