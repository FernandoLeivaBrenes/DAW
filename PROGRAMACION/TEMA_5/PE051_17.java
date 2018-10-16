public class PE051_17{
  public static void main (String[] args){
    System.out.print("Introduce un numero entero positivo por el que cominece la itinerancia: ");
    int num = Integer.parseInt(System.console().readLine());
    String result;
    //Considerando 0 como una cifra entera sin signo
    if(num<0){
      // comp si el numero es positivo o negativo;
      result = "No puede ser pues el numero suministrado es entero negativo";
      }else{
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //forma de bucle FOR
        int sum = 0, num1 = num;
        num++;
        for(;num<=(num1+100);num++){
          sum += num;
          }
        result="El resultado de la suma de los numeros que se encuentran desde el "+(num1)+" hasta el "+(num1+100)+" es : "+sum;
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //~ una sola linea
        //~ result = "Desarrollo en una sola linea (100*(num+1+(num+100)))/2 == >> "+(((num+1)+(num+100))*100)/2;
        }
        
    System.out.println(result);
    }
  }
