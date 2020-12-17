package eb3;

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

public class MultiventanaActionListenerKomunaFokusa extends JFrame implements ActionListener{
	
	//Osagarriak definitu
	private static final long serialVersionUID = 8383124629766675720L;
	private JPanel contentPane;
	private JTextField txtIzena;
	private JPasswordField pwfPasahitza;
	private JLabel lblTestua;
	private JLabel lblIzena;
	private JLabel lblPasahitza;
	private JButton btnOnartu;
	
	// main
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultiventanaActionListenerKomunaFokusa frame = new MultiventanaActionListenerKomunaFokusa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// JFrame
	public MultiventanaActionListenerKomunaFokusa() {
		
		setTitle("Leihoa Aukeraketa anitza");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTestua = new JLabel("Sarrera");
		lblTestua.setHorizontalAlignment(SwingConstants.CENTER);
		lblTestua.setFont(new Font("Lucida Console", Font.PLAIN, 14));
		lblTestua.setBounds(60, 29, 296, 14);
		contentPane.add(lblTestua);
		
		btnOnartu = new JButton("Onartu");
		btnOnartu.addActionListener(this);
		btnOnartu.setBounds(159, 139, 89, 23);
		contentPane.add(btnOnartu);
		
		txtIzena = new JTextField();
		txtIzena.setText("Sartu zure izena");
		txtIzena.addActionListener(this);
		// selecciono todo al recibir el foco
		txtIzena.addFocusListener(new FocusListener() {

            public void focusGained(FocusEvent e) {
                txtIzena.select(0, txtIzena.getText().length());
            }

            public void focusLost(FocusEvent e) {
            	txtIzena.select(0, 0);
            }
        });
		txtIzena.setBounds(111, 54, 290, 20);
		contentPane.add(txtIzena);
		txtIzena.setColumns(10);
		
		pwfPasahitza = new JPasswordField();
		pwfPasahitza.addActionListener(this);
		// selecciono todo al recibir el foco
		pwfPasahitza.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
            	pwfPasahitza.setSelectionStart(0);
            	String contrasena = new String(pwfPasahitza.getPassword()); 
            	pwfPasahitza.setSelectionEnd(contrasena.length());
            }

            public void focusLost(FocusEvent e) {
            	pwfPasahitza.select(0, 0);
            }
        });
		pwfPasahitza.setBounds(111, 81, 290, 26);
		contentPane.add(pwfPasahitza);
		
		lblIzena = new JLabel("Izena");
		lblIzena.setBounds(27, 59, 69, 20);
		contentPane.add(lblIzena);
		
		lblPasahitza = new JLabel("Pasahitza");
		lblPasahitza.setBounds(27, 84, 89, 20);
		contentPane.add(lblPasahitza);
	}
	
	// Metodo komuna actionPerformed komuna
	public void actionPerformed (ActionEvent e){
		//Datu egokiak 
		String nombrecorrecto = "1dw3";
		String contrasenacorrecta = "1dw3";
		// Datuak frogatu
		// pwf string-era pasatu behar dut
		String contrasena = new String(pwfPasahitza.getPassword());
		if(nombrecorrecto.equals(txtIzena.getText()) && contrasenacorrecta.equals(contrasena)){
			// datuak egokiak
			// leiho berria atera
			VentanaHola vh = new VentanaHola();
			// Izenburua aldatu
			vh.setTitle("Ongi etorri "+txtIzena.getText());
			// ikusgai jarri
			vh.setVisible(true);
			// hasierako leihoa itxi
			this.setVisible(false);

		}
		else{
			this.lblTestua.setText("Errorea datuetan.");
		}
	}
	
}
