package tema4;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static int sumaEnteros (int n1) {
	
		int suma=0;
		
		for (int i=1; i<=n1; i++) {	
			
			suma+=i;
		}
		return suma;
		
	}
	
	public static int sumaEnteros (int n1, int n2) {
		
		int suma=0;
		
		for (int i=n1; i<=n2;i++) {
			
			suma+=1;
			
		}
		
		return suma;
	}

	public static void main(String[] args) {

		//Declaramos las variables.
		
		int num1;//Variable que solicitamos al usuario.
		int num2;//Variable que solicitamos al usuario.
		int f1;
		int f2;
		
		//Creamos un escáner para poder leer los datos que introduzca el usuario por la consola. 
		
		Scanner sc= new Scanner (System.in);
		
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
		
	
		System.out.print("Introduzca el un número (num1) y pulse Intro: ");
		num1=sc.nextInt();
		System.out.print("Introduzca otro número (num2) y pulse Intro: ");
		num2=sc.nextInt();
		
		//Ahora, invocamos la función mayor e insertamos las variables num. El resultado de la función se guardará en la variable resultado.
		f1= sumaEnteros (num1);
		
		f2= sumaEnteros (num1,num2);
		
		//Imprimimos el resultado.
		System.out.println("El resultado de la suma desde 1 hasta num1 es= " +f1);
		System.out.println("El resultado de la suma de num1 hasta num2 es= "+f2);
						
		
	}



}
