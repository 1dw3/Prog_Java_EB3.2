package eb3;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class LehioaJlistAukeraAnitzaIkasleak extends JFrame implements ActionListener{

	//defino los componentes
	private static final long	serialVersionUID = 1183812776304203166L;
	private JPanel contentPane;
	private JLabel lblTexto;
	private JButton btnSalir;
	// lista de los Grupos
	private JList<String> lstGrupos;
	private DefaultListModel<String> dlm;
	//private JList<String> lstGruposCopia;
	private DefaultListModel<String> dlmAuk;
	private JButton btnZerrendaratu;
	private JPanel panel;
	private JButton btnEzabatuGuz;
	private JTextField txtAbizena;
	private JTextField txtIzena;
	private ButtonGroup btgDBH_Batxilergoa;
	
	

	
	private JRadioButton rdbtnDBH;
	private JRadioButton rdbtnBatx;
	
	
	
	private JCheckBox chckbxJantokia;
	private JList JListAuk;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnEzabatuAuk;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JButton btnSartu;
	
	
	// main
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LehioaJlistAukeraAnitzaIkasleak frame = new LehioaJlistAukeraAnitzaIkasleak();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// JFrame
	public LehioaJlistAukeraAnitzaIkasleak() {
		
		setTitle("Leihoa Ikasleak");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTexto = new JLabel("IKASLEEN ANTOLAKETA");
		lblTexto.setBounds(79, 26, 424, 25);
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexto.setFont(new Font("Lucida Console", Font.PLAIN, 24));
		contentPane.add(lblTexto);
		
		// boton Salir
		btnSalir = new JButton("Irten");
		btnSalir.setBounds(79, 466, 424, 23);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		});
		contentPane.add(btnSalir);
		
		// lista de Opciones
		dlm = new DefaultListModel<String>();
		dlm.addElement("Anitua Jon DBH Jantokia");
		dlm.addElement("Elorriaga Ana Batxilergoa");
		dlm.addElement("Garai Leire Batxilergoa Jantokia");
		dlm.addElement("Lopez Aitor DBH ");
		
		
		dlmAuk = new DefaultListModel<String>();
		
		lstGrupos = new JList<String>();
		lstGrupos.setBounds(5, 160, 594, 91);
		lstGrupos.setModel(dlm);
		lstGrupos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		contentPane.add(lstGrupos);
		// lista de Copia
		/*lstGruposCopia = new JList<String>();
		lstGruposCopia.setBounds(605, 387, -577, -65);
		dlmAuk = new DefaultListModel<String>();
		//lstGruposCopia.setModel(dlmCopia);
		contentPane.add(lstGruposCopia);*/
		
		panel = new JPanel();
		panel.setBounds(15, 262, 559, 44);
		contentPane.add(panel);
		// btnZerrendaratu
		btnZerrendaratu = new JButton("Zerrendaratu");
		btnZerrendaratu.setBounds(10, 11, 129, 33);
		btnZerrendaratu.addActionListener(this);
		panel.setLayout(null);
		panel.add(btnZerrendaratu);
		
		// btnEzabatu
		btnEzabatuGuz = new JButton("Ezabatu");
		btnEzabatuGuz.setBounds(460, 11, 89, 23);
		btnEzabatuGuz.addActionListener(this);
		panel.add(btnEzabatuGuz);
		
		txtAbizena = new JTextField();
		txtAbizena.setBounds(5, 101, 123, 20);
		contentPane.add(txtAbizena);
		txtAbizena.setColumns(10);
		
		txtIzena = new JTextField();
		txtIzena.setText("");
		txtIzena.setBounds(150, 101, 113, 20);
		contentPane.add(txtIzena);
		txtIzena.setColumns(10);
		
		rdbtnDBH = new JRadioButton("DBH");
		rdbtnDBH.setBounds(284, 73, 85, 44);
		contentPane.add(rdbtnDBH);
		
		rdbtnBatx = new JRadioButton("Batxilergo");
		rdbtnBatx.setBounds(284, 103, 94, 50);
		contentPane.add(rdbtnBatx);
		
		
		btgDBH_Batxilergoa = new ButtonGroup();
		btgDBH_Batxilergoa.add(rdbtnDBH);
		btgDBH_Batxilergoa.add(rdbtnBatx);
		
		chckbxJantokia = new JCheckBox("Jantokia");
		chckbxJantokia.setBounds(394, 86, 74, 50);
		contentPane.add(chckbxJantokia);
		
		JListAuk = new JList();
		JListAuk.setBounds(5, 322, 594, 91);
		JListAuk.setModel(dlmAuk);
		contentPane.add(JListAuk);
		
		lblNewLabel = new JLabel("Ikasle guztiak");
		lblNewLabel.setBounds(15, 127, 200, 50);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Ikasle aukeratuak");
		lblNewLabel_1.setBounds(5, 290, 200, 50);
		contentPane.add(lblNewLabel_1);
		
		btnEzabatuAuk = new JButton("Ezabatu");
		btnEzabatuAuk.setBounds(484, 420, 80, 23);
		contentPane.add(btnEzabatuAuk);
		
		lblNewLabel_2 = new JLabel("Abizena");
		lblNewLabel_2.setBounds(5, 73, 101, 25);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Izena");
		lblNewLabel_3.setBounds(150, 73, 80, 25);
		contentPane.add(lblNewLabel_3);
		
		btnSartu = new JButton("Sartu");
		btnSartu.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
			}
		});
		btnSartu.setBounds(501, 86, 101, 50);
		contentPane.add(btnSartu);
		btnSartu.addActionListener(this);
	}

	// controlo cuando cambia la seleccion de la lista
	@Override
	public void actionPerformed(ActionEvent ae) {

		Object source = ae.getSource();
		
		if (source == this.btnSartu){
			
		}
		
		if (source == this.btnZerrendaratu){
					
			
		}
		
		if (source == this.btnEzabatuGuz){
			
			
		}
		if (source == this.btnEzabatuAuk){
			
			
		}
	}
	
}
