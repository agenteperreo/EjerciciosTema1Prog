package ejerciciostema1;

import java.util.Scanner;

public class Ejercico10 {

	public static void main(String[] args) {
		
		//Declaramos la variable
		double longitud; //Distancia que nos introduce el usuario en metros
		int distancia; //Distancia resultante en cm y entera
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedidmos la medida en metros
		System.out.print("Dime a que distancia a llegado en metros: ");
		longitud = sc.nextDouble();
		
		//Hacemos los calculos para pasar los metros a centimetros
		distancia = (int)(longitud*100);
		
		//Mostramos la disancia en cm
		System.out.printf("Ha llegado hasta los %d centimetros",distancia);
		
		//Cerramos el escaner
		sc.close();

	}

}
