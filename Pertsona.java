package eb3;

import java.io.Serializable;
import java.util.ArrayList;

public class Pertsona  implements Serializable{
	private String izena;
	private String abizena1;
	private String abizena2;
	ArrayList <Ikastaro> AL_Ikastaro=new ArrayList<Ikastaro>();
	
	public Pertsona (String izena, String abizena1, String abizena2, 
			ArrayList<Ikastaro> ALI) {
		this.izena=izena;
		this.abizena1=abizena1;
		this.abizena2=abizena2;
		AL_Ikastaro=ALI;
	}
	public Pertsona () {
		
	}
	@Override
	public String toString() {
		
		String katea= "Pertsona [izena=" + izena + ", abizena1=" + abizena1 + 
				", abizena2=" + abizena2 + "]";
		for (int i=0;i<AL_Ikastaro.size();i++) {
			katea=katea+", "+AL_Ikastaro.get(i).toString();
		}
		//System.out.println(katea);
		
		return katea;
	}
	

}
