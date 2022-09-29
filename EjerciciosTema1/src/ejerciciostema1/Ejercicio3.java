package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Declaramos las variables que vamos a usar
		int num1; // Variable en la que guardaremos el numero que dividiremos el numero que tendremos que sumarle 
		int resto; //Variable en la que guardaremos el resto de la division
		int sumatorio; //Variable en la que guardaremos el numero que tendremos que sumarle al primero pa ser multiplo
		int num2; // Variable en la que gurdaremos el numero por el que vamos a dividir
		
		// Abrimos escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos el numero
		System.out.print("Dime un numero: ");
		num1 = sc.nextInt();
		
		//Pedimos el segundo numero
		System.out.print("Dime el numero por el que quieres dividr el primero: ");
		num2 = sc.nextInt();

		// Prodedimientos
		resto = num1 % num2; // Calculamos el resto del numero entre el segundo numero
		sumatorio = num2 - resto; // Le quitamos al segundo nunmero el resto para saber cuanto sumarle
		sumatorio = resto == 0 ? 0 : sumatorio; // Si el reto es 0 el sumatorio tambien es 0

		// Mostramos cuanto hay que aumentarle al numero para que sea multiplo de 7
		System.out.printf("Hay que sumarle %d", sumatorio);

		// Cerramos el escaner
		sc.close();

	}

}
