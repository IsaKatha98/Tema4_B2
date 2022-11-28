package tema4;

public class Ejercicio2 {
	
public static double media (int n1, int n2) {
		
	double suma;
		suma=(n1+n2);
		return suma/2;
		
	}
	
	public static double media (int n1, int n2, int n3) {
		
		double suma;
		
		suma=n1+n2+n3;
		
		return suma/3;
	}

	public static void main(String[] args) {

		//Declaramos las variables.
		
		int num1=4;//Variable que solicitamos al usuario.
		int num2=5;//Variable que solicitamos al usuario.
		int a=2;
		int b=1;
		int c=8;
		double f1;
		double f2;
		
		//Ahora, invocamos la función mayor e insertamos las variables num. El resultado de la función se guardará en la variable resultado.
		f1= media (num1,num2);
		
		f2 = media(a,b,c);
		
		//Imprimimos el resultado.
		System.out.println("El resultado de la media de 2 int es= " +f1);
		System.out.println("El resultado de la media de 3 int es= "+f2);
	}

}
