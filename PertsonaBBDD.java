package eb3;

import java.io.Serializable;
import java.util.Scanner;

public class PertsonaBBDD implements Comparable<PertsonaBBDD>, Serializable{

	private static final long serialVersionUID = 1543359510048065949L;
	private String Nan;
	private String Izena;
	private String Abizena;
	
	// Lehenetsitako eraikitzailea
	PertsonaBBDD(){
		this.Nan = "";
		this.Izena = "";
		this.Abizena="";
	}
	
	// Erabiltzaileen eraikitzaileak
	PertsonaBBDD(String nan, String izena, String abizena ){
		this.Nan = nan;
		this.Izena = izena;
		this.Abizena=abizena;
	}
	
	
	
	// constructor copia
	PertsonaBBDD(PertsonaBBDD p){
		this.Nan = p.Nan;
		this.Izena = p.Izena;
		this.Abizena=p.Abizena;
	}

	// Getters and Setters
	public String getNan() {
		return Nan;
	}

	public void setNan(String nan) {
		Nan = nan;
	}

	public String getIzena() {
		return Izena;
	}

	public void setIzena(String izena) {
		Izena = izena;
	}

	public String getAbizena() {
		return Abizena;
	}

	public void setAbizena(String abizena) {
		Abizena = abizena;
	}


	// toString
	

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Abizena == null) ? 0 : Abizena.hashCode());
		result = prime * result + ((Izena == null) ? 0 : Izena.hashCode());
		result = prime * result + ((Nan == null) ? 0 : Nan.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Pertsona [Nan=" + Nan + ", Izena=" + Izena + ", Abizena=" + Abizena + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PertsonaBBDD other = (PertsonaBBDD) obj;
		if (Abizena == null) {
			if (other.Abizena != null)
				return false;
		} else if (!Abizena.equals(other.Abizena))
			return false;
		if (Izena == null) {
			if (other.Izena != null)
				return false;
		} else if (!Izena.equals(other.Izena))
			return false;
		if (Nan == null) {
			if (other.Nan != null)
				return false;
		} else if (!Nan.equals(other.Nan))
			return false;
		return true;
	}

	//compareTo
	@Override
	public int compareTo(PertsonaBBDD p) {
		String n1,n2;
		n1 = this.Nan;
		n2 = p.Nan ;
		
		return n1.compareTo(n2);
	}
	
	
	
}
