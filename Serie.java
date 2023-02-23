 package reto1;

import java.util.Scanner;

public class Serie {
	//Funcion para el factorial
	 
	  static long factCalculator(int n){
	        long fact = 1;
	        int i = 1;
	        while(i <= n){
	            fact = fact*i;
	            i++;
	        }
	        return fact;
	    }
		static double coseno(double rad, double cantDecimales) {
			double cos=0;
			//Iterador
			for(int i=0;i<=rad;i++) {
			/*
			 *La primer parte es para que cuando i sea par entonces el signo 
			 *va a ser SUMA y cuando i sea impar es una resta es para ir cambiando
			 *entre resta y suma en cada punto de la serie
			*/
				cos =+ ((Math.pow(-1,i)) * (Math.pow(rad, 2*i))) / factCalculator(2*i);
			}
			return cos;
		}
	public static void main(String[] args) {
		//Variables
		double rad, cantDecimales;
		Scanner sc = new Scanner(System.in);
		double cosenoMaclaurin;
		
		//Pedirle el radian y cuantas unidades decimales quiere
		System.out.println("Entra un valor en RADIANES para evaluar el coseno de ese valor");
		rad = sc.nextDouble();
		System.out.println("Entre cuanto valor de error quiere tener es decir 0.2, 0.01 etc");
		cantDecimales = sc.nextDouble();
		
		//Calcular el valor de coseno con la formula matematica
		double cosenoReal;
		cosenoReal = Math.cos(rad);
		//Hallar el error 
		
		//Contador de iterador
		int cont = 0;
		double error=100;
		cosenoMaclaurin =  coseno(rad,cantDecimales);
		//Con un while miramos que el valor del coseno que nos da con la serie de Mac,
		//no sea mas grande q el error
	
		while (error > cantDecimales) {
			cont=+1;
			cosenoMaclaurin = coseno(rad,cantDecimales);
			error = (cosenoMaclaurin - cosenoReal / cosenoReal)*100;
		}
		//toString mostrar resultados
		System.out.println("Valor de coseno a traves de Maclaurin "+cosenoMaclaurin+" el error fue de "+error+" con un numero de iteraciones de "+cont);

	}

}
