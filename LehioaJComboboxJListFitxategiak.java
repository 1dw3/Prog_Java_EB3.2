package ebaluaketa3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.AbstractButton;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;


import say.swing.JFontChooser;
import javax.swing.JList;

public class LehioaJComboboxJListFitxategiak extends JFrame implements ActionListener {
	
	// Osagaiak definitu
	private static final long serialVersionUID = -5876470080134839940L;
	private JPanel contentPane;
	
	// Editorea
	private JEditorPane editor;
	private JScrollPane scrollPaneEditor;
	
	// aldatua
	private boolean aldatua = false;
	
	// Dokumentuaren izena
	private File DokumentuIzena;
	
	// JFileChooser
	private JFileChooser fileChooser;
	private JButton btnIrten;
	
	private JList <String> zerrenda;
	
	private DefaultListModel<String> dlmzerrenda;
	private JPanel panel;
	
	// main
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LehioaJComboboxJListFitxategiak frame = new LehioaJComboboxJListFitxategiak();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}
	
	// JFrame
	public LehioaJComboboxJListFitxategiak() {
		UIManager.put("OptionPane.okButtonText", "Onartu");
		setTitle("LehioaJComboboxJListFitxategiak");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 993, 457);
		
	// Aplikazioaren itxiera x sakatzean kontrolatzeko
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				irten();
			}
		});
		
		// Jpanel
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
	
		
		
		
		// scroll barra edukiontzian
		scrollPaneEditor = new JScrollPane(editor);
		
		// editorea edukiontziaren erdian
		contentPane.add(scrollPaneEditor, BorderLayout.CENTER);
		
		btnIrten = new JButton("Irten");
		btnIrten = new JButton("Irten");
		btnIrten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		});
		scrollPaneEditor.setColumnHeaderView(btnIrten);
		
		dlmzerrenda = new DefaultListModel<String>();
		
		zerrenda = new JList();
		zerrenda.setModel(dlmzerrenda);
		dlmzerrenda.addElement("IZENAK");
		scrollPaneEditor.setRowHeaderView(zerrenda);
		
		panel = new JPanel();
		scrollPaneEditor.setViewportView(panel);
		zerrendabete();
		
	}

	

	@Override
	
	public void actionPerformed(ActionEvent e) {
		// non gertatu da gertaera

		
		
		
		
		if(e.getSource() == btnIrten){
			if (aldatua){
				// Aplikaziotik irten
				//this.DokumentuaGorde();
				//this.irten();
			}
		}
		
	}
	public void zerrendabete(){
		FileReader fr = null;
	    BufferedReader br = null;
	    //Cadena de texto donde se guardara el contenido del archivo
	    String contenido = "";
	    try
	    {
	        //ruta puede ser de tipo String o tipo File
	        fr = new FileReader( "izenak.dat" );
	        br = new BufferedReader( fr );

	        String linea;
	        //Obtenemos el contenido del archivo linea por linea
	        while( ( linea = br.readLine() ) != null ){ 
	        	System.out.println(linea);
	            dlmzerrenda.addElement(linea);
	        }

	    }catch( Exception ex ){ 
	    	System.out.println("errorea"); 
	    }
	    //finally se utiliza para que si todo ocurre correctamente o si ocurre 
	    //algun error se cierre el archivo que anteriormente abrimos
	    finally
	    {
	        try{
	            br.close();
	        }catch( Exception ex ){}
	    }
	    
		}

	
	private void irten(){
		if (aldatua){
			// datuak aldatu badira
			//gordetzekogaldetu();
		}
		// irten aplikaziotik
		System.exit(0);
	}

}
