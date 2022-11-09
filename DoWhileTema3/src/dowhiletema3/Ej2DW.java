package dowhiletema3;

public class Ej2DW {
/*Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.
*/
	public static void main(String[] args) {
		//declaramos las variables
		
		int numero = 2;//iniciamos numero a dos para que se se vayan sumando 2 y siempre sea par
		
		do {
			
			System.out.println(numero);//imprimimos el 2
			
			numero+=2;//añadimos a la variable numero 2 mientras que sea menor o igual a 200 
		} while (numero<=200);

	}

}
