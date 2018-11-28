import jarraFunctions.*;

public class Jarras{
	public static void main(String[] args){
		
		double[] jarra1 = new double[2];
		
		jarra1[0] = 7;
		
		llenarjarra.llenarjarra(jarra1);
		vaciarjarra.vaciarjarra(jarra1);
		
		for(double n:jarra1){
			System.out.println(n);
			}
		
		}
	}
