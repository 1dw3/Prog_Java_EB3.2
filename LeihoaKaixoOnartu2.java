package ebaluaketa3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LeihoaKaixoOnartu2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeihoaKaixoOnartu2 frame = new LeihoaKaixoOnartu2();
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
	public LeihoaKaixoOnartu2() {
		setTitle("leihoaklik");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblTestua = new JLabel("Ez duzu sakatu botoia");
		lblTestua.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblTestua.setBounds(129, 93, 217, 14);
		contentPane.add(lblTestua);
		
		JButton btnNewButton = new JButton("Onartu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			lblTestua.setText("Botoia sakatu duzu");
			LehioaKaixo lk=new LehioaKaixo();
			lk.setTitle("bigarrena");
			lk.setVisible(true);}
		});
		btnNewButton.setBounds(172, 145, 89, 23);
		contentPane.add(btnNewButton);
	}

}
