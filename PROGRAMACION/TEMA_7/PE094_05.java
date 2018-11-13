public class PE094_05{
	public static void main(String[] args){
		int[] numF1= new int[10];//, numF2 = new int[2];
		String fil_num = "" ,array_n = "";
		
		for(int i = 0 ; i < numF1.length; i++){
				System.out.print("Introduce "+(i+1)+" numero : ");
				int numintro = Integer.parseInt(System.console().readLine());
				//~ vamos a introducir los valores con movimientos;
				fil_num+= " "+numintro;
				//~ Forma ----------------- 1 : Recuperando todos los valores;
				//~ comprueba que este numero introducido sea mayor que el primer valor del array(Que siempre sera mayor);
				if(numintro >= numF1[0]){
					//~ recorre el array al reves
					for(int j=numF1.length; j<0; j--){
						numF1[j-2]=numF1[j-1];
						};
					numF1[0]=numintro;
				}else{
					int j=0;
					while(numintro<numF1[j]){j++;}
					numF1[j+1]=numintro;
					}
			}
			System.out.println("\n"+fil_num);
			for(int i= 0; i<numF1.length; i++){System.out.print(" "+numF1[i]);}
		}
	}


