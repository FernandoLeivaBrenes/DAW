public class PE041_22{
  public static void main(String[] args){
    System.out.print("Introduce el dia de la semana en minuscula y sin tildes ( lunes, martes, miercoles, jueves y viernes ): ");
    String diaSem = System.console().readLine();
    int minTotal = 6660, minActual = 0, horas = 0, min = 0;
    // Usar el selector para evitar fallos
    switch(diaSem){
      case "lunes":
      //minActual se queda igual;
      break;
      case "martes":
      minActual += 1440;
      break;
      case "miercoles":
      minActual += 2880;
      break;
      case "jueves":
      minActual += 4320;
      break;
      case "viernes":
      minActual += 5760;
      break;
      default:
      System.out.println("No has introducido bien el dia, reinicia.");
      }
      System.out.print("Introduce la hora con el formato 24 horas (ejem. [15:30]): ");
      // Usando un split separar las horas y minutos del string
      String strHorMin = System.console().readLine();
      String[] horMin = strHorMin.split(":");
      horas = Integer.parseInt(horMin[0]);
      min = Integer.parseInt(horMin[1]);
      System.out.println("Quedan "+(minTotal-((horas*60)+minActual+min))+" minutos para el fin de semana.");
    }
  }
