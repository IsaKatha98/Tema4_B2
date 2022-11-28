package tema4;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static int suma (int n1, int n2) {
		
		return n1+n2;
	}
	
	public static double suma (double n1, double n2) {
		
		return n1+n2;
	}

	public static void main(String[] args) {

		//Declaramos las variables.
		
		int num1=1;//Variable que solicitamos al usuario.
		int num2=2;//Variable que solicitamos al usuario.
		double a=2.7;
		double b=1.3;
		int f1;
		double f2;
		
		//Ahora, invocamos la función mayor e insertamos las variables num. El resultado de la función se guardará en la variable resultado.
		f1=suma (num1,num2);
		
		f2 =suma(a,b);
		
		//Imprimimos el resultado.
		System.out.println("El resultado de la suma de int es= " +f1);
		System.out.println("El resultado de la suma de double es= "+f2);
						
		
	}

}
