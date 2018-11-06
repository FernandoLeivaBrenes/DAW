public class PE093_02{
	public static void main(String[] args){
		String[] num = new String[9];

		num[0]= "'a'";
		num[1]= "'x'";
		num[4]= "'@'";
		num[6]= "' '";
		num[7]= "'+'";
		num[8]= "'Q'";
		
		for(int i = 0 ; i < num.length; i++){
			System.out.println(num[i]);
			}
			
		//~ Misma columna pero con valores char, dependiendo de la version 
		//~ de java o incluso del sistema operativo, puede variar entre 'null' o ''
		System.out.println("-------------");
		char[] num1 = new char[9];

		num1[0]= 'a';
		num1[1]= 'x';
		num1[4]= '@';
		num1[6]= ' ';
		num1[7]= '+';
		num1[8]= 'Q';
		
		for(int i = 0 ; i < num1.length; i++){
			System.out.println(num[i]);
			}
		
		}
	}

