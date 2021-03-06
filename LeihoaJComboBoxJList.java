package ebaluaketa3;

import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JList;

public class LeihoaJComboBoxJList extends JFrame implements ActionListener{

	//osagarriak definitu
	private static final long	serialVersionUID = 1183812776304203166L;
	private JPanel contentPane;
	private JLabel lblTestua;
	private JButton btnSalir;
	// JComboBox taldeak
	private JComboBox<String> cmbTaldeak;
	private JList <String> zerrenda;
	private JButton btnPasatu;
	
	private DefaultListModel<String> dlmzerrenda;
	
	// main
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeihoaJComboBoxJList frame = new LeihoaJComboBoxJList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// JFrame
	public LeihoaJComboBoxJList() {
		
		setTitle("Leihoa JComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		lblTestua = new JLabel("Aukeratu ...");
		lblTestua.setHorizontalAlignment(SwingConstants.LEFT);
		lblTestua.setFont(new Font("Lucida Console", Font.PLAIN, 24));
		contentPane.add(lblTestua, BorderLayout.NORTH);
		
		// boton Irten
		btnSalir = new JButton("Irten");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		});
		contentPane.add(btnSalir, BorderLayout.SOUTH);
		
		// comboBox aukerak
		cmbTaldeak = new JComboBox<String>();
		cmbTaldeak.setToolTipText("Taldeak");
		cmbTaldeak.addItem("1AS3");
		cmbTaldeak.addItem("2AS3");
		cmbTaldeak.addItem("1DW3");
		cmbTaldeak.addItem("2DW3");
		cmbTaldeak.setSelectedIndex(0);
		//cmbTaldeak.addActionListener(this);
		contentPane.add(cmbTaldeak, BorderLayout.WEST);
		
		dlmzerrenda = new DefaultListModel<String>();
		
		zerrenda = new JList<String>();
		zerrenda.setModel(dlmzerrenda);
		contentPane.add(zerrenda, BorderLayout.EAST);
		dlmzerrenda.addElement("Taldeak");
		
		btnPasatu = new JButton(">>");
		btnPasatu.addActionListener(this);
		int posizioak[]=zerrenda.getSelectedIndices();
		int luzera = posizioak.length;
		contentPane.add(btnPasatu, BorderLayout.CENTER);
		
	}

	// zerrendan aukera egiten denean...
	@Override
	public void actionPerformed(ActionEvent ae) {
		// aukeratutako elementua aldatzen
		// etiketaren balioa aldatu
		//int indiceSelecionado = lse.getFirstIndex();
		String aukera = (String) this.cmbTaldeak.getSelectedItem();
		this.lblTestua.setText(aukera);
		dlmzerrenda.addElement((String) cmbTaldeak.getSelectedItem());
		
	}

}
