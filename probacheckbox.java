package ebaluaketa3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class probacheckbox extends JFrame {

	private JPanel contentPane;
	private ButtonGroup btgKoloreak;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					probacheckbox frame = new probacheckbox();
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
	public probacheckbox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JCheckBox checkBox = new JCheckBox("New check box");
		checkBox.setBounds(67, 70, 97, 23);
		contentPane.add(checkBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(239, 87, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setBounds(239, 120, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_2.setBounds(239, 176, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		btgKoloreak = new ButtonGroup();

		btgKoloreak.add(rdbtnNewRadioButton);

		btgKoloreak.add(rdbtnNewRadioButton_1);

		

	
	}
}
