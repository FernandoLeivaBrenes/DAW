public class Ejercicio2_1{
	public static int getIfromArr( int[] arrNumAl, int num ){
		int i = 0;
		boolean comp = true;
		while( comp == true && i < arrNumAl.length ){
			if( arrNumAl[i] != num ){
				i++;
				}else{
					comp = false;
					}
			}
		return i + 1;
	}
	
	public static int getReintegroNum( int[] arrNumAl ){
		int reint = (arrNumAl[0])%10;
		return reint;
		}
	
	public static void compareReintnNum( int[] arrNumAl, int num ){
			if( num > 10 && ((getReintegroNum(arrNumAl) == num/1000) || (getReintegroNum(arrNumAl) == num%10)) ){
				System.out.println( "El número "+num+" tiene 5€ de premio por el reintegro." );
				}else{
					System.out.println( "El número "+num+" no tiene premio." );
					}
		}
	
	public static boolean compareNumWArr( int[] arrNumAl, int num ){
		int i = 0;
		boolean comp = true;
		
		while( comp == true && i < arrNumAl.length ){
			if( arrNumAl[i] != num ){
				i++;
				}else{
					comp = false;
					}
			}
		return comp;
	}
	
	public static int generateAlNum(){
		int numRandom = (int)((Math.random()*9999)+1);
		return numRandom;
	}
	
	public static int[] generateArrAlNum(){
		
		int i = 0;
		int[] arrNum = new int[13];
		
		while( arrNum[arrNum.length -1 ] == 0 && i < arrNum.length){
			
			int num = generateAlNum();
			
			if( compareNumWArr( arrNum, num ) == true ){
				arrNum[i] = num;
				i++;
				}
			
			}
		return arrNum;
	}
	
	public static void switchArrPrem( int[] arrNumAl, int i , int m){
		switch(i){
				case 1:
					System.out.printf( "%2dº premio : %4d  ---> 1000€ \n", i, m );
					break;
				case 2:
					System.out.printf( "%2dº premio : %4d  ---> 500€ \n", i, m );
					break;
				case 3:
					System.out.printf( "%2dº premio : %4d  ---> 250€ \n", i, m );
					break;
				default:
					System.out.printf( "%2dº premio : %4d  ---> 50€ \n", i, m );
					break;
				}
		}
	
	public static boolean mostrarArrWQ( int[] arrNumAl, int num ){
		boolean knowIfhad = true;
		if( compareNumWArr(arrNumAl, num) == false ){
			switchArrPrem( arrNumAl, getIfromArr( arrNumAl, num ) ,num );
			knowIfhad = false;
			}
		return knowIfhad;
		}
	
	public static void mostrarArrTotal( int[] arrNumAl ){
		int i = 1;
		for( int m : arrNumAl ){
			switchArrPrem( arrNumAl, i ,m);
			i++;
			}
		System.out.println( "\nTodos los numeros que terminen o empiecen por "+ getReintegroNum( arrNumAl ) );
		}
	
	public static void main (String[] args){
		int[] arrT = generateArrAlNum();
		int recogeDatos;
		boolean salir = false;
		
		System.out.println("[Para salir pulsa 0]\n");
		
		mostrarArrTotal( arrT );
		
		do{
			System.out.print( "\nIntroduce el numero que quieras comprobar : " );
			recogeDatos = Integer.parseInt(System.console().readLine());
			if( recogeDatos > 0 ){
				if( mostrarArrWQ( arrT, recogeDatos ) ){
					compareReintnNum( arrT, recogeDatos);
					}
				}else{
					salir = true;
					}
			}while( !salir );
	}
}
