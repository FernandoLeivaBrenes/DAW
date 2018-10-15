public class PE039_17{
  public static void main(String[] args){
    System.out.print("Escribe un numero entero: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.println("La ultima cifra del numero introducido es: "+(num%10));
    }
}
