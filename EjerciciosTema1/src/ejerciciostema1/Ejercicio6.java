package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Declaramos las variables
		int cantidad, h, min, seg, moduloH; // La variable en la que guardaremos la cantidad de segundo que pone el
											// usuario, horas, minutos, segundos y variable donde guardamos el modulo de
											// la cantidad de segundos entre 3600

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos la cantidad de segundos
		System.out.print("Dime una cantidad de segundos: ");
		cantidad = sc.nextInt();

		// Calculamos las horas, los minutos y los segundos
		h = cantidad / 3600;
		moduloH = cantidad % 3600;
		min = moduloH / 60;
		seg = moduloH % 60;

		// Mostramos todo
		System.out.println(h + " horas " + min + " minutos y " + seg + " segundos");

		// Cerramos el escaner
		sc.close();
	}

}
