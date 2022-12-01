package Ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor introduzca el radio de la esfera");
		Esfera.radio = sc.nextInt();
		
		
		System.out.println("La superficie de la esfera es: "+Esfera.superficie());
		
		System.out.println("El volumen de la esfera es: "+Esfera.volumen());
		
	}

}
