package tema4;

public class Ejercicio5 {
	
	public static int numerosAleatorios (int n1) {

		n1=(int)Math.random();
		
		return n1;
	}
	
	public static int numerosAleatorios (int n1, int n2) {
		
		n1 = (int)Math.random();
		n2= (int)Math.random()*n1;
	}
	
	public static void main(String[] args) {

		//Declaramos las variables.
		
		int num1;
		int num2;
		int num3;
		int f1;
		int f2;
		int f3;
		
		//Ahora, invocamos la función mayor e insertamos las variables num. El resultado de la función se guardará en la variable resultado.
		f1= numerosAleatorios (num1);
		
		f2 = numerosAleatorios(num1, num2);
		
		f3= numerosAleatorios (num1, num2, num3)
		
		//Imprimimos el resultado.
		System.out.println(f1);
		System.out.println(f2);
	}

}
