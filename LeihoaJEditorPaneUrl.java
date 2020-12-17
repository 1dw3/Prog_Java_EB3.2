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

public class LeihoaJEditorPaneUrl extends JFrame implements HyperlinkListener{
	
	//osagarriak definitu
	private static final long	serialVersionUID	= -8995452455263689528L;
	private JPanel contentPane;
	
	// editor
	private JEditorPane editorea;
	private JScrollPane scrollPaneEditorea;
	
	// main
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeihoaJEditorPaneUrl frame = new LeihoaJEditorPaneUrl();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	// JFrame
	public LeihoaJEditorPaneUrl() {
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
		String helbidea="http://www.fptxurdinaga.com";
		
		 try {
			 
	      editorea = new JEditorPane(helbidea);
	      editorea.setEditable(false);

	      editorea.addHyperlinkListener(this);

	      // Scroll pane editorean
	  		scrollPaneEditorea = new JScrollPane(editorea);
	  		// Editorea interfazean sartu
	  		contentPane.add(scrollPaneEditorea, BorderLayout.CENTER);
	    } catch (IOException e) {
	      System.err.println("Errorea kargatzean " + e);
	    }
		
	}
	
	// irten
	private void salir(){
		// aplikaziotik irten
		System.exit(0);
	}

	@Override
	public void hyperlinkUpdate(HyperlinkEvent hyperlinkEvent) {
		HyperlinkEvent.EventType type = hyperlinkEvent.getEventType();
    final URL url = hyperlinkEvent.getURL();
    if (type == HyperlinkEvent.EventType.ENTERED) {
      // System.out.println("URL: " + url);
      this.setTitle("URL: " + url);
    } else if (type == HyperlinkEvent.EventType.ACTIVATED) {
      // System.out.println("Activated");
      Document doc = editorea.getDocument();
      try {
      	editorea.setPage(url);
      } catch (IOException ioException) {
        System.out.println("Error al Cargar el Enlace.");
        editorea.setDocument(doc);
      }
    }
		
	}
	
}
