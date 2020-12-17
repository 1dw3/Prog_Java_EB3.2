package evaluacion3;

public class SincronizarLeerPila extends Thread {

	private final SincronizarPila sincronizarPila;
	
	public SincronizarLeerPila(SincronizarPila sp) {
		this.sincronizarPila = sp;
	}
	public void run() {
		String linea;
		while (true) {
			linea = this.sincronizarPila.getDato();
			// esribo la line leida
			System.out.println(">> " + linea);
		}
	}
}
