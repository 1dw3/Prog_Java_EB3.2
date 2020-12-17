package evaluacion3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class SincronizarEscribirPila extends Thread{
	
	private final SincronizarPila sincronizarPila;
	
	SincronizarEscribirPila(SincronizarPila sp) { 
		this.sincronizarPila = sp; 
	}
	
	public void run() {
		// escribe una linea en la pila
		final Reader r1 = new InputStreamReader(System.in);
		final BufferedReader teclado = new BufferedReader(r1);
		String linea;
		try {
		while ((linea = teclado.readLine()) != null) { 
			// lee un String del teclado
			this.sincronizarPila.addDato(linea);
		}
		} catch (final IOException x) { x.printStackTrace(System.err); }
	}
}
