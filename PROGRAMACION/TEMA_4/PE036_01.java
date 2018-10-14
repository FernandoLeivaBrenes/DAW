public class PE036_01{
  public static void main(String[] args){
    // contiene el PE036_3
    
    System.out.printf("1 - Lunes\n2 - Martes\n3 - Miércoles\n4 - Jueves\n5 - Viernes\n6 - Sábado\n7 - Domingo\n");
    System.out.print("Introduce que día de la semana quieres ver: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    String subj = " " , diaNm = " ";
    
    switch (dia){
    case 1:
    subj = "Sistemas Informáticos";
    diaNm = "Lunes";
    break;
    case 2:
    subj = "Programacion";
    diaNm = "Martes";
    break;
    case 3:
    subj = "Entornos de desarrollo";
    diaNm = "Miércoles";
    break;
    case 4:
    subj = "Entornos de desarrollo";
    diaNm = "Jueves";
    break;
    case 5:
    subj = "Sistemas Informáticos";
    diaNm = "Viernes";
    break;
    case 6:
    subj = "Nada , es finde semana";
    diaNm = "Sábado";
    break;
    case 7:
    subj = "Nada , es fin de semana , aprovecha y descansa";
    diaNm = "Domingo";
    break;
    default:
    System.out.println("Debes indicar un numero correcto");
      }
    // comprueba que no contenga el valor por defecto.
    if (!subj.equals(" ")){
      System.out.println("El "+diaNm+" a primera hora tendrás : "+subj);
      }
    }
  }
