package Ejercicio3;

public class NumerosAleatorios {

	static void numerosAleatorios (int cantidadNumeros, int maximoNumero, int minimo) {
		for (int i=1;i<=cantidadNumeros;i++) {
			int num = (int) (Math.random()*((maximoNumero)-minimo)+minimo);
			System.out.println(num);
			
		}
		
		
	}
	
	
	
	static void numerosAleatorios (int cantidadNumeros, int maximoNumero) {
		for (int i=1;i<=cantidadNumeros;i++) {
			int num = (int) (Math.random()*maximoNumero);
			System.out.println(num);
		}
			
			
		}
		
	
	
	
	static void numerosAleatorios (int cantidadNumeros) {
	for (int i=1;i<=cantidadNumeros;i++) {
		double num = Math.random();
		System.out.println(num);
	}
		
		
	}
}
