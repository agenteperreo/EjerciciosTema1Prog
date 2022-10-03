package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		//Declaramos las variables
		int num1, num2; //Numeros que vamos a pedirle al usuario
		boolean iguales; //Variable que mostrara true si los 2 numeros son iguales y false si son distintos
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos los 2 numeros al usuario
		System.out.print("Dime un primer numero: ");
		num1 = sc.nextInt();
		System.out.print("Dime un segundo numero(deben de ser iguales): ");
		num2 = sc.nextInt();
		
		//Ternario para comprobar si son iguales
		iguales = num1==num2 ? true : false;
		
		//Ternario para si es true mostrar un texto y si es false mostrar otro
		System.out.println(iguales ? "Los numeros son iguales" : "Te dije que debian ser iguales");
		
		//Cerramos el escaner
		sc.close();

	}

}
