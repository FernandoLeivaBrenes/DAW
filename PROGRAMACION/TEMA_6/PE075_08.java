public class PE075_08{
	public static void main(String[] args){
			System.out.println("Este programa va a mostrar tres jugadas en la quiniela: ");
			System.out.println("");
			
			String printing = "", uno = "|\u001B[31m"+"1"+"\u001B[0m"+"|X|2|", equis = "|1|"+"\u001B[31m"+"X"+"\u001B[0m"+"|2|", dos = "|1|X|"+"\u001B[31m"+"2"+"\u001B[0m|";
			int decision = 0, filas = 15, colum = 3;
			
			do{
				for(int i = 1; i <= colum; i++){
					printing += "El equipo A vs equipo B: ";
					decision = (int)(Math.random()*6);
					switch(decision){
					case 0:
					case 1:
					case 2:
					printing += equis;
					break;
					case 3:
					case 4:
					printing += uno;
					break;
					case 5:
					printing += dos;
					break;
					}
					printing += "    ";
				}
				printing += "\n";
				filas--;
			}while(filas!=0);
			System.out.println(printing);
		}
	}

