package eb3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import eb3.Konplexu;


public class KonplexuMainSerializable {

	public static void main(String[] args) {
	
		// konplexu klaseko elementua sortu eta konplexuak.dat fitxategian gorde
		// gero datuak irakurri fitxategi horretatik eta pantailatik atera
		
		ArrayList arraylistkonplexu=new ArrayList();
		
		
			arraylistkonplexu.add( new Konplexu(3.0,5.0));
			arraylistkonplexu.add( new Konplexu(4.0,5.0));
			arraylistkonplexu.add( new Konplexu(5.0,5.0));
			arraylistkonplexu.add( new Konplexu(6.0,5.0));
			Konplexu k11=new Konplexu(3.4,4.5);
		
		try {
			// konplexuak.txt fitxategian datuak idatzi
			FileOutputStream fos=new FileOutputStream("konplexuak.dat");
			ObjectOutputStream oos = new ObjectOutputStream (fos);	
			
			// idatzi
			
				for (int i=0;i<arraylistkonplexu.size();i++){
					
					oos.writeObject(arraylistkonplexu.get(i));
					
					//System.out.println(arraylistkonplexu.get(i));
				}
			
		
		
			
			fos.close();
			// fitxategia itxi
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// konplexuak.dat
		try {
			FileInputStream fis=new FileInputStream("konplexuak.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			// irakurritako bytak konplexu klaseko datuak bihurtuko ditu
			
			
			Konplexu k=new Konplexu();
			//System.out.println("Fitxategiko datuak");
			arraylistkonplexu.clear();
			while(fis.available()>0){
				k = (Konplexu)ois.readObject();
				
				arraylistkonplexu.add(k);
				
				
				
				
			}
			for (int i=0;i<arraylistkonplexu.size();i++){
				System.out.println(arraylistkonplexu.get(i));
			}
			
		
			ois.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		
		}	
	}
}
