package dowhiletema3;

import java.util.Scanner;

public class Ej3DW {
/*Realiza un programa que sume los números desde el 1 hasta un número N que se introducirá por teclado.
 *  Si el usuario introduce un 5, el programa debe devolver la suma de 1+2+3+4+5.*/
	public static void main(String[] args) {
		//declaramos las variables
		int acumulador = 0, numUser, suma=0;
		
		//Iniciamos el Scanner
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca un numero: ");
		
		numUser = lee.nextInt();

		do {
			acumulador++;//a acumulador se le va sumando uno 
		suma+=acumulador;//se guarda la suma de acumulador mas suma en la variable suma
		}
		while (acumulador<numUser);//Mientras el acumulador sea menor que el numero introducido se imprimirá la suma de todos los numeros
		System.out.println("La suma de todos los numeros hasta el numero introducido es: "+ suma);
	
		lee.close();
	}
}
