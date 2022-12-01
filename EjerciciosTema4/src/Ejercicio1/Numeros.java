package Ejercicio1;

public class Numeros {

	 boolean esPrimo(int numero) {
		 boolean result=true;
			if(numero>0) {
				for(int i=2; i<=numero/2; i++) { //En el for le damos la instrucción de que solo se sume i hasta el número introducido por el usuario
					//Sie el resto de la división de n entre i es igual a 0, el número no es primo, por tanto result es igual a false
					if ( numero%i==0) {
						result=false;
					}
				}
				

	}
			return result;
	 }
	
	 
	 boolean esCapicua(int numero) {
		 int invert;
		 int resto;
		 int descomposicion = 0;
		 boolean result=false;
		 invert = numero;
	        while (invert!=0){
	            resto = invert % 10; //Calculamos el resto de la división ddel número invertido entre 10 para descomponer los números
	            descomposicion = descomposicion * 10 + resto; //Con esto se comprueba si el número al revés es igual al número introducido por el usuario
	            invert = invert / 10; //Quitamos la última cifra al número invertido 
	        }
	    
	        //Si el número introducido, es igual a la descomposición/inversión del número el sistema nos devolverá que el número será capicúa
	        if(numero == descomposicion ){
	        	result=true;
	           
	        }else{ //En caso de no cumplir las condiciones el sistema nos devolverá que el número no será capicúa
	      
	        }
	        return result;
	 }
}


  
