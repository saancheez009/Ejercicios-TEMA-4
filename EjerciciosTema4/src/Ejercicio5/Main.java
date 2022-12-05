package Ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	int numero;
	double a;
	int n;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Por favor introduzca un número ");
	numero=sc.nextInt();

	System.out.println("Por favor introduzca un número base (a) y su exponente (n)");
	a=sc.nextInt();
	n=sc.nextInt();
	
	System.out.println("La suma de los números consecutivos hasta el número introducido es : "+FuncionesRecursivas.sumatorio(numero));
	
	System.out.println("El resultado de a^n, es: "+FuncionesRecursivas.potencia(a,n));
	
	System.out.println("El resultado del número correspondiente de la serie de Fibonacci es: "+ FuncionesRecursivas.serieFibonacci(numero));
	}

}

