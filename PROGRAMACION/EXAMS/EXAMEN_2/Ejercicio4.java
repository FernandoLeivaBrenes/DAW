public class ejercicio4{
	
	public static boolean addible( int[][] arrNum, int num ){
		boolean rep = true;
		
		for( int i =0; i<100 && rep ; i++){
			if( num == arrNum[i][0] ){
				rep = false;
				arrNum[i][1] += 1;
			};
		};
		return rep;
	};
	//~ -------------------------------------------------------------------------------------
	public static void inserta( int[][] arrNum, int num ){
			
			int i = 0;
			boolean added = true;
			
			while( i < 100 && added && addible( arrNum, num )){
				if ( arrNum[i][1] == 0 ){
					arrNum[i][0] = num;
					arrNum[i][1] = 1;
					added = false;
				};
				i++;
			};
	};
	//~ -------------------------------------------------------------------------------------
	public static boolean comprobarNum( int num ){
		boolean numCorrecto = true;
			if( num < 0 || num > 100){
				numCorrecto = false;
			}
		return numCorrecto;
	};
	//~ -------------------------------------------------------------------------------------
	public static void mostrar( int[][] arrNum ){
		boolean mostrable = true;
		System.out.println();
		for( int i = 0; i < 100 && mostrable == true; i++ ){
			
			if( arrNum[i][1] > 0 ){
				
				System.out.print("  "+arrNum[i][0]+" : ");
				
				int contador = arrNum[i][1];
				
				while( contador != 0 ){
					System.out.print("*");
					contador--;
				};
				System.out.println();
				
			}else{
				mostrable = false;
			};
		};
	};
	//~ -------------------------------------------------------------------------------------
	public static void main (String[] args){
		
		int[][] arrNum = new int[100][2];
		int num;
		boolean fin=false;
		
		while( fin == false ){	
			System.out.print("Introduzca un valor : ");
			num = Integer.parseInt(System.console().readLine());
			
			if( comprobarNum(num) && num != -1 ){ 
				inserta( arrNum, num );
			}else if( num == -1 ){
				fin = true;
			}else if( comprobarNum(num) == false ){
				System.out.println("Este numero no era correcto.");
			};
		};
		mostrar( arrNum ); 
	};
};
