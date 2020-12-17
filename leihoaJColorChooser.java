package ebaluaketa3;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class leihoaJColorChooser extends JFrame {


	private static final long serialVersionUID = -1971749973978182889L;

	private JPanel contentPane;
	private JLabel lblTestua;
	private JButton btnOnartu;
	
	// main
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					leihoaJColorChooser frame = new leihoaJColorChooser();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// JFrame
	public leihoaJColorChooser() {
		setTitle("Klik gertaera");
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
				// muestro el JColorChooser
				Color koloreberria = JColorChooser.showDialog(contentPane, "Elija un Color ...", contentPane.getBackground());			
				contentPane.setBackground(koloreberria);
				
			}
		});
		btnOnartu.setBounds(159, 66, 89, 23);
		contentPane.add(btnOnartu);
	}
}
