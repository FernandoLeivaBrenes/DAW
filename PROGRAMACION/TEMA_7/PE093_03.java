public class PE093_03{
	public static void main(String[] args){
		int[] num = new int[10];
		
		for(int i = 0 ; i < num.length; i++){
				System.out.print("Introduce "+(num.length - i)+" numero : ");
				int numintro = Integer.parseInt(System.console().readLine());
				num[i]= numintro;
			}
		for(int i = 0 ; i < num.length; i++){
				System.out.print(" "+(num[num.length - i - 1]));
			}
		
		}
	}

