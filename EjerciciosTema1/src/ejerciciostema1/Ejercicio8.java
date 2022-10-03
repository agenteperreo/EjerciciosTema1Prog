package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		// Declaramos las variables
		int adultos, ninos; // Cantidad de entradas de adultos y de niños
		final double precioA = 20, precioInf = 15.5, descuento = 0.05; // Precio de las entradas de los adultos, de las
																		// entradas infantiles y descuento en caso de el
																		// total ser mayor o igual a 100
		double total; // Precio total

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos la cantidad de niños
		System.out.print("Entradas infantiles: ");
		ninos = sc.nextInt();
		// Pedimos la cantidad de adultos
		System.out.print("Entradas adultos: ");
		adultos = sc.nextInt();

		// Calculamos el total de las entradas
		total = ninos * precioInf + adultos * precioA;

		// Si el total supera los 100€ le hacemos un 5% de descuento
		total = total >= 100 ? total - total * descuento : total;

		// Mostramos cuanto nos va a costar las entradas
		System.out.printf("El total de las entradas es %.2f€", total);

		// Cerramos el escaner
		sc.close();

	}

}
