package ebaluaketa3;

import javax.swing.JOptionPane;

public class JOptionPaneShowOptionDialog {

	public static void main(String[] args) {
		// Mezu hau agertarazten duen elkarrizketa koadroa " Elkarrizketa koadro baten proba" 

		String[] aukerak = {"1AS3", "2AS3", "1DW3", "2DW3", "1SM2", "2SM2"};

		int aukera = JOptionPane.showOptionDialog(null,"Aukeratu bat...","Elkarrizketa koadroa aukerekin...",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,aukerak,aukerak[0]);
		
		if (aukera > 0){
			// Baliozkoa bada 
			String mezua =  new String(aukerak[aukera])+ "aukeratu duzu";
			// erantzuna koadroan atera
			JOptionPane.showMessageDialog(null,(String)mezua,"Erantzuna",JOptionPane.OK_OPTION,null);
		}
		
		
	}

}
