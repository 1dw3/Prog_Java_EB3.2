package ebaluaketa3;
import java.io.Serializable;
public class kontatzailegenerikoa<T> implements Serializable{
	private static final long	serialVersionUID	= -211203257934114735L;
	private T balioa;
	private int kontatzailea;

	// lehenetsitako eraikitzailea
	kontatzailegenerikoa(){
		kontatzailea = 0;
		}
		
	// eraikitzaile atributu batekin
	kontatzailegenerikoa(T v){
		balioa = v;
		kontatzailea = 0;
		}
	// eraikitzaile atributu birekin
	kontatzailegenerikoa(T v, int c){
		balioa = v;
		kontatzailea = c;
		}
		
		// kopia eraikitzailea
	kontatzailegenerikoa(kontatzailegenerikoa<T> cg){
		balioa = cg.balioa;
		kontatzailea = cg.kontatzailea;
		}
		
		// Setters and Getters
		public T getBalioa() {
			return balioa;
		}

		public void setBalioa(T valor) {
			this.balioa = valor;
		}

		public int getKontatzailea() {
			return kontatzailea;
		}

		public void setKontatzailea(int contador) {
			this.kontatzailea = contador;
		}
		
		// conversion a String
		@Override
		public String toString() {
			return ("Balioa: " + balioa + " Kontatzailea: " + kontatzailea);
		}

	
	

}
