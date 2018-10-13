public class Ejercicio_4{
  public static void main (String[] args){
    
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String amarillo = "\033[33m";
    String azul = "\033[34m";
    String cyan = "\033[36m";
    String blanco = "\033[37m";
    String magenta = "\033[35m";
    
    String L1, L2, L3, L4, L5, L6, M1, M2, M3, M4, M5, M6, X1, X2, X3, X4, X5, X6, J1, J2, J3, J4, J5, J6, V1, V2, V3, V4, V5, V6;
    
    //Asignacion de materias/dia/hora
    L1=L2=L3=V1=V2=V3= amarillo + "SIN";
    L4=L5=L6= magenta + "FOL";
    M1=M2=M3=X4=X5=X6=J2=J3= blanco + "PRO";
    X1=J1=V4= rojo + "EED";
    X2=X3=V5=V6= azul + "LMA";
    M4=M5=M6=J4=J5=J6= cyan + "BBD";
    
    //Para asignar valores * comentar las lineas de arriba y descomentar la siguiente.
    //L1=L2=L3=L4=L5=L6=M1=M2=M3=M4=M5=M6=X1=X2=X3=X4=X5=X6=J1=J2=J3=J4=J5=J6=V1=V2=V3=V4=V5=V6= blanco + "***";
    
    //Primera linea
    System.out.printf( "   " + verde + "\u2554" + "\u2550\u2550\u2550" + "\u2564" + "\u2550\u2550\u2550" + "\u2564" + "\u2550\u2550\u2550" + "\u2564" + "\u2550\u2550\u2550" + "\u2564" + "\u2550\u2550\u2550" + "\u2557"+"\n");
    //Linea Semanal
    System.out.printf( "   " + verde + "\u2551" + "%-3s" + verde +"\u2502"+ "%-3s" + verde +"\u2502" + "%-3s" + verde +"\u2502" + "%-3s" + verde +"\u2502" + "%-3s" + verde +"\u2551" + "\n" , "LUN" , "MAR" , "MIE" , "JUE" , "VIE");
    //inicio
    System.out.printf( "   " + verde + "\u2551" + "\u2500\u2500\u2500" + "\u253C"+ "\u2500\u2500\u2500" + "\u253C" + "\u2500\u2500\u2500" + "\u253C" + "\u2500\u2500\u2500" + "\u253C" + "\u2500\u2500\u2500" + "\u2551" + "\n" );
    //Segunda linea (repetible)
    System.out.printf( "1º " + verde + "\u2551" + "%-3s" + verde +"\u2502"+ "%-3s" + verde +"\u2502" + "%-3s" + verde +"\u2502" + "%-3s" + verde +"\u2502" + "%-3s" + verde +"\u2551" + "\n" , L1 , M1 , X1 , J1 , V1);
    //Tercera linea (repetible)
    System.out.printf( "   " + verde + "\u2551" + "\u2500\u2500\u2500" + "\u253C"+ "\u2500\u2500\u2500" + "\u253C" + "\u2500\u2500\u2500" + "\u253C" + "\u2500\u2500\u2500" + "\u253C" + "\u2500\u2500\u2500" + "\u2551" + "\n" );
    //Copia Segunda
    System.out.printf( "2º " + verde + "\u2551" + "%-3s" + verde +"\u2502"+ "%-3s" + verde +"\u2502" + "%-3s" + verde +"\u2502" + "%-3s" + verde +"\u2502" + "%-3s" + verde +"\u2551" + "\n" , L2 , M2 , X2 , J2 , V2);
    //Copia Tercera
    System.out.printf( "   " + verde + "\u2551" + "\u2500\u2500\u2500" + "\u253C"+ "\u2500\u2500\u2500" + "\u253C" + "\u2500\u2500\u2500" + "\u253C" + "\u2500\u2500\u2500" + "\u253C" + "\u2500\u2500\u2500" + "\u2551" + "\n" );
    //Copia Segunda
    System.out.printf( "3º " + verde + "\u2551" + "%-3s" + verde +"\u2502"+ "%-3s" + verde +"\u2502" + "%-3s" + verde +"\u2502" + "%-3s" + verde +"\u2502" + "%-3s" + verde +"\u2551" + "\n" , L3 , M3 , X3 , J3 , V3);
    //Copia Tercera
    System.out.printf( "   " + verde + "\u2551" + "\u2500\u2500\u2500" + "\u253C"+ "\u2500\u2500\u2500" + "\u253C" + "\u2500\u2500\u2500" + "\u253C" + "\u2500\u2500\u2500" + "\u253C" + "\u2500\u2500\u2500" + "\u2551" + "\n" );
    //Copia Segunda
    System.out.printf( "4º " + verde + "\u2551" + "%-3s" + verde +"\u2502"+ "%-3s" + verde +"\u2502" + "%-3s" + verde +"\u2502" + "%-3s" + verde +"\u2502" + "%-3s" + verde +"\u2551" + "\n" , L4 , M4 , X4 , J4 , V4);
    //Copia Tercera
    System.out.printf( "   " + verde + "\u2551" + "\u2500\u2500\u2500" + "\u253C"+ "\u2500\u2500\u2500" + "\u253C" + "\u2500\u2500\u2500" + "\u253C" + "\u2500\u2500\u2500" + "\u253C" + "\u2500\u2500\u2500" + "\u2551" + "\n" );
    //Copia Segunda
    System.out.printf( "5º " + verde + "\u2551" + "%-3s" + verde +"\u2502"+ "%-3s" + verde +"\u2502" + "%-3s" + verde +"\u2502" + "%-3s" + verde +"\u2502" + "%-3s" + verde +"\u2551" + "\n" , L5 , M5 , X5 , J5 , V5);
    //Copia Tercera
    System.out.printf( "   " + verde + "\u2551" + "\u2500\u2500\u2500" + "\u253C"+ "\u2500\u2500\u2500" + "\u253C" + "\u2500\u2500\u2500" + "\u253C" + "\u2500\u2500\u2500" + "\u253C" + "\u2500\u2500\u2500" + "\u2551" + "\n" );
    //Copia Segunda
    System.out.printf( "6º " + verde + "\u2551" + "%-3s" + verde +"\u2502"+ "%-3s" + verde +"\u2502" + "%-3s" + verde +"\u2502" + "%-3s" + verde +"\u2502" + "%-3s" + verde +"\u2551" + "\n" , L6 , M6 , X6 , J6 , V6);
    //Final
    System.out.printf( "   " + verde + "\u255A" + "\u2550\u2550\u2550" + "\u2567"+ "\u2550\u2550\u2550" + "\u2567" + "\u2550\u2550\u2550" + "\u2567" + "\u2550\u2550\u2550" + "\u2567" + "\u2550\u2550\u2550" + "\u255D" + "\n" );
    }
  }
