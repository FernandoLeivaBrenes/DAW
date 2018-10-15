public class PE040_20{
  public static void main(String[] args){
    System.out.print("Escribe un numero entero: ");
    int num = Integer.parseInt(System.console().readLine());
    int val1,val2,val3,val4,val5;
    String comment;
    // 5 cifras;
    if(num>=10000){
      //asignación de numeros;
      val1 = num/10000;
      val2 = (num/1000)%10;
      val3 = (num/100)%10;
      val4 = (num/10)%10;
      val5 = (num%10);
      //decidir si es capicuo;
      if (val1==val5){
        if(val2==val4){
          comment = "Si es capicúa.";
          }else{
            comment = "No es capicúa.";
            }
        }else{
          comment = "No es capicúa.";
          }
      //4 cifras;
      }else if(num>=1000){
        //asignación de numeros;
        val1 = num/1000;
        val2 = (num/100)%10;
        val3 = (num/10)%10;
        val4 = (num%10);
        //decidir si es capicuo;
        if (val1==val4){
          if(val2==val3){
            comment = "Si es capicúa.";
            }else{
              comment = "No es capicúa.";
              }
          }else{
            comment = "No es capicúa.";
            }
        //3 cifras;
        }else if(num>=100){
          //asignación de numeros;
          val1 = num/100;
          val2 = (num/10)%10;
          val3 = (num%10);
          //decidir si es capicuo;
          if (val1==val3){
            comment = "Si es capicúa.";
            }else{
              comment = "No es capicúa.";
              }
          //2 cifras;
          }else if(num>=10){
            val1 = num/10;
            val2 = num%10;
            //decidir si es capicuo;
            if (val1==val2){
              comment = "Si es capicúa.";
              }else{
                comment = "No es capicúa.";
                }
            //1 cifra;
            }else{
              comment = "No puede ser capicúo.";
              }
    System.out.println(comment);
    }
  }
