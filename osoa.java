package ebaluaketa3;

import java.util.Scanner;

public class osoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Znbk irakurri
		Scanner teklatua = new Scanner(System.in);
					System.out.print("Sartu balio erreala: ");
					String balioa = teklatua.nextLine();
					double znbk = Double.parseDouble(balioa);
					balioa=System.getProperty("user.language");
					System.out.println(balioa);
					teklatua.close();
					
					// mezua atera
					System.out.println("Sartutako datua  " + znbk +" da ");
	}

}
