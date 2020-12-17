package evaluacion3;

import java.util.concurrent.Semaphore;

public class SemaforosCaramelos {
	static int caramelos = 10;

	public static void main (String[] args) {

	final Semaphore semaforo = new Semaphore (1);

	final Runnable hijo = new Runnable () {

		public void run () {
	
			while (caramelos > 0) {
		
				try {
					// espero a que se tenga el semaforo
					semaforo.acquire();
			
					//Sección crítica a proteger
					
					if (caramelos == 0){
						// si no quedan mas caramelos
						// libero el semaforo
						semaforo.release();
						// finalizo la ejecucion
						this.finalize();
						// salgo del bucle
						break;
					}
					else {
						// si quedan caramelos
						// cojo un caramelo
						caramelos --;
						// muestro un mensaje
						System.out.println (" Quedan "+ caramelos + " caramelos.");
						// espero un segundo
						Thread.sleep (1000);
						// libero el semaforo
						semaforo.release();
					}
						
					
			
			}catch (Throwable ex) {
			
						System.out.println (" Esperando ...");
			
						ex.printStackTrace ();
			
				}
		
			}
	
		}

	};

	// creo los hijos y los ejecuto
	new Thread (hijo).start ();
	new Thread (hijo).start ();
	new Thread (hijo).start ();

	}

}
