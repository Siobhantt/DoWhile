package dowhiletema3;

public class Ej1DW {
/*Realiza un programa que muestre por pantalla los 20 primeros números naturales (1, 2, 3... 20).*/
	public static void main(String[] args) {
		
		//declaramos las variables
		
		int numero=1;//iniciamos la variable numero a 1
		
		//iniciamos un do while donde se imprimirá el numero y se sumará 1 hasta que el numero sea 20 entonces se detendrá
		do {
			System.out.println(numero);
		
			numero++;//le sumamos al numero 1  
		} while (numero<=20);//mientras sea menor o igual a 20
		
		
	}

}
