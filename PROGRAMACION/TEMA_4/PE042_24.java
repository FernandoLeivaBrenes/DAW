public class PE042_24{
  public static void main(String[] args){
    
    int sueldoBase, dieta = 30, irpf;
    
    System.out.print("[ 1 - Programador JUNIOR ]\n[ 2 - Programador SENIOR ]\n[ 3 -  Jefe de Proyecto  ]\n");
    System.out.print("Introduce el cargo del empleado [ 1 - 3 ]: ");
    int cargoEmpleado = Integer.parseInt(System.console().readLine());
  
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes? : ");
    int dietaEmpleado = Integer.parseInt(System.console().readLine());
  
    System.out.print("Introduce el estado civil del empleado [ 1 - Soltero, 2 - Casado ]: ");
    int civilEstadoEmpleado = Integer.parseInt(System.console().readLine());
  
    switch(cargoEmpleado){
      case 1:
        sueldoBase = 950;
      break;
      case 2:
        sueldoBase = 1200;
      break;
      case 3:
        sueldoBase = 1600;
      break;
      default:
        sueldoBase = 950;
        System.out.println("Entiendo que sera programador JUNIOR.");
      ;}
      
    switch(civilEstadoEmpleado){
      case 2:
        irpf = 20;
      break;
      case 1:
        irpf = 25;
      break;
      default:
        irpf = 25;
        System.out.println("Entiendo que estará soltero.");
    }
    
    double sueldoBruto = sueldoBase+(dietaEmpleado*dieta), valorIRPF = (sueldoBruto*irpf)/100;
    
    System.out.println("");
    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    System.out.printf("x Sueldo base                    %7.2f x\n", (double)sueldoBase);
    System.out.printf("x Dieta ( %2s viajes)             %7.2f x\n", dietaEmpleado, (double)dietaEmpleado*dieta);
    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    System.out.printf("x Sueldo bruto                   %7.2f x\n", sueldoBruto);
    System.out.printf("x Retención IRPF ( %2s %%)         %7.2f x\n", irpf, valorIRPF);
    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    System.out.printf("x Sueldo neto                    %7.2f x\n", (double)sueldoBruto-valorIRPF);
    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
  
  }
}
