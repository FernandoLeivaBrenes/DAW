public class PE075_09{
	public static void main (String[] args){
		System.out.println("Numeros aleatorios : \n\n");
		int contador = 0, num = 0, columna = 0;
		do{
			num = (int)(Math.random()*101);
			if((num%2)==0&&columna==9){
				System.out.print(String.format("%3s", num)+"\n");
				columna=0;
				contador++;
			}else if((num%2)==0){
					System.out.print(String.format("%3s", num)+" ");
					contador++;
					columna++;
				}
			}while(num!=24);
			System.out.print("\n\nEl numero de numeros ha sido: "+contador);
		}
	}
