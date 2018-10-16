public class PE051_21{
  public static void main(String[] args){
    int num=0, acum=0, impMedAcum=0, impMedSum=0, parMay=0;
    //~ Mientras el numero no sea menor que 0;
    while(!(num<0)){
      System.out.print("Introduce un numero [para detenerlo escribe uno negativo] :");
      num = Integer.parseInt(System.console().readLine());
      //~ Comprueba que sea mayor que 0;
      if(num>=0){
        //~ Aumentael contador de numero en 1;
        acum++;
        if((num%2)==0){
          //~ Indicar el mayor par introducido;
          if(num>parMay){parMay=num;}
          }else{
            //~ Aumento del acumulador del Impar;
            impMedAcum++;
            //~ Suma Impares antes de hacer la media;
            impMedSum += num;
          }
        }
      //~ Si no es mayor que 0.Se termina la ejecucion del bucle al comienzo de la siguiente repeticion.
    }
    System.out.println("Se han introducido: "+acum+" numero/s");
    System.out.println("La media de los impares es: "+(impMedSum/impMedAcum));
    System.out.println("El mayor de los pares es: "+parMay);
  }
}
