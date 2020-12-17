package evaluacion3;

import java.util.concurrent.Semaphore;

public class SemaforosEjemplo {
	int i = 0;

	public static void main (String[] args) {

	final SemaforosEjemplo ejemplo = new SemaforosEjemplo();

	final Semaphore semaforo = new Semaphore (1);

	final Runnable r = new Runnable () {

		public void run () {
	
			while (true) {
		
				try {
			
					semaforo.acquire();
			
					//Sección crítica a proteger
			
					ejemplo.printSomething ();
			
					Thread.sleep (1000);
			
					semaforo.release();
			
					} 
				catch (Exception ex) {
			
						System.out.println (" — Interrupted…");
			
						ex.printStackTrace ();
			
				}
		
			}
	
		}

	};

	new Thread (r).start ();

	new Thread (r).start ();

	new Thread (r).start ();

	}

	public void printSomething (){

		i++;

		System.out.println (" — current value of the i :"+ i);

	}

}
