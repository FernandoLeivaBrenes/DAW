public class PE094_07{
	public static void main(String[] args){
		int[] numero= new int[100];
		int contador = 0, contador1 = 1, addnumeracion = 0 ;
		String numeracion = "", salto = "";
		
		do{
			addnumeracion = (int)(Math.random()*21);
			numeracion += " "+addnumeracion;
			numero[contador] = addnumeracion;
			contador++;
		}while(contador<numero.length);

		for(int i = numero.length-1 ; i>0; i--){
			numero[i] = numero[i-1];
			}

		System.out.println("\n"+ numeracion);
		for(int i: numero){

			if( ((contador1%10) == 0)){
				System.out.printf(" %4d\n",i );
				}else{
					System.out.printf(" %4d",i );
					}
					
			contador1++;
			}
		}
	}
