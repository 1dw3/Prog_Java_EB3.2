package ebaluaketa3;

import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class leihoaJFileChooser extends JFrame {


	private static final long serialVersionUID = -1971749973978182889L;

	private JPanel contentPane;
	private JLabel lblTestua;
	private JButton btnOnartu;
	
	// main
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					leihoaJFileChooser frame = new leihoaJFileChooser();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// JFrame
	public leihoaJFileChooser() {
		setTitle("Klik Ekintza");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTestua = new JLabel("Ez da onartu sakatu");
		lblTestua.setHorizontalAlignment(SwingConstants.CENTER);
		lblTestua.setFont(new Font("Lucida Console", Font.PLAIN, 14));
		lblTestua.setBounds(60, 29, 296, 14);
		contentPane.add(lblTestua);
		
		btnOnartu = new JButton("Onartu");
		btnOnartu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				// File chooser fitxategia aukeratzeko
				JFileChooser fileChooser = new JFileChooser();
				int aukera = fileChooser.showOpenDialog(contentPane);
				
				if (aukera == JFileChooser.APPROVE_OPTION){
					// Onartu sakatu da
					lblTestua.setText("Fitxategi hau aukeratu duzu "+fileChooser.getSelectedFile());
				}
				else if (aukera == JFileChooser.CANCEL_OPTION){
					// Utzi sakatzean
					lblTestua.setText("Utzi sakatu da");
				}
				else if (aukera == JFileChooser.ERROR_OPTION){
					// Errorea gertatu da
					lblTestua.setText("Errorea gertatu da.");
				}
			}
		});
		btnOnartu.setBounds(159, 66, 89, 23);
		contentPane.add(btnOnartu);
	}
}
