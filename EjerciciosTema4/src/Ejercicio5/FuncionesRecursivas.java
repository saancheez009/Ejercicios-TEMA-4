package Ejercicio5;


public class FuncionesRecursivas {
	
	static int factorial=1;

	static int serieFibonacci(int numero) {
		
		int resultado;
		
		if(numero<=1) {
			resultado=1;
			
		} else {
			resultado= serieFibonacci(numero-1) + serieFibonacci (numero-2);
		}
	
	return resultado;
	
	}
	
	static int sumatorio(int numero) {
		
		
		for (int i=1;i<=numero;i++) {
			  factorial = factorial + i;
		}
		/*factorial=numero*factorial*(numero-1);*/
		
		return factorial-1;
	}

	static double potencia (double a , int n) {
		
		double resultado = 0;
		
		if(n==0) {
			resultado=1;
		}else {
			for (int i=1;i<=n;i++) {
				  resultado = n * i;
		}
		
	}
		return resultado;

	
	
	}
	
}