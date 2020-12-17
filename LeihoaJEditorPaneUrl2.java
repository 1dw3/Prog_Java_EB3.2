package ebaluaketa3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.Document;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LeihoaJEditorPaneUrl2 extends JFrame  {
	
	//osagarriak definitu
	private static final long	serialVersionUID	= -8995452455263689528L;
	private JPanel contentPane;
	
	// editor
	private JEditorPane editorea;
	private JScrollPane scrollPaneEditorea;
	private JLabel lblNewLabel;
	private JTextField textField;
	
	
	String helbidea;
	// main
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeihoaJEditorPaneUrl2 frame = new LeihoaJEditorPaneUrl2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	// JFrame
	public LeihoaJEditorPaneUrl2() {
		setTitle("Web editorea");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 993, 457);
		
	// Leihoaren itxiera X sakatzean
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				salir();
			}
		});
		
		// Jpanel
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		helbidea="http://www.basauri.net";
		
		 try {
			 
	      editorea = new JEditorPane();
	      editorea.setPage(helbidea);
	      editorea.setEditable(false);
		 } catch (IOException e) {
		      System.err.println("Errorea kargatzean " + e);
		    }
	     

	      // Scroll pane editorean
	  		scrollPaneEditorea = new JScrollPane(editorea);
	  		// Editorea interfazean sartu
	  		contentPane.add(scrollPaneEditorea, BorderLayout.CENTER);
	  		
	  		lblNewLabel = new JLabel("URL");
	  		scrollPaneEditorea.setColumnHeaderView(lblNewLabel);
	  		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
	  		
	  		textField = new JTextField();
	  		textField.addActionListener(new ActionListener() {
	  			public void actionPerformed(ActionEvent arg0) {
	  				helbidea=textField.getText();
	  				try{
	  					
	  				editorea.setPage(helbidea);
	  				}catch(IOException e) {
	  			      System.err.println("Errorea kargatzean " + e);
	  					
	  				}
	  			}
	  		});
	  		textField.setHorizontalAlignment(SwingConstants.RIGHT);
	  		//scrollPaneEditorea.setColumnHeaderView(textField);
	  		textField.setColumns(10);
	  		contentPane.add(textField, BorderLayout.NORTH);
	    
		
	}
	
	// irten
	private void salir(){
		// aplikaziotik irten
		System.exit(0);
	}

	
		
	}
	

