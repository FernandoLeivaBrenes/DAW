public class PE025_11{
  public static void main (String[] args){
    
    System.out.print("Kilobytes to convert : ");
    double Kb = Double.parseDouble(System.console().readLine());
    
    double Mb = Kb * 0.00098;
    
    System.out.println(Kb+" Kb --> "+Mb+" Mb");
    
    }
  }
