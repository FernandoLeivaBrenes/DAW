public class PE038_11{
  public static void main(String[] args){
    System.out.print("Inserta la hora con el formato [HH:MM] : ");
    String strngHora = System.console().readLine(), HH, MM;
    // Dividir el string entre dos por el simbolo ":"
    String[] parts = strngHora.split(":");
    HH = parts[0];
    MM = parts[1];
    
    // Total minutos en el dia
    int segDia = 86400;
    
    // Total mm pasados
    int totalSeg = segDia - ((Integer.parseInt(MM)*60) + (Integer.parseInt(HH) * 3600));
    
    // revision pre instance
    int seg = totalSeg%60;
    int minut = (totalSeg/60)%60;
    int hour = totalSeg/3600;
    
    // total seg to midnight
    if(totalSeg >= 3600){      
      System.out.println("Quedan "+hour+"horas, "+minut+" minutos y "+seg+" segundos para la media noche.");
    }else if(totalSeg >= 60){
      System.out.println("Quedan "+minut+" minutos y "+seg+" segundos para la media noche.");
      }else{
        System.out.println("Quedan "+totalSeg+" segundos para la media noche.");
        }
    }
  }
