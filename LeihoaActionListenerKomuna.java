package ebaluaketa3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class LeihoaActionListenerKomuna extends JFrame {

	private static final long	serialVersionUID	= -2351775708449263953L;
	private JPanel contentPane;
	private JTextField txtIzena;
	private JPasswordField pwfPasahitza;
	private JLabel lblTestua;
	
	// main
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeihoaActionListenerKomuna frame = new LeihoaActionListenerKomuna();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// JFrame
	public LeihoaActionListenerKomuna() {
		
		setTitle("Leihoa JPasswordField");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTestua = new JLabel("");
		lblTestua.setHorizontalAlignment(SwingConstants.CENTER);
		lblTestua.setFont(new Font("Lucida Console", Font.PLAIN, 14));
		lblTestua.setBounds(60, 29, 296, 14);
		contentPane.add(lblTestua);
		
		JButton btnOnartu = new JButton("Onartu");
		btnOnartu.addActionListener(new ActionListenerKomuna());
		btnOnartu.setBounds(159, 139, 89, 23);
		contentPane.add(btnOnartu);
		
		txtIzena = new JTextField();
		txtIzena.setText("Sartu izena ...");
		txtIzena.addActionListener(new ActionListenerKomuna());
		txtIzena.addFocusListener(new ActionListenerKomuna());
		//txtIzena.addFocusListener(new ActionListenerDatuakEgiaztatu());
		
		txtIzena.setBounds(113, 59, 300, 20);
		contentPane.add(txtIzena);
		txtIzena.setColumns(10);
		
		pwfPasahitza = new JPasswordField();
		pwfPasahitza.addActionListener(new ActionListenerKomuna());
		//pwfPasahitza.addFocusListener(new ActionListenerDatuakEgiaztatu());
		pwfPasahitza.setBounds(111, 81, 290, 26);
		contentPane.add(pwfPasahitza);
		
		JLabel lblNombre = new JLabel("Izena");
		lblNombre.setBounds(27, 59, 69, 20);
		contentPane.add(lblNombre);
		
		JLabel lblContraseña = new JLabel("Pasahitza");
		lblContraseña.setBounds(27, 84, 89, 20);
		contentPane.add(lblContraseña);
	}
	
	
	
	
	// ActionListener komunak diseinatzeko lekua
	private class ActionListenerKomuna implements ActionListener, FocusListener {
		public void actionPerformed(ActionEvent e) {
			// datu egokiak definitu
			String IzenEgokia = new String("1dw3");
			String PasahitzaEgokia = new String("1dw3");
			// datuak konprobatu
			//  JPasswordField-en getPassword metodoak    char[] bueltatzen du
			//  beraz, string bihurtu behar dugu
			String contrasena = new String(pwfPasahitza.getPassword());
			if(IzenEgokia.equals(txtIzena.getText()) && PasahitzaEgokia.equals(contrasena)){
				lblTestua.setText("Ongietorria "+txtIzena.getText());
			}
			else{
				lblTestua.setText("Datu ez egokiak. ");
			}
		}
		
		
		
		
		
		
		public void focusLost(FocusEvent e) {
			// datuak jarri
						String nombrecorrecto = new String("1dw3");
						String contrasenacorrecta = new String("1dw3");
						// datuak konprobatu
						//  JPasswordField-en getPassword metodoak    char[] bueltatzen du
						//  beraz, string bihurtu behar dugu
						String contrasena = new String(pwfPasahitza.getPassword());
						if(nombrecorrecto.equals(txtIzena.getText()) && contrasenacorrecta.equals(contrasena)){
							lblTestua.setText("Ongietorria "+txtIzena.getText());
						}
						else{
							lblTestua.setText("Datu ez egokiak. ");
						}
			 }
		
		public void focusGained(FocusEvent e) {
			txtIzena.setText("Proba");
			txtIzena.selectAll();
		}
	}
	
	
}
