package ebaluaketa3;

import javax.swing.JOptionPane;

public class JOptionPaneShowInputDialog {

	public static void main(String[] args) {
		// Mezu hau agertarazten duen elkarrizketa koadroa " Elkarrizketa koadro baten proba" 
		
		String erantzuna = (String)JOptionPane.showInputDialog(null,(String)"Sartu izena: ","Datuak sartzeko elkarrizketa koadroa",JOptionPane.QUESTION_MESSAGE,null, null, "Izen barik");
		
		if (erantzuna != null){
			if (!erantzuna.equals("Izen barik")){
				// Balioren bat sartu baldin bada
				String mezua="";
				mezua = "Kaixo " + erantzuna;
				
				// muestro el cuadro de díalogo con la respuesta
				JOptionPane.showMessageDialog(null,(String)mezua,"erantzuna",JOptionPane.OK_OPTION,null);
			}
		}
		
	}

}
