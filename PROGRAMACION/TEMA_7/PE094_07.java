public class PE094_07{
	public static void main(String[] args){
		int[] numero= new int[100];
		int contador = 0, varMixt= 0,varMixtAr[] = new int[2];
		String numeracion = "";
		
		do{
			varMixt = (int)(Math.random()*21);
			numeracion += " "+varMixt;
			numero[contador] = varMixt;
			contador++;
		}while(contador<numero.length);
		
		contador = 1;
		varMixt = 0;
		for(int i: numero){

			if( ((contador%10) == 0)){
				System.out.printf(" %4d\n",i );
				}else{
					System.out.printf(" %4d",i );
					}
					
			contador++;
			}
			
		for( int i= 0; i<=1; i++){
			System.out.print("\nIntroduzca la posicion "+(i+1)+" : ");
			varMixtAr[i] = Integer.parseInt(System.console().readLine());
			}
		
		if((varMixtAr[0]>=0 || varMixtAr[0]<=99)&&(varMixtAr[1]>=0 || varMixtAr[1]<=99)){
			varMixt = numero[varMixtAr[0]];
			numero[varMixtAr[0]] = numero[varMixtAr[1]];
			numero[varMixtAr[1]] = varMixt;	
			} else{
				System.out.println("Error. You need to introduce a numero between 0 and 99.");
				}
				
		contador = 1;
		for(int i: numero){
			if( ((contador-1)==varMixtAr[0]) || ((contador-1)==varMixtAr[1]) ){
				
				if( ((contador%10) == 0)){
					System.out.print(" '"+i+"'\n");
					}else{
						System.out.print(" '"+i+"'");
					}

				}else{
					
				if( ((contador%10) == 0)){
					System.out.printf(" %4d\n",i );
					}else{
						System.out.printf(" %4d",i );
					}
					
				}
			contador++;
			}
			
		}
	}
