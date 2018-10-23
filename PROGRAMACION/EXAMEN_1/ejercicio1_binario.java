public class ejercicio1_binario{
	public static void main(String[] args){
		System.out.print("Introduce un número entre 0 y 9999: ");
		
		int numeroIntr = Integer.parseInt(System.console().readLine()), dividendo = numeroIntr, resto = 0;
		
		String strBinario = "";
		
		if((numeroIntr<0)||(numeroIntr>9999)){
			System.out.print("El numero introducido no es correcto. Introduce un número entre 0 y 9999.");
			}else{
				do{
					resto = dividendo%2;
					strBinario = resto + strBinario;
					dividendo = dividendo/2;
					}while(dividendo>0);
				
				System.out.print( "El número "+numeroIntr+" es : "+strBinario+" en binario");
			}
		}
	}
