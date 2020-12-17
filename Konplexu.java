package ebaluaketa3;

import java.io.Serializable;

public class Konplexu implements Comparable<Konplexu>, Serializable{

	private static final long	serialVersionUID	= -111203257934114735L;
	private double erreala;
	private double irudikaria;
	
	// lehenetsitako eraikitzailea
	Konplexu(){
		erreala = 0.0;
		irudikaria = 0.0;
	}
	
	// eraikitzailea balioekin
	Konplexu (double r, double i){
		erreala = r;
		 irudikaria = i;
	}
	
	// kopia eraikitzailea 
	Konplexu (Konplexu c){
		erreala = c.erreala;
		 irudikaria = c. irudikaria;
	}

	// Setters and Getters
	public double getErreala() {
		return erreala;
	}

	public void setReal(double erreala) {
		this.erreala = erreala;
	}

	public double getirudikaria() {
		return irudikaria;
	}

	public void setirudikaria(double irudikaria) {
		this.irudikaria = irudikaria;
	}
	
	// toString
	@Override
	public String toString() {
		return (erreala + " + " + irudikaria + "i");
	}

	// hashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(irudikaria);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(erreala);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	// equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)	// objektu berdina baldin bada
			return true;	 
		if (obj == null)	// objektua null baldin bada
			return false;
		if (getClass() != obj.getClass()) // objektuak ez baldin badira klase berekoak
			return false;
		Konplexu other = (Konplexu) obj; // objektu tenporala
		if (Double.doubleToLongBits(irudikaria) != Double.doubleToLongBits(other.irudikaria)) // lehen eremua aldaratu
			return false;
		if (Double.doubleToLongBits(erreala) != Double.doubleToLongBits(other.erreala)) // bigarren eremua aldaratu
			return false;
		return true;
	}

	// compareTo
	@Override
	public int compareTo(Konplexu k1) {
		//konplexu k1 = (Konplexu) obj; // objektu tenporala
		if(erreala > k1.erreala){
			return 1;
		}
		else if(erreala < k1.erreala){
			return -1;
		}
		else {
			if (irudikaria > k1.irudikaria){
				return 1;
			}
			else if(irudikaria < k1.irudikaria){
				return -1;
			}
			else {
				return 0;
			}
		}
	}

	
}
