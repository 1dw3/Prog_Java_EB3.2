package eb3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class leiho_nabigazioa1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					leiho_nabigazioa1 frame = new leiho_nabigazioa1();
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
	public leiho_nabigazioa1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("leihoa2");
		btnNewButton.setBounds(10, 11, 108, 127);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				leiho_nabigazioa2_content_pane_aldaketa frame = new leiho_nabigazioa2_content_pane_aldaketa();
				frame.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Leihoa3");
		btnNewButton_1.setBounds(316, 14, 108, 121);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				leiho_nabigazioa3 frame3 = new leiho_nabigazioa3();
				frame3.setVisible(true);
			}
		});
		contentPane.add(btnNewButton_1);
	}






}


