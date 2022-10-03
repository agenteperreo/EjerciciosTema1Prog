package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Declaramos las variables
		double base, altura, area; //Variables base, altura y area del triangulo
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos la base y la altura del triangulo
		System.out.print("Base del triangulo: ");
		base = sc.nextDouble();
		System.out.print("Altura del triangulo: ");
		altura = sc.nextDouble();
		
		//Calculamos el area
		area = base*altura/2;
		
		//Mostramos el area
		System.out.printf("El area del triangulo es %.2f",area);
		
		//Cerramos el escaner
		sc.close();
		
	}

}
