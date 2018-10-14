public class PE038_13{
  public static void main(String[] args){
    
    System.out.println("Este programa oredenará los valores que introduzca");
    System.out.print("Por favor, introduzca el primer valor : ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.print("Ahora introduzca el segundo valor : ");
    double b = Double.parseDouble(System.console().readLine());
    System.out.print("Por último, introduzca el último valor : ");
    double c = Double.parseDouble(System.console().readLine());
    
    //comprueba que no sean iguales.
    if((a==b)||(a==c)||(c==b)){
      System.out.println("No podemos ordenar numeros iguales");
      }
    double n1=0 , n2=0 , n3=0;
    String aux;
    // matriz para un switch
    if(a>b){
      aux = "+";
    }else{
      aux = "-";
    }
    if(a>c){
      aux += "+";
    }else{
      aux += "-";
    }
    if(b>c){
      aux += "+";
    }else{
      aux += "-";
    }
    //Segun el switch
    switch(aux){
      //abc
      case "+++":
      n1 = a;
      n2 = b;
      n3 = c;
      break;
      //acb
      case "++-":
      n1 = a;
      n2 = c;
      n3 = b;
      break;
      //cab
      case "+--":
      n1 = c;
      n2 = a;
      n3 = b;
      break;
      //cba
      case "---":
      n1 = c;
      n2 = b;
      n3 = a;
      break;
      //bca
      case "--+":
      n1 = b;
      n2 = c;
      n3 = a;
      break;
      //bac
      case "-++":
      n1 = b;
      n2 = a;
      n3 = c;
      break;
      default:;
      }
      System.out.println("["+n1+"] > ["+n2+"] > ["+n3+"]");
  }
}
