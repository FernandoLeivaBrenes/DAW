public class PE074_02{
	public static void main(String[] args){
		System.out.println("Sacar cartas de una baraja (Francesa): ");
		int palo = (int)(Math.random()*4);
		int carta = (int)((Math.random()*13)+1);
		String cartapalo = "" , cartanumero , UNIcartapalo="" , UNIcartanumero;
		
		switch(palo){
			case 0 :
			cartapalo = " \u2660";
			UNIcartapalo = "A";
			break;
			case 1 :
			cartapalo = " \u2665";
			UNIcartapalo = "B";
			break;
			case 2 :
			cartapalo = " \u2666";
			UNIcartapalo = "C";
			break;
			case 3 :
			cartapalo = " \u2663";
			UNIcartapalo = "D";
			break;
			default:;
			}
		switch(carta){
			case 1:
			cartanumero = " A";
			UNIcartanumero = "1";
			break;
			case 10:
			cartanumero = " 10";
			UNIcartanumero = "A";
			case 11:
			cartanumero = " J";
			UNIcartanumero = "B";
			break;
			case 12:
			cartanumero = " Q";
			UNIcartanumero = "D";
			break;
			case 13:
			cartanumero = " Q";
			UNIcartanumero = "E";
			break;
			default:
			cartanumero = ""+carta;
			UNIcartanumero = ""+carta;
			}
		String karta = "\\uD83C\\uDC"+UNIcartapalo+UNIcartanumero;
		System.out.println("Palo de la carta : "+cartapalo);
		System.out.println("Numero de la carta : "+cartanumero);
		System.out.printf("Carta : "+ (String)karta);
		}
	}
