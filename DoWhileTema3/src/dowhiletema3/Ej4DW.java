package dowhiletema3;

import java.util.Scanner;

public class Ej4DW {
/*Realiza un programa que muestre la tabla de multiplicar de un número introducido por teclado. 
 * Por ejemplo, si se introduce el número 3 se debe imprimir lo siguiente:
3 x 1 = 3
3 x 2 = 6
3 x 3 = 9
3 x 4 = 12
3 x 5 = 15
3 x 6 = 18
3 x 7 = 21
3 x 8 = 24
3 x 9 = 27
3 x 10 = 30
*/
	public static void main(String[] args) {
		//declaramos las variables
		int numUser;
		int multiplicador = 1;
		
		//Iniciamos el Scanner
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca un numero entero del cual quiera saber la tabla de multiplicar: ");
		
		numUser = lee.nextInt();
		
		System.out.println("La tabla de multiplicar de " + numUser  + " es: ");
		
		do {/*establecemos un do donde imprimimos la estructura de la tabla de multiplicar 
		e incrementamos a multiplicador 1 para que no entre en bucle infinito*/
			
			System.out.println(numUser + "x" + multiplicador + "=" + (numUser*multiplicador));
			multiplicador++;
		}
		while(multiplicador<=10);//establecemos la condiciendo para que se detenga en 10
	
		//cerramos el scanner
		lee.close();
	}

}
