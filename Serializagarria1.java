package eb3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Serializagarria1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		try {
			//lotura egingo dut
			FileOutputStream fos=new FileOutputStream ("Pertsonak.dat");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			ArrayList <Ikastaro> ALI=new ArrayList<Ikastaro>();
			Ikastaro IK0=new Ikastaro("ikastaro1",1, 2001);
			ALI.add(IK0);
			IK0=new Ikastaro("ikastaro2",2, 2002);
			ALI.add(IK0);
			
			Pertsona P0=new Pertsona ("Kepa", "Etxebarria", "Artetxe", ALI);
			System.out.println(P0);
			
			//idatzi fitxategian
			oos.writeObject(P0);
			
			//fitxategia itxi
			oos.close();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			//Lotura egin
			FileInputStream fis=new FileInputStream ("Pertsonak.dat");
			ObjectInputStream ois=new ObjectInputStream (fis);
			//irakurritako bytak konplexu klaseko datuak bihurtzen ditu
			Pertsona P0=new Pertsona();
			P0=(Pertsona)ois.readObject();
			System.out.println(P0);
			ois.close();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
