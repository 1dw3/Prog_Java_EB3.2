package eb3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class KaixoLeihoaOrdua extends JFrame {

	private static final long serialVersionUID = -5959033280333645634L;

	private JPanel contentPane;
	public JLabel lblKaixoMundua;
	// main
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KaixoLeihoaOrdua frame = new KaixoLeihoaOrdua();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// JFrame
	public KaixoLeihoaOrdua() {
		setTitle("Kaixo leihoa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKaixoMundua = new JLabel("Kaixo mundua");
		lblKaixoMundua.setHorizontalAlignment(SwingConstants.CENTER);
		lblKaixoMundua.setFont(new Font("Lucida Console", Font.PLAIN, 14));
		lblKaixoMundua.setBounds(111, 122, 176, 14);
		contentPane.add(lblKaixoMundua);
	}

}
