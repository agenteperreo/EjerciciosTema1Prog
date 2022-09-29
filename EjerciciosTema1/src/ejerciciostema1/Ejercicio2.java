package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		//Declaramos las variables que vamos a usar
		int num, resto, sumatorio; //El numero que vamos a introducir, resultado del modulo y cuanto hay que sumarle para que sea multiplo de 7
		final int multiplo = 7; //El numero del que queramos que el otro sea multiplo
		
		//Abrimos escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el numero
		System.out.print("Dime un numero: ");
		num = sc.nextInt();
		
		//Prodedimientos
		resto = num%multiplo; //Calculamos el resto del numero entre 7
		sumatorio = multiplo - resto; //Le quitamos a 7 el resto para saber cuanto sumarle
		sumatorio = resto ==0 ? 0 : sumatorio; //Si el reto es 0 el sumatorio tambien es 0
		
		//Mostramos cuanto hay que aumentarle al numero para que sea multiplo de 7
		System.out.printf("Hay que sumarle %d",sumatorio);
		
		//Cerramos el escaner
		sc.close();
		
	}

}

//calculamos el modulo y en funcion de lo que de el modulo lo restamos entre 7 para saber caunto hay que sumarle para que 