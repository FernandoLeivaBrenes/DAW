public class PE038_14{
  public static void main(String[] args){
    System.out.print("Introduce un numero: ");
    int num = Integer.parseInt(System.console().readLine());
    //pist es una var auxiliar para saber si se encuentra en ambos rangos.
    int pist = 0;
    String result = "No es par ni divisible entre 5.";
      if((num%2)==0){
        result = "Es divisible entre 2.";
        pist += 1;
      }
      if((num%5)==0){
        result = "Es divisible entre 5.";
        pist += 1;
      }
      if(pist>=2){
        result = "Es divisible entre 2 y 5.";
      }
    System.out.println(result);
    }
  }
