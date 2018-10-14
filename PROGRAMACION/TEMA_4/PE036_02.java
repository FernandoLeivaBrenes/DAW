public class PE036_02{
  public static void main (String[] args){
    System.out.print("What time is it ? : ");
    int hour = Integer.parseInt(System.console().readLine());
    
    String greet;
    
    if ((hour >= 6) && (hour <=12)){
        greet = "Good morning !!";
      }else if((hour >= 13) && (hour <= 20 )){
        greet = "Good afternoon !!";
      }else if((hour >= 21) && (hour < 24)){
        greet = "Good night !!";
      }else if((hour >= 0) && (hour <= 5)){
        greet = "Good night !!";
      }else{
        greet = "Must introduce correct hour.";
        }
        System.out.println(greet);
    }
  }
