package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		//Declaramos las variables
		double mm, cm, m, total;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos las medidas
		//pedimos la primera medida en mm
		System.out.print("Dime una medida, debe ser en milimetros: ");
		mm = sc.nextDouble();
		//pedimos la segunda medida en cm
		System.out.print("Dime otra medida, debe de ser en centimetros: ");
		cm = sc.nextDouble();
		//y pedimos la tercera medida en metros
		System.out.print("Dime una ultima medida, debe de ser en metros: ");
		m = sc.nextDouble();
		
		//Calculamos la suma de las 3 medidas en cm
		total = (mm/10)+cm+(m*100);
		
		//Mostramos el total de la suma
		System.out.printf("El total de la suma de las 3 medidas es %.2f cm",total);
		
		//Cerramos el escaner
		sc.close();
	}

}
