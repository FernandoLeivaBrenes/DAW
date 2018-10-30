public class PE074_06{
	public static void main(String[] args){
		int num = (int)(Math.random()*101), cont = 5, numEntr = 0, numMay = 101, numMen = 0;
		String adder, adder2 = "", adder3 = "";
		do{
			System.out.print("Introduce un número, a ver si aciertas: ");
			numEntr = Integer.parseInt(System.console().readLine());
			// comprueba que el numero introducido no sea igual.
			if(numEntr!=num){
				adder = "No has acertado, sigue intentandolo.";
				//comprueba que el numero introducido es mayor que el num aleatorio 
				if(numEntr>num){
					if(numEntr<numMay){
						numMay=numEntr;
						adder2 = numEntr+" >";
						};
					}
				//comprueba que el numero introducido es menor que el num aleatorio 
				if(numEntr<num){
					if(numEntr>numMen){
						numMen=numEntr;
						adder3 = "> "+numEntr;
						};
					}
				
				cont--;
				}else{
					System.out.println("");
					System.out.println("[ Enhorabuena, has acertado. ]");
					break;
					}
					
				System.out.println(adder);
				System.out.println("[ "+adder2+" número adivinar "+adder3+" ]");
				System.out.println(num);
				System.out.println("Te quedan : "+(cont)+" intentos.");
				System.out.println("");
			
			}while(cont!=0);
		
		if(cont==0){
			System.out.println("No has acertado. Reinicia el programa.");
			}
		}
	}
