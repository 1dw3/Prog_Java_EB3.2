package ebaluaketa3;

import java.util.Scanner;

public class LeerRealRobusto {

	public static void main(String[] args) {
		// lee un número real de forma robusta por teclado 
		double n=0.0;
		String valor="";
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		try {
			// leo n
			System.out.print("Introduzca un valor de tipo real: ");
			valor = teclado.nextLine();
			n = Double.parseDouble(valor);
		}
		catch (NumberFormatException e){
			System.out.println("Número Incorrecto: " + valor);
			
			// convierto el valor incorrecto a un valor correcto
			char caracter;
			String valorCorrecto="";
			boolean haycoma = false;
			for(int posicion=0;posicion<valor.length();posicion++){
				caracter = valor.charAt(posicion); 
				if(Character.isDigit(caracter)){
					// si es un digito valido
					// lo añado al String valorCorrecto
					valorCorrecto = valorCorrecto+caracter;
				}
				else if(caracter ==',' || caracter == '.'){
					// si es el caracter ',' o '.'
					if(!haycoma){
						// si es la primera vez
						// añado el caracter '.' al String valorCorrecto
						valorCorrecto = valorCorrecto + '.';
						// actualizo el valor de haycoma
						haycoma = true;
					}
				}
				else if((caracter=='l')){
					// si es el caracter 'l'
					// añado el caracter '1' al String valorCorrecto
					valorCorrecto = valorCorrecto + '1';
				}
				else if((Character.toLowerCase(caracter)=='o')){
					// si es el caracter 'o' u 'O'
					// añado el caracter '0' al String valorCorrecto
					valorCorrecto = valorCorrecto +'0';
				}
			}
			// una vez obtenido el valorCorrecto
			// lo convierto a double
			n = Double.parseDouble(valorCorrecto);
		}
		// en este punto tengo un valor de n correcto
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// muestro el mensaje
		System.out.println("El valor de la variable introducida es " + n);
		
	}

}
