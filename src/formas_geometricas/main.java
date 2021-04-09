package formas_geometricas;

import java.util.Scanner;

public class main {

	/**
	 * Muestra un menu en el que se puede acceder a los metodos para poder hayar el
	 * perimetro y las formas geometricas disponibles en el programa.
	 * @author Wilma Jane Balba
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int op = 0;
		
		
		do {
			System.out.println();
			System.out.println("1. Quiero hayar el area");
			System.out.println("2. Quiero hayar el perimetro");
			System.out.println("3. Salir");
			System.out.println("Escoge opcion:");
			System.out.println();
			op=sn.nextInt();
			
			switch (op) {
			case 1:
				main.HallarArea();
				break;
			case 2:
				main.HallarPerimetro();
				break;
			case 3:
				System.out.println("GRACIAS POR USAR EL PROGRAMA");
				break;
				default:
					System.out.println("ERROR AL ESCOGER OPCION");
			}
			
		}while(op!=3);	
	}//Cierre del metodo main
	
	
	/**
	 * Metodo que permite hayar el area del circulo, cuadrado y triangulo.
	 * Se obtiene longitudes al preguntar al usuario.
	 */
	public static void HallarArea(){
		Scanner sn = new Scanner(System.in);
		int op = 0;
		double altura = 0, base = 0, radio = 0;
		
		System.out.println();
		System.out.println("1. circulo");
		System.out.println("2. cuadrado");
		System.out.println("3. triangulo");
		System.out.println("Escoge una forma geometrica");
		System.out.println();
		op=sn.nextInt();
		
		if(op==1) {
			System.out.println("AREA DEL CIRCULO");
			System.out.println("Escriba la radio del circulo: ");
			radio=sn.nextDouble();
			System.out.println();
			System.out.println("El area del circulo es: " + (3.14*radio));
		}
		
		if(op==2) {
			System.out.println("AREA DEL CUADRADO");
			System.out.println("Escriba el lado del cuadrado: ");
			altura=sn.nextDouble();
			System.out.println();
			System.out.println("El area del cuadrado es: " + (altura*altura));
		}
		
		if(op==3) {
			System.out.println("AREA DEL TRIANGULO");
			System.out.println("Escriba la altura del triangulo: ");
			altura=sn.nextDouble();
			System.out.println();
			System.out.println("Escriba la base del triangulo: ");
			base=sn.nextDouble();
			System.out.println();
			System.out.println("El area del triangulo es: " + ((base*altura)/2));
		}	
	}//Cierre del metodo HayarArea
	
	/**
	 * Metodo que permite hayar el perimetro del circulo, cuadrado y triangulo.
	 * Se obtiene longitudes al preguntar al usuario.
	 */
	public static void HallarPerimetro() {
		Scanner sn = new Scanner(System.in);
		int op = 0;
		double base = 0, radio = 0;
		
		System.out.println();
		System.out.println("1. circulo");
		System.out.println("2. cuadrado");
		System.out.println("3. triangulo");
		System.out.println("Escoge una forma geometrica");
		System.out.println();
		op=sn.nextInt();
		
		if(op==1) {
			System.out.println("PERIMETRO DEL CIRCULO");
			System.out.println("Escriba la radio del circulo: ");
			radio=sn.nextDouble();
			System.out.println();
			System.out.println("El perimetro del circulo es: " + (2*3.14*radio));
		}
		
		if(op==2) {
			System.out.println("PERIMETRO DEL CUADRADO");
			System.out.println("Escriba el lado del cuadrado: ");
			base=sn.nextDouble();
			System.out.println();
			System.out.println("El perimetro del cuadrado es: " + (4*base));
		}
		
		if(op==3) {
			System.out.println("PERIMETRO DEL TRIANGULO");
			System.out.println("Escriba la base del triangulo: ");
			base=sn.nextDouble();
			System.out.println();
			System.out.println("El perimetro del triangulo es: " + (3*base));
		}	
	}//Cierre del metodo HayarPerimetro

}
