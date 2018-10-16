public class Ex16102018{
  public static void main(String[] args){
    System.out.println("ADIVINA NUMERO -->");
    int num = (int)(Math.random()*100), valMay = 1000, valMen=0, numIntr=0;
    String result = "Si, es ese.", result1="" , result2="";
    while(numIntr!=num){
      System.out.print("Introduce un numero a ver si aciertas :");
      int numIntr1 = Integer.parseInt(System.console().readLine());
      numIntr = numIntr1;
        if(numIntr<num){
          if(numIntr>valMen){valMen=numIntr;}
          result1 = "El numero secreto es mayor que "+ valMen ;
        }else{
            if(numIntr<valMay){valMay=numIntr;}
            result2 = " es menor que "+ valMay ;
        }
        System.out.println(result1+result2);
        System.out.println("Numero a adivinar :"+num);
      }
      System.out.println(result);
    }
  }
