package eb3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.BorderLayout;

import javax.swing.JList;

public class LeihoaJList extends JFrame implements ListSelectionListener{

	//osagarriak definitu
	private static final long	serialVersionUID = 1183812776304203166L;
	private JPanel contentPane;
	private JLabel lblTestua;
	private JButton btnIrten;
	private DefaultListModel<String> dlm;
	// Taldeen zerrenda
	private JList<String> zndTaldeak;
	
	// main
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeihoaJList frame = new LeihoaJList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// JFrame
	public LeihoaJList() {
		
		
		
		setTitle("Leihoa JList");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		lblTestua = new JLabel("Aukeratu ...");
		lblTestua.setHorizontalAlignment(SwingConstants.CENTER);
		lblTestua.setFont(new Font("Lucida Console", Font.PLAIN, 24));
		contentPane.add(lblTestua, BorderLayout.NORTH);
		
		// Irten botoia
		btnIrten = new JButton("Irten");
		btnIrten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		});
		contentPane.add(btnIrten, BorderLayout.SOUTH);
		
		// Aukera datu eredua
		dlm = new DefaultListModel<String>();
		dlm.addElement("1AS3");
		dlm.addElement("2AS3");
		dlm.addElement("1DW3");
		dlm.addElement("2DW3");
		
		
	

		zndTaldeak = new JList<String>();
		zndTaldeak.setModel(dlm);
		zndTaldeak.addListSelectionListener(this);
		contentPane.add(zndTaldeak, BorderLayout.WEST);
	}

	// zerrendako aldaketak kontrolatu
	@Override
	public void valueChanged(ListSelectionEvent lse) {
		// aukeratutako balioa aldatzen denean
		// etiketa aldatu
		//int indiceSelecionado = lse.getFirstIndex();
		int pos=zndTaldeak.getSelectedIndex();
		//System.out.println(pos);
		String aukera = this.dlm.getElementAt(pos);
	
		
		
		this.lblTestua.setText(aukera);
		
		
	}
	

}
