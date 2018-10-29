public class PE074_04{
	public static void main(String[] args){
		int num, loops = 20;
		String linea = ""; 
		while(loops!=0){
			num =  (int)(Math.random()*11);
			linea += " "+num;
			loops--;
			}
		System.out.println(linea);
		}
	}


