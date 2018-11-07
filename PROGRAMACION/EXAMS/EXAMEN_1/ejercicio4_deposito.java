public class ejercicio4_deposito{
	public static void main(String[] args){
		
		//~ Se tendrá en cuenta la catidad añadida mensualmente.
		
		System.out.print("Introduce el depósito inicial : ");
		double saldoInicial = Double.parseDouble(System.console().readLine());
		
		System.out.print("Introduce la rentabilidad mensual : ");
		double rentabilidadMe = Double.parseDouble(System.console().readLine());
		
		System.out.print("Introduce la cantidad que se desea alcanzar : ");
		double cantidadDeseada = Double.parseDouble(System.console().readLine());
		
		double rentabilidad = 0;
		int meses = 0; 
		
		do{
			rentabilidad = (saldoInicial*rentabilidadMe)/100;
			saldoInicial += rentabilidad;
			meses++;
			}while(saldoInicial<cantidadDeseada);
			//~ Si el saldoInicial es menor que cantidadDeseada despues del hacer este bucle de operaciones,
			//~ se hará un nuevo avance para que lo supere por un minimo.
			if(saldoInicial<cantidadDeseada){
				rentabilidad = (saldoInicial*rentabilidadMe)/100;
				saldoInicial += rentabilidad;
				meses++;
				}
		System.out.printf("Tardarás "+meses+" en adquirir %.2f € que es la cantidad más cercana a %.2f €.", saldoInicial, cantidadDeseada);
		
		}
	}
