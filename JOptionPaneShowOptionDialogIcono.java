package ebaluaketa3;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JOptionPaneShowOptionDialogIcono {

	public static void main(String[] args) {
		// muestra un cuadro de di�logo con el mensaje "Prueba de Cuadros de Di�logo"
		// el cuadro de di�logo muestra un icono personalizado

		String[] opciones = {"1AS3", "2AS3", "1DW3", "2DW3", "1SM2", "2SM2"};
		
		// Icon icono = new Icon
		ImageIcon icono = new ImageIcon(JOptionPaneShowOptionDialogIcono.
				class.getResource("ikonoak/aplicacion.png"));

		int opcion = JOptionPane.showOptionDialog(null,"Seleccione una opci�n...",
				"Cuadro de Di�logo con Opciones Personalizadas",
				JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,
				icono,opciones,opciones[0]);
		
		if (opcion > 0){
			// si se ha pulsado una opcion v�lida
			String mensaje = "Se ha pulsado la Opci�n " + new String(opciones[opcion]);
			// muestro el cuadro de d�alogo con la respuesta
			JOptionPane.showMessageDialog(null,(String)mensaje,"Respuesta",JOptionPane.OK_OPTION,null);
		}
		
		
	}

}
