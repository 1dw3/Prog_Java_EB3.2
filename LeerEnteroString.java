package evaluacion3;

import java.util.Scanner;

public class LeerEnteroString {

	public static void main(String[] args) {
		// lee un número entero por teclado y 
		// muestra por pantalla el mensaje "El valor de la variable introducida es "
		int opcion;
		String cadena;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo opcion
		System.out.print("Opción: ");
		opcion = teclado.nextInt();
		
		// limpio el buffer de entrada
		teclado.nextLine();
		// leo cadena
		System.out.print("Cadena: ");
		cadena = teclado.nextLine();
		
		teclado.close();
		
		// muestro el mensaje
		System.out.println("Opción: " + opcion + " Cadena: " + cadena);
		
	}

}
