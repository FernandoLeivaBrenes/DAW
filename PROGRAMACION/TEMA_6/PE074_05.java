public class PE074_05{
	public static void main(String[] args){
		int num, numMay=0, numMen = 200 , loops = 50 , sum = 0;
		
		String linea = ""; 
		
		while(loops!=0){
			num =  (int)((Math.random()*100)+100);
			if((loops%10)==1){
				linea += " "+num+"\n";
				}else{
					linea += " "+num;
					}
			if(num>numMay){numMay=num;}
			if(num<numMen){numMen=num;}
			sum += num;
			loops--;
			}
		
		System.out.println(linea);
		System.out.println("El número menor es : "+numMen);
		System.out.println("El número mayor es : "+numMay);
		System.out.println("La media es : "+sum/50);
		
		}
	}
