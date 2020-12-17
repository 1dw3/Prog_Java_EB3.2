package evaluacion3;

import java.util.concurrent.Semaphore;

public class SemaforosContadorMain {
	// creo el contador
	static int contador = 10;
	//creo el semaforo
 	static Semaphore semaforo = new Semaphore (1);
  
 	// pruebo el comportamiento de los semaforos
  public static void main(String[] args) {
  	ContadorHilo ch1 = new ContadorHilo("Hilo1",semaforo);
		ContadorHilo ch2 = new ContadorHilo("Hilo2",semaforo);
		ContadorHilo ch3 = new ContadorHilo("Hilo3",semaforo);
		ch1.start();
		ch2.start();
		ch3.start();
  }
  
  // ContadorHilo
  public static class ContadorHilo extends Thread{
 	 private Semaphore semaforo;
 	 private String nombre;
 	 
 	 // SemaforosContadorMain
 	 ContadorHilo(String nombre,Semaphore s){
 		 this.nombre = nombre;
 		 this.semaforo = s;
 	 }
 	 
 	 // run
 	 public void run () {
 			
 			while (contador > 0) {
 		
 				try {
 					// espero a que se tenga el semaforo
 					semaforo.acquire();
 			
 					//Sección crítica a proteger
 					
 					// muestro el nombre del hilo en ejecución
 					System.out.println (this.nombre + " en ejecución...");
 					if (contador == 0){
 						// si el contador llega a 0
 						// libero el semaforo
 						semaforo.release();
 						// finalizo la ejecucion
 						this.finalize();
 						// salgo del bucle
 						break;
 					}
 					else {
 						// si el contador no es nulo
 						// lo decremento
 						contador--;
 						// muestro un mensaje
 						System.out.println ("Contador: "+ contador);
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
}
}
 