public class PE041_23{
  public static void main(String[] args){
    
    System.out.print("Introduzca la base imponible: ");
    double bImp = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    String tIVA = System.console().readLine();
    int iva;
    switch(tIVA){
      case "general":
      iva = 21;
      break;
      case "reducido":
      iva = 10;
      break;
      case "superreducido":
      iva = 4;
      break;
      default:
      System.out.println("Se usará como IVA el tipo general.");
      iva = 21;
    }
    double ivaRes = ((double)iva/100)*bImp, ivaRes2 = ivaRes+bImp;
    
    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    String codPro = System.console().readLine();
    double proRes = 0;
    switch(codPro){
      case "nopro":
      break;
      case "mitad":
      proRes = ivaRes2/2;
      break;
      case "meno5":
      proRes = 5;
      break;
      case "5porc":
      proRes = (ivaRes2*0.05);
      break;
      default:
      System.out.println("Se usará como promoción : ninguna.");
    }
    System.out.println("");
    System.out.printf("Base imponible         %10.2f\n",bImp);
    System.out.printf("IVA (%2s%%)              %10.2f\n", iva, ivaRes);
    System.out.printf("Precio con IVA         %10.2f\n", ivaRes2);
    System.out.printf("Cod. promo. (%5s):  -%10.2f\n", codPro, proRes);
    System.out.printf("TOTAL                  %10.2f", ivaRes2-proRes);
    
    }
  }
