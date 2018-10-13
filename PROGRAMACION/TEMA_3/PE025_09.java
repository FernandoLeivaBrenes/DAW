public class PE025_09{
  public static void main(String[] args){
    
    System.out.print("Cone's radius : ");
    double radius = Double.parseDouble(System.console().readLine());
    
    System.out.print("Cone's height : ");
    double height = Double.parseDouble(System.console().readLine());
    
    System.out.println("Processing by cone formula [V=(\u03C0r\u00B2h)\u2153] , where : [V=(\u03C0"+"(\033[31m"+radius+"\u001B[0m)"+"\u00B2"+"\033[31m"+height+"\u001B[0m"+")\u2153] \n");
    
    // Use jave Math class
    double volume = (Math.PI * Math.pow(radius, 2) *height)/3;
    
    System.out.println("Cone's volume : "+volume);
    }
  }
