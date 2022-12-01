package Ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num1;
		int num2;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor introduzca dos números");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		Operaciones lectura = new Operaciones();
		
		System.out.println("La suma de los números es: "+lectura.suma(num1,num2));
		
		System.out.println("La resta de los números es: "+lectura.resta(num1,num2));
		
		System.out.println("La multiplicacion de los números es: "+lectura.multiplicacion(num1, num2));
		
		System.out.println("La division de los números es: "+lectura.division(num1,num2));
		
		
	}

}
