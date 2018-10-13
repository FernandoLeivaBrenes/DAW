public class PE025_10{
  public static void main (String[] args){
    
    System.out.print("Megabytes to convert : ");
    float Mb = Float.parseFloat(System.console().readLine());
    
    float Kb = Mb * 1024;
    
    System.out.println(Mb+" Mb --> "+Kb+" Kb");
    
    }
  }
