package ebaluaketa3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import say.swing.JFontChooser;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class koloreaetaiturburua extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					koloreaetaiturburua frame = new koloreaetaiturburua();
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
	public koloreaetaiturburua() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Iturburua aldatu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int aukera; 
				Font berriFont; 
				// JFontChooser agertarazi
				JFontChooser fontChooser = new JFontChooser(); 
				aukera = fontChooser.showDialog(contentPane); 
				if (aukera == JFontChooser.OK_OPTION){ 
				// OK sakatu bada
				// Etiketaren iturburua aldatu
				berriFont = fontChooser.getSelectedFont(); 
				textField.setFont(berriFont); 
				// Etiketaren testua aldatu 
				textField.setText("Iturburua aldatua."); 
				}

			}
		});
		btnNewButton.setBounds(20, 93, 123, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Kolorea aldatu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color newColor = JColorChooser.showDialog
						(contentPane, "Aukeratu kolorea ...", contentPane.getBackground()); 
				//contentPane.setBackground(newColor);
				//textField.selectAll();
				//textField.setEnabled(true); 
				//textField.setBackground(Color.GRAY); 
				textField.setForeground(newColor);
				//textField.setDisabledTextColor(Color.WHITE);
				
				//textField.setSelectionColor(newColor);

			}
		});
		btnNewButton_1.setBounds(228, 93, 141, 23);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(103, 30, 162, 23);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
