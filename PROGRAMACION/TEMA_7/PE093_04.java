public class PE093_04{
	public static void main(String[] args){
		int[] numero= new int[20] , cuadrado= new int[20] , cubo= new int[20];
		
		for(int i = 0 ; i < numero.length; i++){
				numero[i]= (int)(Math.random()*101);
				cuadrado[i]= numero[i]*numero[i];
				cubo[i]= cuadrado[i]*numero[i];
				System.out.println((numero.length-i)+"º valor : "+numero[i]+" -- "+cuadrado[i]+" -- "+cubo[i]);
			}
		}
	}


