package evaluacion3;

public class SincronizarPila {

	private Pila pila = new Pila();
	
	public synchronized boolean addDato(String s){
		// añado el elemento a la lista
		pila.push(s);
		notify();
		return true;
	}
	
	public synchronized String getDato (){
		if (pila.size()==0){
      try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// cojo el primer elemento de la cola
		String s = pila.pop();

		// devuelvo su valor para que se trate
		return (s);
	}
}
