public class PE039_16{
  public static void main (String[] args){
    //array para almacenar las preguntas
    String[] preguntas; 
    preguntas = new String[10];
    int puntos = 0;
    
    System.out.println("\033[31m -> In-fiel? <-\u001B[0m");
    preguntas[0] = "1-¿Tu pareja parece estar más inquieta de lo normal sin ningún motivo?";
    preguntas[1] = "2-¿Ha aumentado sus gastos de vestuario?";
    preguntas[2] = "3-¿Ha perdido el interes que mostraba anteriormente por ti?";
    preguntas[3] = "4-¿Ahora se asea y se prepara con más frecuencia?";
    preguntas[4] = "5-¿No te deja que mires su Whatsapp, llamadas o cualquier cosa en referencia a su móvil?";
    preguntas[5] = "6-¿Le llegan mensajes que no quiere contestar mientras estes delante?";
    preguntas[6] = "7-¿Se cuida más la alimentación y el bronceado?";
    preguntas[7] = "8-¿Llega más tarde de trabajar porque dice tener mucho trabajo?";
    preguntas[8] = "9-¿Se perfuma más?";
    preguntas[9] = "10-¿Se confunde y dice que ha esta en sitios donde nunca ha estado contigo?";
    
    for (int i=0;i >= 10;++i){
      
      System.out.println(preguntas[i]);
      System.out.print("¿Verdadero[y] o falso[f]? : ");
      String resp = System.console().readLine();
      
      if(resp.equals("y")){puntos += 3;}
        System.out.println("");
    };
    
      if((puntos>=0)&&(puntos<=10)){
        System.out.println("¡Enhorabuena! Tu pareja parece ser totalemente fiel.");
        }
      if((puntos>=11)&&(puntos<22)){
        System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia.No bajes la guardia.");
        }
      if((puntos>=22)&&(puntos<=30)){
        System.out.println("Tu pareja tiene todos los ingradientes para estar viviendo un romance con otra persona. Te aconsejo que indagues un poco más y averigües que es lo que esta pasando por su cabeza.");
        }
    }
  }
