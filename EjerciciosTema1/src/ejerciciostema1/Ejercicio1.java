package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		//Declaracion de variables
		double num;
		
		//Apertura del escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el numero en la terminal
		System.out.print("Dime un numero: ");
		num = sc.nextFloat();
		
		//Le sumamos 0.5 al numero para quedarnos con el numero de delante haciendo un casting
		num+=0.5;
		
		//Mostramos el numero con el casting
		System.out.printf("El numero, redondeado, es %d",(int)num);
		
		//Cerramos el escaner
		sc.close();
		
	}

}
