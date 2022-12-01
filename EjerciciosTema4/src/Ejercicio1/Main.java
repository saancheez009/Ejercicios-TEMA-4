package Ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numero;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Por favor introduzca un número ");
        numero=sc.nextInt();
        
        Numeros lectura = new Numeros();
        System.out.println(lectura.esPrimo(numero) ? "El número es primo: true" : "El número no es primo: false");
        
        System.out.println(lectura.esCapicua(numero) ? "El número es capicúa: true" : "El número no es capicúa: false");
	}

}
