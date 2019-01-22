/**
 * Devuelve una representacion del array bidimensional multidefinido.
 * 
 * @author Fernando Leiva Brenes
 * 
 * @param num El parametro num puede recoger cualquier numero, incluso 0;
 * 			  Recoge en primer lugar, la cantidad de filas del array;
 * 			  Recoge en segundo lugar, la cantidad de columnas por cada fila (individual);
 * 
 * @return (array [0][1], array[1][5], array[2][3])
 * 
 * 		0
 * 		00000
 * 		000
 */
 
public class ArraysBidimensional_def{
	public static void main(String[] args) {
		
		boolean salir = false;
		System.out.print("Introduce un numero para la generacion de las filas del array: ");
		int num = Integer.parseInt(System.console().readLine());
		int contador = 0;
		int[][] arr = new int[num][];
		
		do{
			if(contador < arr.length){
				System.out.print("Introduce un el numero de comlumnas por cada fila: ");
				num = Integer.parseInt(System.console().readLine());
				arr[contador] = new int[num];
				contador ++;
				}else{
					salir=true;
					}
			}while(!salir);
			
		for(int[] i : arr){
			System.out.print("\n");
			for(int j : i){
				System.out.print(j);
				}
			}
		}
	}
