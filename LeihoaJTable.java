package ebaluaketa3;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class LeihoaJTable extends JFrame {

	//osagarriak definitu
	private static final long	serialVersionUID = 1183812776304203166L;
	private JPanel contentPane;
	private JLabel lblTestua;
	private JButton btnIrten;
	// JTable
	private JTable taula;
	// zutabeen burukoak
	private Vector<String> zutabeak;
	// datos de la tabla
	private Vector<Vector<String>> datuakTaula;
	
	// main
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeihoaJTable frame = new LeihoaJTable();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// JFrame
	public LeihoaJTable() {
		
		setTitle("leihoa JTable");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		lblTestua = new JLabel("Ikasleen datuak");
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
		
		// JTable
		// cabeceras de las columnas
		zutabeak = new Vector<String>();
		zutabeak.add("NAN");
		zutabeak.add("Izena");
		zutabeak.add("Abizenak");
		zutabeak.add("Taldea");
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/dbikasleak", "root", "");
			// konexio egokia
			
			// ikasle guztiak hartu
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM ikasleak");
			
			// taulako datu guzien bektorea
			datuakTaula = new Vector<Vector<String>>();
			
			// datuak banan banan gehitu
			while (rs.next()) {
				Vector<String> lerroa = new Vector<String>();
				lerroa.add(rs.getString("nan"));
				lerroa.add(rs.getString("izena"));
				lerroa.add(rs.getString("abizenak"));
				lerroa.add(rs.getString("taldea"));
				lerroa.add("\n\n\n\n\n\n\n");
        datuakTaula.add(lerroa);
			}
			
			// JTable egin
			DefaultTableModel modelo = new DefaultTableModel(datuakTaula, zutabeak);
      taula = new JTable(modelo);
      taula.setPreferredScrollableViewportSize(new Dimension(500, 200));
      taula.setFillsViewportHeight(true);

      // scroll pane gehitu 
      JScrollPane scrollPane = new JScrollPane(taula);

      // scroll pane panel nagusian jarri
      contentPane.add(scrollPane, BorderLayout.CENTER);
			
			// ResultSet itxi
			rs.close();
			// statement itxi
			st.close();

			// konexioa itxi
			conexion.close();
		}
		catch (SQLException | ClassNotFoundException sqle){
			// konexioa ez egokia
			sqle.printStackTrace();
			System.out.println("Error de Conexión");
		}
		
	}

}
