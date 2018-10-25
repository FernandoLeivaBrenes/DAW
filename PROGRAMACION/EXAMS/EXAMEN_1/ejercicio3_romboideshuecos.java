public class ejercicio3_romboideshuecos{
	public static void main(String[] args){
		System.out.print("Introduce la altura del romboide que debe estar entre 4 y 20: ");
		
		int numeroIntr = Integer.parseInt(System.console().readLine()), numeroEspacios = numeroIntr-1;
		
		System.out.println("");
		
		String romboide;
		if((numeroIntr<4)||(numeroIntr>20)){
			System.out.println("El numero introducido no es correcto. Introduce un número entre 4 y 20.");
			}else{
			//~ Pinta filas
			for(int cuentaAltura = 0 ; cuentaAltura < numeroIntr; cuentaAltura++){
				romboide = "";
				//~ Pinta espacios
				for (int espacios = 0 ; espacios < numeroEspacios; espacios++){
					romboide += " ";
					}
				//~ Pinta asteriscos en primera fila y deja huecos en las demás
				for (int asteriscos = 0 ; asteriscos < numeroIntr; asteriscos++){
					if((cuentaAltura==0)||(cuentaAltura==(numeroIntr-1))){
						romboide += "*";
						}else{
							if ((asteriscos==0)||(asteriscos==(numeroIntr-1))){
							romboide += "*";
							}else{
								romboide += " ";
							}
						}
					}
				numeroEspacios--;
				romboide += "\n";
				System.out.print(romboide);
				}
			}
		}
	}

