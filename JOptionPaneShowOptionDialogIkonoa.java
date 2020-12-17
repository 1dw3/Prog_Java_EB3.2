package ebaluaketa3;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JOptionPaneShowOptionDialogIkonoa {

	public static void main(String[] args) {
		// elkarrizketa bat aurkezten du aukera pertsonalizatuekin
		// ikono pertsonalizatua ere

		String[] opciones = {"1AS3", "2AS3", "1DW3", "2DW3", "1SM2", "2SM2"};
		
		// Icon icono = new Icon
		ImageIcon ikonoa = new ImageIcon(JOptionPaneShowOptionDialogIkonoa.
				class.getResource("ikonoak/abrir.gif"));

		int aukera = JOptionPane.showOptionDialog(null,"Aukeratu...",
				"Elkarrizketa koadroa aukera pertsonalizatuekin",
				JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,
				ikonoa,opciones,opciones[2]);
		
		if (aukera >= 0){
			// Aukera egokia baldin bada
			String mensaje = "Aukera hau hartu duzu " + new String(opciones[aukera]);
			// Elkarrizketa koadroa erantzunarekin
			JOptionPane.showMessageDialog(null,(String)mensaje,"Erantzuna",
					JOptionPane.OK_OPTION,null);
		}
		
		
	}

}
