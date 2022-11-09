package dowhiletema3;

import java.util.Scanner;

public class Ej5DW {
/*Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el ordenador intenta adivinarlo.
 *  Es decir, el ordenador irá proponiendo números una y otra vez hasta adivinarlo 
 *  (el usuario deberá indicarle al ordenador si es mayor, menor o igual al número que ha pensado).
*/
	public static void main(String[] args) {
		//declaramos variables
		int numero;
		String respuesta;
		int menor=0;
		int mayor=101;
		
		//iniciamos el scanner
		Scanner lee = new Scanner(System.in);
		
		
		do {
			numero = (int) (Math.random()*(mayor-menor)+menor);
			System.out.println("Es el numero " + numero + "?");
		respuesta = lee.nextLine();
		
		if (respuesta.equals("MAYOR")) {
			mayor = numero;
		}
		
		else if (respuesta.equals("MENOR")) {
			menor = numero;
		}
		}
		
		
	while(!respuesta.equals("IGUAL"));
	
		System.out.println("Has acertado");
	
		lee.close();
		
	}
	
	}
