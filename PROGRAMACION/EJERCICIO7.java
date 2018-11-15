public class EJERCICIO7{
	public static void main(String[] args){
		//~ Crear array contenedor
		String[][] campoMina = new String[7][7];
		
		int coordenadas_X = 0, coordenadas_Y = 0, nMinas = (int)((Math.random()*6)+3);
		
		boolean dead = false;
		//~ ---------------------- SET MINES --------------------//
			int mina_x = 0, mina_y = 0;
			for( int cantMina=0; cantMina <= nMinas; cantMina++){
				mina_x = (int)(Math.random()*7);
				mina_y = (int)(Math.random()*7);
				campoMina[mina_y][mina_x] = "M";
				mina_x=0;
				mina_y=0;
				}
		//~ ----------------------------------------------------//
		//~ --------------------SET TREASURE--------------------//
			int treasure_x = 0, treasure_y = 0;
			treasure_x = (int)(Math.random()*7);
			treasure_y = (int)(Math.random()*7);
			campoMina[treasure_y][treasure_x] = "T";
		//~ ----------------------------------------------------//
		//~ ----------------- IMPRIMIR ARRAY --------------//
			int cont_x = 7, cont_y = 1;
			for(int seven=0; seven<=cont_x; seven++){
				System.out.print( " "+"-"+ seven +"-" );
				}
			System.out.println("");
			for(String[] i : campoMina){
				System.out.print( " "+"-"+ cont_y++ +"-" );
				for(String j : i){
					//comprueba si es null y si no lo es muestra el resultado
					if( j==null ){
							System.out.print( " " + "[ ]" );
						}else{
							System.out.print( " " + "["+j+"]" );
						}
					
					}
				System.out.println("");
				}
		//~ -----------------------------------------------//
		}
	}
