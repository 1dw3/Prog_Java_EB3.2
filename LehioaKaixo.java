package eb3;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import eb2.Fecha;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JToolBar;
import java.awt.FlowLayout;



public class LehioaKaixo extends JFrame implements ActionListener{
	private static final long serialVersionUID = 8383124629766675720L;
	private JPanel contentPane;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LehioaKaixo frame = new LehioaKaixo();
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
	public LehioaKaixo() {
		setTitle("Kaixo mundua");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 634, 311);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKaixoMundua = new JLabel("Kaixo mundua");
		lblKaixoMundua.setBounds(208, 85, 110, 14);
		contentPane.add(lblKaixoMundua);
		JMenuBar menuBar = new JMenuBar();
		JMenu mnuFitxategia=new JMenu("Fitxategia");
		JMenuItem mniBerria=new JMenuItem("Berria");
		mnuFitxategia.add(mniBerria);
		menuBar.add(mnuFitxategia);
		
		
		JMenu mnHasiera = new JMenu("hasiera");
		menuBar.add(mnHasiera);
		
		JMenuItem mntmSartu = new JMenuItem("sartu");
		mnHasiera.add(mntmSartu);

		//btnBerria.setIcon(new ImageIcon("/Icon.png").getImage());

		//btnBerria.setMargin(new inserts(0, 0, 0, 0));
		this.setJMenuBar(menuBar);
		
		
			
	}
	
		
			public void actionPerformed(ActionEvent arg0) {
				VentanaHola vh = new VentanaHola();
				// le cambio el Title
				vh.setTitle("Bienvenido ");
				// la muestro
				vh.setVisible(true);
				// oculto la ventana de inicio
				this.setVisible(false);
						
		}
	}
	




