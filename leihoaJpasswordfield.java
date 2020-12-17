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
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class leihoaJpasswordfield extends JFrame {

	//osagarriak jarri
	private static final long	serialVersionUID = 1183812776304203166L;
	private JPanel contentPane;
	private JTextField txtIzena;
	private JPasswordField pwPasahitza;
	private JLabel lblTestua;
	private JButton btnOnartu;
	private JLabel lblPasahitza;
	private JLabel lblIzena;
	private JLabel lblTestua1;
	private JLabel lblTestua2;
	
	private String izenegokia = new String("Kepa");
	private String pasahitzaegokia = new String("k");
	// main
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					leihoaJpasswordfield frame = new leihoaJpasswordfield();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// JFrame
	public leihoaJpasswordfield() {
		// datu egokiak jarri
		
		
		setTitle("Leihoa JPasswordField");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTestua = new JLabel("");
		lblTestua.setVerticalAlignment(SwingConstants.TOP);
		lblTestua.setFont(new Font("Lucida Console", Font.PLAIN, 14));
		lblTestua.setBounds(27, 84, 254, 20);
		//contentPane.add(lblTestua);
		
		JLabel lblTestua1 = new JLabel("");
		lblTestua1.setBounds(88, 46, 267, 14);
		contentPane.add(lblTestua1);
		contentPane.add(lblTestua);
		
		btnOnartu = new JButton("Onartu");
		//frame.set
		btnOnartu.addActionListener (new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
					// datuak baieztatu
					// getPassword-ek char[] bueltatzen du
					// equals erabiltzeko char   String bihurtu behar dut
					String contrasena = new String(pwPasahitza.getPassword());
					if(izenegokia.equals(txtIzena.getText()) && pasahitzaegokia.equals(contrasena)){
						lblTestua1.setText("Ongi etorria  "+lblTestua1.getText());
						kaixoLeihoa kl = new kaixoLeihoa ();

						// Title aldatu
						kl.setTitle("Ongi etorria "+txtIzena.getText());
						// Agertarazi
						kl.setVisible(true);
						
						// hasierako leihoa ezkutatu
						//kl.lblKaixoMundua.setText("Ongi etorria "+txtIzena.getText());
						
						
					}
					else{
						lblTestua1.setText("Datu ez egokiak.");
					}
				}
			});
		btnOnartu.setBounds(160, 210, 89, 23);
		contentPane.add(btnOnartu);
		
		// ******* txtIzena *************
		txtIzena = new JTextField();
		txtIzena.setText("Sartu izena...");
		//ActionListener
		txtIzena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				// Enter sakatzean
				// datuak baieztatu
				// getPassword-ek char[] bueltatzen du
				// equals erabiltzeko char   String bihurtu behar dut
				String contrasena = new String(pwPasahitza.getPassword());
				if(izenegokia.equals(txtIzena.getText()) && pasahitzaegokia.equals(contrasena)){
					lblTestua1.setText("Ongi etorri "+txtIzena.getText());
					

					
				}
				else{
					lblTestua1.setText("Datu ez egokiak.");
				}
			}
		});
		//FocusListener
		txtIzena.addFocusListener(new FocusListener() {
			 public void focusGained(FocusEvent e) {
				 txtIzena.setSelectionStart(0);
				 txtIzena.setSelectionEnd(txtIzena.getText().length());
			 }

			 public void focusLost(FocusEvent e) {
			  pwPasahitza.select(0, 0);
			  String pass = new String(pwPasahitza.getPassword());
				if(izenegokia.equals(txtIzena.getText()) && pasahitzaegokia.equals(pass)){
					lblTestua1.setText("Ongi etorria  "+txtIzena.getText());
				}
				else{
					lblTestua1.setText("Datu ez egokiak.");
				}
			 }
			});
		
		txtIzena.setBounds(100, 108, 300, 20);
		contentPane.add(txtIzena);
		txtIzena.setColumns(10);
		
		// ******* pwPasahitza *************
		pwPasahitza = new JPasswordField();
		pwPasahitza.setToolTipText("Sartu pasahitza");
		//ActionListener
		pwPasahitza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				// compruebo los datos
				// el metodo getPassword de JPasswordField devuelve un char[]
				// para poder usar equals tengo que convertir el char [] a String
				String pass = new String(pwPasahitza.getPassword());
				if(izenegokia.equals(txtIzena.getText()) && pasahitzaegokia.equals(pass)){
					lblTestua1.setText("Ongi etorria  "+txtIzena.getText());
				}
				else{
					lblTestua1.setText("Datu ez egokiak.");
				}
			}
		});
		//FocusListener
		pwPasahitza.addFocusListener(new FocusListener() {
			 public void focusGained(FocusEvent e) {
			  pwPasahitza.setSelectionStart(0);
			 String pass = new String(pwPasahitza.getPassword()); 
			 pwPasahitza.setSelectionEnd(pass.length());
			 }

			 public void focusLost(FocusEvent e) {
			  pwPasahitza.select(0, 0);
			 }
			 
			});
		

		pwPasahitza.setBounds(100, 139, 290, 26);
		contentPane.add(pwPasahitza);
		
		lblIzena = new JLabel("Nombre");
		lblIzena.setBounds(27, 59, 69, 20);
		contentPane.add(lblTestua);
		
		lblPasahitza= new JLabel("Contraseña");
		lblTestua.setBounds(27, 84, 89, 20);
		contentPane.add(lblTestua);
		
		JLabel lblErabiltzailea = new JLabel("Erabiltzailea");
		lblErabiltzailea.setBounds(10, 111, 80, 14);
		contentPane.add(lblErabiltzailea);
		
		JLabel lblPasahitza_1 = new JLabel("Pasahitza");
		lblPasahitza_1.setBounds(10, 145, 46, 14);
		contentPane.add(lblPasahitza_1);
		
		
	}
	
}
