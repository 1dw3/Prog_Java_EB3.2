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
import javax.swing.JTextField;

public class LeihoaKaixoOnartu extends JFrame {

	private JPanel contentPane;
	private JTextField txtKaixo;
	private JLabel lbltestua;
	private JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeihoaKaixoOnartu frame = new LeihoaKaixoOnartu();
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
	public LeihoaKaixoOnartu() {
		setTitle("leihoaklik");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblTestua = new JLabel("Anonimo");
		lblTestua.setFont(new Font("Verdana", Font.PLAIN, 14));
		
		lblTestua.setBounds(100, 191, 217, 14);
		contentPane.add(lblTestua);
		
		btnNewButton = new JButton("Onartu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			lblTestua.setText("Ongi etorri "+txtKaixo.getText());
			//LehioaKaixo lk=new LehioaKaixo();
			//lk.setTitle("bigarrena");
			//lk.setVisible(true);
			}
		});
		
		btnNewButton.setBounds(172, 145, 89, 23);
		contentPane.add(btnNewButton);
		
		
		
		txtKaixo = new JTextField();
		txtKaixo.setText("Kaixo....");
		txtKaixo.setBounds(172, 32, 86, 20);
		txtKaixo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			lblTestua.setText("Ongi etorri "+txtKaixo.getText());
			
			}
		});
		contentPane.add(txtKaixo);
		txtKaixo.setColumns(10);
	}
}
