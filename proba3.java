package eb3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class proba3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pos1=0;
		String izena;
		String abizena;
		String adina;
		/*int pos2=0;
		String izena;
		String abizena;
		String adina;
		String katea1="kepa#etxebarria";
		String katea2="kepa#51";
			
		
		pos1= katea1.indexOf('#');
		
		izena=katea1.substring(0, pos1);
		abizena=katea1.substring(pos1+1);
		
		
		pos2= katea2.indexOf("#");
		
		adina=katea2.substring(pos1+1);
		
		;*/
		 
		ArrayList <String> ALI=new ArrayList<String>();
		
		
		try {
			File Izenakirakurri = new File ("izenak.txt");
			
			FileReader fr = new FileReader (Izenakirakurri);
			
			BufferedReader br = new BufferedReader(fr);
			
			
			
			// fitxategiaren edukia atera
			System.out.println("Fitxategiaren edukia");
			String lerroa=null;
			while((lerroa=br.readLine())!=null){
				System.out.println(lerroa);
				pos1= lerroa.indexOf('#');
				
				izena=lerroa.substring(0, pos1);
				abizena=lerroa.substring(pos1+1);
				
				System.out.println(izena);
				System.out.println(abizena);
				//System.out.println(adina);
			
			
			}
			Izenakfr.close();
			
			// fitxategia itxi
			
		} catch (FileNotFoundException fnfe) {
			// Fitxategia ez baldin badu ikusten
			System.out.println("Errorea irakurtzean. Fitxategia ezin jaso");
			//fnfe.printStackTrace();
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			//ioe.printStackTrace();
			System.out.println("Errorea. Administadorearekin kontaktatu");
		}
		
				

	}
	
}


