package ebaluaketa3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;

public class kalku2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kalku2 frame = new kalku2();
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
	public kalku2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 338, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		textField.setColumns(10);
		panel.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		//panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_1.setLayout(new GridLayout(4, 3, 0, 0));
		
		
		JButton btnNewButton_0 = new JButton("0");
		btnNewButton_0.setForeground(new Color(0, 0, 128));
		btnNewButton_0.setFont(new Font("Arial", Font.BOLD, 40));
		panel_1.add(btnNewButton_0);
		
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setForeground(new Color(0, 0, 128));
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 40));
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.setForeground(new Color(0, 0, 128));
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 40));
		panel_1.add(btnNewButton_2);
		
		
		
		JButton btnNewButton_3 = new JButton("New button");
		panel_1.add(btnNewButton_3);
		
		
		
		JButton btnNewButton_6 = new JButton("New button");
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_4 = new JButton("New button");
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("New button");
		panel_1.add(btnNewButton_7);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.EAST);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		panel_1.setLayout(new GridLayout(4, 3, 0, 0));
		
		
		
		JButton btn_batu = new JButton("+");
		btn_batu.setForeground(new Color(0, 0, 128));
		btn_batu.setFont(new Font("Arial", Font.BOLD, 40));
		panel_2.add(btn_batu);
		
		JButton btn_kendu = new JButton("-");
		btn_kendu.setForeground(new Color(0, 0, 128));
		btn_kendu.setFont(new Font("Arial", Font.BOLD, 40));
		panel_2.add(btn_kendu);
		
		JButton btn_bider = new JButton("*");
		btn_bider.setForeground(new Color(0, 0, 128));
		btn_bider.setFont(new Font("Arial", Font.BOLD, 40));
		panel_2.add(btn_bider);
		
		JButton btn_zati = new JButton("/");
		btn_zati.setForeground(new Color(0, 0, 128));
		btn_zati.setFont(new Font("Arial", Font.BOLD, 40));
		panel_2.add(btn_zati);
	}

}
