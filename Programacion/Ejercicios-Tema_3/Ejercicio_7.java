public class Ejercicio_7{
  public static void main(String[] args){
  
  double iva = 21;
  
  System.out.print("Indicar base imponible: ");
  
  double bImp = Double.parseDouble(System.console().readLine());
  
  System.out.println("Base Imponible : "+bImp);
  
  double result = (iva/100)* bImp;
  double result1 = ((iva/100)+1)* bImp;
  
  System.out.println("IVA : "+iva+"  trabajo del iva : "+ result);
  System.out.println("Factura : "+result1);
  
    }
  }
