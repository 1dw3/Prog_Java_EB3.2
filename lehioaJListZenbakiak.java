package ebaluaketa3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;

public class lehioaJListZenbakiak extends JFrame {

	private JPanel contentPane;
	private JTextField txtZenbakia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lehioaJListZenbakiak frame = new lehioaJListZenbakiak();
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
	public lehioaJListZenbakiak() {
		setTitle("LehioaJListZenbakiak");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblZenbakia = new JLabel("Zenbakia");
		panel.add(lblZenbakia);
		
		txtZenbakia = new JTextField();
		txtZenbakia.setText("0");
		panel.add(txtZenbakia);
		txtZenbakia.setColumns(10);
		
		JButton btnSartu = new JButton("Sartu");
		panel.add(btnSartu);
		
		JButton btnEzabatu = new JButton("Ezabatu");
		panel.add(btnEzabatu);
		
		JButton btnGarbitu = new JButton("Garbitu");
		panel.add(btnGarbitu);
		
		JList list = new JList();
		contentPane.add(list, BorderLayout.CENTER);
	}

}
