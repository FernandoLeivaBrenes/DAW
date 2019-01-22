/**
 *
 * Genera el precio (bien desglosado) de un pedido a un almacén en función de las siguientes condiciones:
 *  - Se pregunta el precio del artículo, el número de unidades y el código de descuento.
 *  - El precio inicial del pedido se calcula multiplicando el precio unitario por la cantidad.
 *  - El código 685 hace que se resten 15 euros.
 *  - El código 778 aplica un 5% de descuento a las 20 primeras unidades.
 *  - El código 219 hace que las primeras 5 unidades salgan gratis (válido solo si se piden más de 5 unidades).
 *  - Al final se suma el 21% de IVA.
 *  
 * @author Fernando Leiva Brenes
 */
public class Ejercicio_3{
	
	public static void mostrarDesglose ( double precio, int numUnits, int codDesc ){
		
		double total = precio * (double)numUnits;
		double descuento = 0;
		String descString;
		
		switch(codDesc){
			case 685:
				descString = "Código 685:	";
				if( total > 15 ){ descuento = 15;}
			break;
			case 778:
				descString = "Código 778:	";
				if(numUnits > 20){
					descuento = (20 * precio) * 0.05;
					}else{
						descuento = (numUnits*precio) * 0.05;
						}
			break;
			case 219:
				descString = "Código 219:	";
				if(numUnits > 5 ){
					descuento = 5*precio;
					}
			break;
			default:
				descString = " Código no válido";
				descuento = 0;
		}
		
		System.out.println("----------------------------------------------------");
		System.out.printf( "Precio del artículo:			%10.2f € \n", precio );
		System.out.printf( "Número de unidades:			%7d \n", numUnits );
		System.out.printf( "Precio total unidades:			%10.2f € \n", total );
		System.out.printf( "Descuento aplicado:%s	%10.2f € \n", descString, descuento );
		System.out.printf( "Precio con descuento:			%10.2f € \n", total - descuento );
		System.out.printf( "IVA (21%%):				%10.2f € \n", (total - descuento)*0.21 );
		System.out.println("----------------------------------------------------");
		System.out.printf( "PRECIO FINAL:				%10.2f € \n", ((total - descuento)*0.21)+(total- descuento));
		
		}
	
	public static void generaPrecio(){
		
		int numUnits;
		int codDesc;
		double precio;
		
		System.out.print("Introduzca el precio del artículo (en Euros) : ");
		precio = Double.parseDouble(System.console().readLine());
		
		System.out.print("Indique el número de unidades : ");
		numUnits = Integer.parseInt(System.console().readLine());
		
		System.out.print("Indique el código de descuento : ");
		codDesc = Integer.parseInt(System.console().readLine());
		
		System.out.println("A continuación, se le muestra el precio desglosado del pedido:");
		mostrarDesglose(precio, numUnits, codDesc);
		}
	
	public static void main(String[] args){
		generaPrecio();
		}
	}
