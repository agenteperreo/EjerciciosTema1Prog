package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//Declaramos la variables que necesitaremos para resolver el polinomio
		int a, b, c, x, y;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el valor de a, b, c y x
		System.out.println("Dime valores para a, b, c y x, en orden, del siguiente polinomio: y=axx+bx+c");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		x = sc.nextInt();
		
		//Calculamos y utilizando el polinomio
		y = a*x*x+b*x+c;
		
		//Mostramos el valor de y
		System.out.printf("Y = %d",y);
		
		//Cerramos el escaner
		sc.close();
	}

}
