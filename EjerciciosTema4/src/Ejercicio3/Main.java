package Ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		int cantidadNumeros;
		int maximoNumero;
		int minimo;
		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Por favor introduzca la cantidad de números aleatorios a generar ");
	    cantidadNumeros=sc.nextInt();
		
	    System.out.println("Por favor introduzca el valor máximo que tomarán los números aleatorios ");
	    maximoNumero=sc.nextInt();
	    
	    System.out.println("Por favor introduzca el valor mínimo que tomarán los números aleatorios ");
	    minimo=sc.nextInt();
	    
	    System.out.println("Los números aleatorios generados entre 0 y 1 son: ");
	    NumerosAleatorios.numerosAleatorios(cantidadNumeros);
		
	    System.out.println("Los números aleatorios generados entre 0 y "+maximoNumero+" son:");
	    NumerosAleatorios.numerosAleatorios(cantidadNumeros, maximoNumero);
	    
	    System.out.println("Los números aleatorios generados desde el número "+minimo+" hasta el número "+maximoNumero+" son: ");
	    NumerosAleatorios.numerosAleatorios(cantidadNumeros, maximoNumero, minimo);

	}

}
