public class PE025_12{
  public static void main(String[] args){
    
    //Este progarama permite calcular la cantidad de nota que te hace falta para superar el curso pero , no valora que la nota maxima que puedas sacar sea un 10
    
    System.out.print("Introduce la nota que has sacado en el primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    //Porcentaje de notas
    double porc1 = 40;//Porcentaje 1º
    double porc2 = 60;//Porcentaje 2º
    
    System.out.print("¿Que nota quieres sacar en el trimestre? :");
    double notaTri = Double.parseDouble(System.console().readLine());
    
    double nota2 = (notaTri-(nota1*(porc1/100)))/(porc2/100);
    
    System.out.println("Para tener un "+notaTri+" en el trimestre necesitas sacar un "+String.format("%.2f", nota2)+" en el segundo examen.");
    
    }
  }
