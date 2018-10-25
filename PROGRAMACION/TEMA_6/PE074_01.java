public class PE074_01{
	public static void main(String[] args){
		System.out.println("Tirada de tres dados: ");
		int sum = 0;
		for(int i=0; i < 3; i++ ){
			int tirada = (int)((Math.random()*6	)+1);
			sum += tirada;
			System.out.println("Tirada "+(i+1)+" : "+tirada);
			}
			
		System.out.println("Puntuación entre los tres dados : "+sum);
		}
	}
