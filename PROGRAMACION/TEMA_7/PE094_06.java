public class PE094_06{
	public static void main(String[] args){
		int[] numero= new int[15];
		int contador = 0 , addnumeracion = 0 , addLastIndex = 0;
		String numeracion = "";
		
		do{
			System.out.printf("Introduzca el %2dª valor : ", contador+1);
			addnumeracion = Integer.parseInt(System.console().readLine());
			numeracion += "  "+addnumeracion;
			numero[contador] = addnumeracion;
			contador++;
		}while(contador<numero.length);
		
			addLastIndex = numero[(numero.length)-1];
		for(int i = numero.length-1 ; i>0; i--){
			numero[i] = numero[i-1];
			}
			numero[0]=addLastIndex;
		
		System.out.println("\n"+ numeracion);
		for(int i: numero){
			System.out.printf(" %2d",i);
			}
		}
	}



