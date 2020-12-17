package eb3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LeihoaKaixo extends JFrame {

	//Jpanel izendapena
	
	private JPanel contentPane;
	
	
	//osagaien izendapena
	private JButton btnSartu;
	private JLabel labelIzena;
	private JTextField textIzena;
	private JLabel labelIzenaEgunon ;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeihoaKaixo frame = new LeihoaKaixo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LeihoaKaixo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		textIzena = new JTextField();
		textIzena.setBounds(149, 11, 86, 20);
		contentPane.add(textIzena);
		textIzena.setColumns(10);
		
		
		
		
		
		
		btnSartu = new JButton("Sartu");
		btnSartu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//jaso izena
				String izena;
				izena=textIzena.getText();
				//idatzi "egunon "
				
				//idatzi  izena->lbl
				
				labelIzenaEgunon.setText("Egunon "+izena);
				
			}
		});
		btnSartu.setBounds(283, 86, 89, 23);
		contentPane.add(btnSartu);
		
		labelIzena = new JLabel("Sartu zure izena");
		labelIzena.setBounds(10, 14, 117, 14);
		contentPane.add(labelIzena);
		
		labelIzenaEgunon = new JLabel("");
		labelIzenaEgunon.setBounds(45, 207, 295, 14);
		contentPane.add(labelIzenaEgunon);
	}
}
