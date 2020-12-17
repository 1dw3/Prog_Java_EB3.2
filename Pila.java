package evaluacion3;

import java.util.ArrayList;

public class Pila extends ArrayList<String>{

	private static final long	serialVersionUID	= 7107489729025920305L;
	
	@Override
	public boolean add(String s){
		// por defecto add añade al final
		// añado siempre al principio porque es una pila
		// la es la 0
		super.add(0,s);
		return true;
	}
	
	@Override
	public void add(int pos, String s){
		// añado siempre al principio porque es una pila
		// la es la 0
		super.add(0,s);
	}
	
	public void push(String s){
		// añado el elemento a la pila
		// usando el metodo add de Pila recien creado
		this.add(s);
	}
	
  // creo el metodo pop para tratar los elementos de la cola
	public String pop(){
		// cojo el primer elemento de la cola
		String s = this.get(0);
		// lo borro
		this.remove(0);
		// devuelvo su valor para que se trate
		return (s);
	}
	@Override
	public  String remove (int a) {
		this.remove(this.size()-1);
		
	}
}
