/**
 * 
 * Escribe un programa que, a partir de 2 enteros introducidos por el usuario, diga cuántos dígitos
 * del primer número están en el segundo número. Se recomienda usar long en lugar de int ya que el primero
 * admite números más largos.
 * 
 * @author Fernando Leiva Brenes
 */
public class Ejercicio_2_A{
	
	public static int getLengthOfLong ( long arr ){
		int counter = 1;
		long diezMult = 10;
		boolean salir = false;
		
		while(!salir){
			if((arr / diezMult) != 0){
				counter++;
				diezMult = diezMult * 10;
				}else{
					salir=true;
					}
			}
			return counter;
		}
		
	public static void setDigOnArray( int[][] arr, int index, long numero ){
		int contador=1;
		long diezMult = 10;
		long numeroDescompuesto = 0;
		
		while( contador <= arr[index].length ){

			if(contador==1){
				numeroDescompuesto = numero%diezMult;
				}else{
					numeroDescompuesto = (numero % diezMult)/(diezMult/10);
					}
		
			diezMult = diezMult * 10;
			arr[index][arr[index].length - contador] = (int)(numeroDescompuesto);
			contador ++;
			}
		}
		
	public static int compararDig( int[][] arr ){
		boolean salir = false;
		int contadorRep=0;
		
		for(int i=0; i < arr[0].length; i++){
			for(int j=0; j < arr[1].length && !salir; j++){
				if( arr[0][i] == arr[1][j] ){
					contadorRep++;
					salir = true;
					}
				}
				salir=false;
			}
			return contadorRep;
		}
		
	public static void getNum(){
		long numero, numero_1 = 0, numero_2 = 0;
		int[][] arr = new int[2][];
		
		for(int i = 0; i <= 1; i++){
				System.out.print("Por favor, introduzca un número entero positivo: ");
				numero = Long.parseLong(System.console().readLine());
				
				if(i==0){
					arr[i] = new int[getLengthOfLong(numero)];
					numero_1 = numero;
					setDigOnArray(arr, i, numero);
					}else{
						arr[i] = new int[getLengthOfLong(numero)];
						numero_2 = numero;
						setDigOnArray(arr, i, numero);
						}
			}
		System.out.println("En el número "+numero_1+" hay "+compararDig(arr)+" dígitos que están en el número "+numero_2+".");
			for(int[] i : arr){
				for(int j : i){
					System.out.print(j);
					}
					System.out.println();
				}
		}
	public static void main(String[] args){
		getNum();
		}
	}
