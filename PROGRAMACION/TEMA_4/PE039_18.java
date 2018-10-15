public class PE039_18{
  public static void main(String[] args){
    System.out.print("Escribe un numero entero: ");
    int num = Integer.parseInt(System.console().readLine());
    String comment;
    if(num>=10000){
      num = num/10000;
      comment = " .Tiene un minimo de 5 cifras.";
      }else if(num>=1000){
        num = num/1000;
        comment = " .Tiene un minimo de 4 cifras.";
        }else if(num>=100){
          num = num/100;
          comment = " .Tiene un minimo de 3 cifras.";
          }else if(num>=10){
            num = num/10;
            comment = " .Tiene un minimo de 2 cifras.";
            }else{
              comment = " .Tiene un minimo de 1 cifras.";
              }
    System.out.println("La primera cifra del numero introducido es: "+num+comment);
    }
  }
