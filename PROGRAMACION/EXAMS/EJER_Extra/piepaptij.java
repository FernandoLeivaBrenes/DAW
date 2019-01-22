/**
 * Juego de piedra papel o tijeras.
 * @author Fernando Leiva Brenes 
 */
public class piepaptij{
	
	public static boolean jugarPartida(){
		int jugadaOrdenador = (int)((Math.random()*3)+1);
		//~ comprobar las jugadas del ordenador -->
		//~ System.out.print(jugadaOrdenador);
		
		System.out.print("\n Piedra [1] , Papel [2] o Tijeras [3] : ");
		int jugada = Integer.parseInt(System.console().readLine());
		
		
		boolean ganar = false;

		switch(jugadaOrdenador){
			case 1:
				switch(jugada){
				case 2:
					ganar = true;
				break;
				}
			break;
			case 2:
				switch(jugada){
				case 3:
					ganar = true;
				break;
				}
			break;
			case 3:
				switch(jugada){
				case 1:
				ganar = true;
				break;
				}
			break;
			}
		
		System.out.println(" Jugada del Ordenador : "+jugadaOrdenador);
		
		return ganar;
		}
		
	public static int partida( boolean partidaJugada ){
		int result = 0;
		if (partidaJugada==true){
			result++;
			}
		return result;
		}
	
	public static void resultadopartida(int cantPar, int partidaGanada){
		if( partidaGanada > cantPar/2){
			System.out.println("Has ganado las partidas.");
			}else{
				if(partidaGanada < cantPar/2){
					System.out.println("Has perdido las partidas.");
					}else{
						System.out.println("Has quedado empate.");
						}
				}
		}
	
	public static void main(String[] args){
		System.out.print("Introduce la cantidad de partidas que quieras jugar: ");
		int cantPar = Integer.parseInt(System.console().readLine());
		int partidaGanada = 0;
		
		for(int i=1; i<=cantPar; i++){
			System.out.println();
			System.out.println("\n Partidas a jugar : "+cantPar+"\n Partidas jugadas : "+(i-1)+"\n Partidas ganadas: "+partidaGanada);
			partidaGanada += partida(jugarPartida());
			System.out.println("\n Partidas jugadas : "+i+"	Partidas ganadas: "+partidaGanada+"\n");
			}
			resultadopartida(cantPar, partidaGanada);
			//------------------------
		}
	}
