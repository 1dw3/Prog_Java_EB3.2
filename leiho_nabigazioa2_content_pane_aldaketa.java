package eb3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class leiho_nabigazioa2_content_pane_aldaketa extends JFrame {

	private JPanel contentPane;
	boolean contentpane1=true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					leiho_nabigazioa2_content_pane_aldaketa frame = new leiho_nabigazioa2_content_pane_aldaketa();
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
	public leiho_nabigazioa2_content_pane_aldaketa() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(contentPane_1, BorderLayout.NORTH);
		contentPane_1.setLayout(new BorderLayout(0, 0));
		contentPane_1.setVisible(contentpane1);
		
		JPanel contentPane_2 = new JPanel();
		contentPane_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(contentPane_2, BorderLayout.SOUTH);
		contentPane_2.setLayout(new BorderLayout(0, 0));
		contentPane_2.setVisible(!contentpane1);
		
		JLabel lblNewLabel = new JLabel("hau content pane 1 da");
		contentPane_1.add(lblNewLabel, BorderLayout.WEST);
		JLabel lblNewLabel2 = new JLabel("hau content pane 2 da");
		contentPane_2.add(lblNewLabel2, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("Content pane aldaketa");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentpane1=!contentpane1;
				contentPane_1.setVisible(contentpane1);
				contentPane_2.setVisible(!contentpane1);
				
			}
		});
		contentPane.add(btnNewButton, BorderLayout.CENTER);
		
		
		
	}

}
