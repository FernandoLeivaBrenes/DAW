//import java.util.*;

public class ascensor{
	
	//Scanner sc = new Scanner(System.in);
	
	public static int personas(){
		int personasG;
		System.out.print("¿Cuántas personas se suben? : ");
		personasG = Integer.parseInt(System.console().readLine());
		return personasG;
	}
	
	public static double[] recogePeso(){
		
		int personasG = personas();
		double peso;
		double[] recogerPeso = new double[personasG];
		boolean pesoNulo = true;
		
		personasG --;
		do{
			System.out.print("¿Cuales son sus pesos? : ");
			peso = Double.parseDouble(System.console().readLine());
			System.out.print("personas restantes : "+personasG);
			if( peso <= 0 ){
				pesoNulo = false;
			};
			personasG--;
		}while( personasG != 0 );//pesoNulo == true  );
		return recogerPeso;
	};
	
	public static void mostrar( double[] arrPesos ){
		for(double ii : arrPesos){
			System.out.println("Peso : "+arrPesos);
		};
	}
	
	public static void main (String [] args ){
		double[] arrPeso = recogePeso();
		mostrar(arrPeso);
	}
}
