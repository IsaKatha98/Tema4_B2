package tema4;

public class Ejercicio4 {
	
	public static boolean parseToBoolean (int n1){
		
		boolean resultado=false;
		
		if (n1==0) {
			resultado=false;
		} else if (n1==1) {
			resultado=true;
		}
		
		return resultado;
	}
	
	public static boolean parseToBoolean (String cadena) {
	
		boolean resultado=false;
		
		if ("false".equals(cadena)) {
			
			resultado=false;
			
		} else if ("true".equals(cadena)) {
			
			resultado=true;
		
		} 
		
		return resultado;
		
	}
	
	public static void main(String[] args) {

		//Declaramos las variables.
		
		int num1=1;//Variable que solicitamos al usuario.
		String cadena="false";
		boolean f1;
		boolean f2;
		
		//Ahora, invocamos la función mayor e insertamos las variables num. El resultado de la función se guardará en la variable resultado.
		f1= parseToBoolean (num1);
		
		f2 = parseToBoolean (cadena);
		
		//Imprimimos el resultado.
		System.out.println(f1);
		System.out.println(f2);
	}


}
