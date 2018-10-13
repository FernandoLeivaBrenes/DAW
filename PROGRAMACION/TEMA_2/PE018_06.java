public class PE018_06{
  public static void main (String [] args){
    
    double baseImponible = 100;
    int ivaReal = 21;
    
    double calIva = (baseImponible * ivaReal)/ 100;
    
    double totalFact = calIva + baseImponible;
    
    System.out.printf("La base imponible :"+"%10.2f"+"\n", baseImponible);
    System.out.printf("El IVA :"+"%20d"+"%%\n", ivaReal);
    System.out.printf("\n");
    System.out.printf("Costo del iva : "+"%13.2f"+"\n", calIva);
    System.out.printf("\n");
    System.out.printf("Total factura : "+"%13.2f", totalFact);
    }
  }

