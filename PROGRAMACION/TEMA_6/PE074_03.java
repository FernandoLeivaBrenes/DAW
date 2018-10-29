public class PE074_03{
	public static void main(String[] args){
		System.out.println("Sacar cartas de una baraja (Francesa): ");
		int palo = (int)(Math.random()*4);
		int carta = (int)((Math.random()*10)+1);
		String cartapalo = "" , cartanumero;
		
		switch(palo){
			case 0 :
			cartapalo = " Bastos";
			break;
			case 1 :
			cartapalo = " Monedas";
			break;
			case 2 :
			cartapalo = " Copas";
			break;
			case 3 :
			cartapalo = " Espada";
			break;
			default:;
			}
		switch(carta){
			case 1:
			cartanumero = " As";
			break;
			case 8:
			cartanumero = " Sota";
			break;
			case 9:
			cartanumero = " Caballo";
			break;
			case 10:
			cartanumero = " Rey";
			break;
			default:
			cartanumero = ""+carta;
			}
		
		System.out.println("Palo de la carta : "+cartapalo);
		System.out.println("Numero de la carta : "+cartanumero);
		System.out.printf("Carta : "+cartanumero+" de"+cartapalo+" ");
		}
	}

