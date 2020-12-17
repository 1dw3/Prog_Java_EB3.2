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


//import say.swing.JFontChooser;

public class LeihoaJEditorPane extends JFrame implements ActionListener, KeyListener {
	
	// Osagaiak definitu
	private static final long serialVersionUID = -5876470080134839940L;
	private JPanel contentPane;
	
	// MenuBar
	private JMenuBar menuBar;
	// Fitxategia
	private JMenu mnuFitxategia;
	private JMenuItem mniBerria;
	private JMenuItem mniIreki;
	private JMenuItem mniGorde;
	private JMenuItem mniGordeHonela;
	private JMenuItem mniIrten;
	// Editatu
	private JMenu mnuEditatu;
	private JMenuItem mniEbaki;
	private JMenuItem mniKopiatu;
	private JMenuItem mniItsatsi;
	// Formatua
	private JMenu mnuFormatua;
	private JMenuItem mniIturburua;
	private JMenuItem mniTestuKolorea;
	// Laguntza
	private JMenu mnuLaguntza;
	private JMenuItem mniHoniBuruz;
	
	// ToolBar
	private JToolBar toolBar;
	private JButton btnBerria;
	private JButton btnIreki;
	private JButton btnGorde;
	private JButton btnGordeHonela;
	private JButton btnEbaki;
	private JButton btnKopiatu;
	private JButton btnItsatsi;
	private JButton btnIturburua;
	private JButton btnTestuKolorea;
	private JButton btnHoniBuruz;
	
	// EgoeraBarra
	private JPanel egoeraBarraPanel;
	private JLabel egoera1;
	private JLabel egoera2;
	
	// Editorea
	private JEditorPane editor;
	private JScrollPane scrollPaneEditor;
	
	// aldatua
	private boolean aldatua = false;
	
	// Dokumentuaren izena
	private File DokumentuIzena;
	
	// JFileChooser
	private JFileChooser fileChooser;
	
	// main
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeihoaJEditorPane frame = new LeihoaJEditorPane();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	// JFrame
	public LeihoaJEditorPane() {
		UIManager.put("OptionPane.okButtonText", "Onartu");
		setTitle("Editorea menuarekin");
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
		
		// menuBar
		menuBar = new JMenuBar();
		
		// Fitxategia
		mnuFitxategia = new JMenu("Fitxategia");
		mniBerria = new JMenuItem("Berria");
		mniBerria.addActionListener(this);
		mniIreki = new JMenuItem("Ireki");
		mniIreki.addActionListener(this);
		mniGorde = new JMenuItem("Gorde");
		mniGorde.addActionListener(this);
		mniGordeHonela = new JMenuItem("Gorde honela");
		mniGordeHonela.addActionListener(this);
		mniIrten = new JMenuItem("Irten");
		mniIrten.addActionListener(this);
		
		// Itemak menuan sartu
		mnuFitxategia.add(mniBerria);
		mnuFitxategia.add(mniIreki);
		mnuFitxategia.add(mniGorde);
		mnuFitxategia.add(mniGordeHonela);
		mnuFitxategia.addSeparator();
		mnuFitxategia.add(mniIrten);
		//menua barran sartu
		menuBar.add(mnuFitxategia);
		
		// Editatu
		mnuEditatu = new JMenu("Editatu");
		mniEbaki = new JMenuItem("Ebaki");
		mniEbaki.addActionListener(this);
		
		mniKopiatu = new JMenuItem("Kopiatu");
		mniKopiatu.addActionListener(this);
		mniItsatsi = new JMenuItem("Itsatsi");
		mniItsatsi.addActionListener(this);
		//Itemak menuan sartu
		mnuEditatu.add(mniEbaki);
		mnuEditatu.add(mniKopiatu);
		mnuEditatu.add(mniItsatsi);
		//menua barran jarri
		menuBar.add(mnuEditatu);
		
		// Formatua
		mnuFormatua = new JMenu("Formatua");
		mniIturburua = new JMenuItem("Iturburua");
		mniIturburua.addActionListener(this);
		mniIturburua.setAccelerator(KeyStroke.getKeyStroke
				('N', Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask()));
		mniTestuKolorea = new JMenuItem("Testu kolorea");
		mniTestuKolorea.addActionListener(this);
		//Itemak menuan sartu
		mnuFormatua.add(mniIturburua);
		mnuFormatua.add(mniTestuKolorea);
		//menua barran jarri
		menuBar.add(mnuFormatua);
		
		// Laguntza
		mnuLaguntza = new JMenu("Laguntza");
		mniHoniBuruz = new JMenuItem("Honi buruz ...");
		mniHoniBuruz.addActionListener(this);
		//Itemak menuan sartu
		mnuLaguntza.add(mniHoniBuruz);
		//menua barran jarri
		menuBar.add(mnuLaguntza);
		
		// JMenuBar leihoan jarri
		this.setJMenuBar(menuBar);
		
		
		// JToolBar
		toolBar = new JToolBar();
		// Berria
		btnBerria = new JButton();
		btnBerria.setText("Berria");
		btnBerria.setIcon(new ImageIcon(LeihoaJEditorPane.class.getResource("ikonoak/nuevo.gif")));
		btnBerria.setMargin(new Insets(2, 3, 0, 0));
		btnBerria.addActionListener(this);
		toolBar.add(btnBerria);
		// Ireki
		btnIreki = new JButton();
		btnIreki.setText("Ireki");
		btnIreki.setIcon(new ImageIcon(LeihoaJEditorPane.class.getResource("ikonoak/abrir.gif")));
		btnIreki.setMargin(new Insets(0, 0, 0, 0));
		btnIreki.addActionListener(this);
		toolBar.add(btnIreki);
		
		// Gorde
		btnGorde = new JButton();
		btnGorde.setText("Gorde");
		btnGorde.setIcon(new ImageIcon(LeihoaJEditorPane.class.getResource("ikonoak/guardar.gif")));
		btnGorde.setMargin(new Insets(0, 0, 0, 0));
		btnGorde.addActionListener(this);
		
		btnGorde.setMnemonic(KeyEvent.VK_G);
		toolBar.add(btnGorde);
		
		// GordeHonela
		btnGordeHonela = new JButton();
		btnGordeHonela.setText("Gorde honela");
		btnGordeHonela.setIcon(new ImageIcon(LeihoaJEditorPane.class.getResource("ikonoak/guardarcomo.gif")));
		btnGordeHonela.setMargin(new Insets(0, 0, 0, 0));
		btnGordeHonela.addActionListener(this);
		toolBar.add(btnGordeHonela);
		
		//Banatzaile bat jarri
		toolBar.addSeparator();
		
		// kopiatu
		btnKopiatu = new JButton();
		btnKopiatu.setText("Kopiatu");
		btnKopiatu.setIcon(new ImageIcon(LeihoaJEditorPane.class.getResource("ikonoak/copiar.gif")));
		btnKopiatu.setMargin(new Insets(0, 0, 0, 0));
		btnKopiatu.addActionListener(this);
		toolBar.add(btnKopiatu);
		
		// ebaki
		btnEbaki = new JButton();
		btnEbaki.setText("Ebaki");
		btnEbaki.setIcon(new ImageIcon(LeihoaJEditorPane.class.getResource("ikonoak/cortar.gif")));
		btnEbaki.setMargin(new Insets(0, 0, 0, 0));
		btnEbaki.addActionListener(this);
		toolBar.add(btnEbaki);
		
		// itsatsi
		btnItsatsi = new JButton();
		btnItsatsi.setText("Itsatsi");
		btnItsatsi.setIcon(new ImageIcon(LeihoaJEditorPane.class.getResource("ikonoak/pegar.gif")));
		btnItsatsi.setMargin(new Insets(0, 0, 0, 0));
		btnItsatsi.addActionListener(this);
		toolBar.add(btnItsatsi);
		
		// banatzaile bat jarri
		toolBar.addSeparator();
		
		// iturburua
		btnIturburua = new JButton();
		btnIturburua.setText("Iturburua");
		btnIturburua.setIcon(new ImageIcon(LeihoaJEditorPane.class.getResource("ikonoak/fuente.gif")));
		btnIturburua.setMargin(new Insets(0, 0, 0, 0));
		btnIturburua.addActionListener(null);
		toolBar.add(btnIturburua);
		
		// iturburua
		btnTestuKolorea = new JButton();
		btnTestuKolorea.setText("Testu kolorea");
		btnTestuKolorea.setIcon(new ImageIcon(LeihoaJEditorPane.class.getResource("ikonoak/colortexto.gif")));
		btnTestuKolorea.setMargin(new Insets(0, 0, 0, 0));
		btnTestuKolorea.addActionListener(this);
		toolBar.add(btnTestuKolorea);
		
		// banatzaile bat jarri
		toolBar.addSeparator();
		
		// honiburuz
		btnHoniBuruz = new JButton();
		btnHoniBuruz.setText("Honi Buruz...");
		btnHoniBuruz.setIcon(new ImageIcon(LeihoaJEditorPane.class.getResource("ikonoak/acercade.gif")));
		btnHoniBuruz.setMargin(new Insets(0, 0, 0, 0));
		btnHoniBuruz.addActionListener(this);
		toolBar.add(btnHoniBuruz);
		
		// Agrega el toolbar en el norte del contenedor tool barr edukiontziaren iparraldean
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		// Egoera barra- status barr
		egoeraBarraPanel = new JPanel();
		egoeraBarraPanel.setLayout(new BorderLayout());
		
		//Mezuak egoera barrarako
		egoera1 = new JLabel("Berria");
		egoera2 = new JLabel();
		egoeraBarraPanel.add(egoera1, BorderLayout.WEST);
		egoeraBarraPanel.add(egoera2, BorderLayout.CENTER);
		
		//Egoera barra edukiontziaren hegoaldean
		contentPane.add(egoeraBarraPanel, BorderLayout.SOUTH);
		
		// editorea
		editor = new JEditorPane();
		editor.setForeground(Color.BLACK);
		editor.setText("");
		
	
		
		// editorearen aldaketak entzun
		editor.addKeyListener(this);
		
		// scroll barra edukiontzian
		scrollPaneEditor = new JScrollPane(editor);
		
		// editorea edukiontziaren erdian
		contentPane.add(scrollPaneEditor, BorderLayout.CENTER);
		
	}

	// actionPerformed
	@Override
	
	public void actionPerformed(ActionEvent e) {
		// non gertatu da gertaera

		if(e.getSource() == btnBerria || e.getSource() == mniBerria){
			//this.editor.setText("Berria");
			ImageIcon face = new ImageIcon(getClass().getResource("ikonoak/abrir.gif"));
			//Añadimos la imagen al boton
			btnBerria.setIcon(face);

			this.DokumentuBerria();
		}
		else if(e.getSource() == btnIreki || e.getSource() == mniIreki){
			//this.editor.setText("Irekia");
			this.DokumentuaIreki();
		}
		else if(e.getSource() == btnGorde || e.getSource() == mniGorde){
			//this.editor.setText("Gorde");
			this.DokumentuaGorde();
		}
		else if(e.getSource() == btnGordeHonela || e.getSource() == mniGordeHonela){
			//this.editor.setText("Gorde honela");
			this.DokumentuaGordeHonela();
		}
		else if(e.getSource() == mniIrten){
			// Aplikaziotik irten
			this.irten();
		}
		else if(e.getSource() == btnEbaki || e.getSource() == mniEbaki){
			//this.editor.setText("Ebaki");
			// arbelean gordetzen dut ebakitakoa
			this.editor.cut();
		}
		else if(e.getSource() == btnKopiatu || e.getSource() == mniKopiatu){
			//this.editor.setText("kopiatu");
			// arbelean gordetzen dut kopiatutakoa
			this.editor.copy();
		}
		else if(e.getSource() == btnItsatsi || e.getSource() == mniItsatsi){
			//this.editor.setText("Itsatsi");
			// arbeleko informazioa kopiatu editorean
			this.editor.paste();
		}
		else if(e.getSource() == btnIturburua || e.getSource() == mniIturburua){
			// this.editor.setText("Iturburua");
			// editorearen iturburua aldatu
			Font IturburuBerria;
			//  JFontChooser agertarazi
			JFontChooser fontChooser = new JFontChooser();		
			int aukera = fontChooser.showDialog(contentPane);
			
			if (aukera == JFontChooser.OK_OPTION){
				//  OK sakatu baldin bada
				// etiketaren iturburua aldatu
				IturburuBerria = fontChooser.getSelectedFont();
				editor.setFont(IturburuBerria);
				// egoera aldatu
				((JLabel)this.egoeraBarraPanel.getComponent(0)).setText("Iturburua aldatuta");
			}
		}
		else if(e.getSource() == btnTestuKolorea || e.getSource() == mniTestuKolorea){
			// this.editor.setText("Testu kolorea");
			// Testuaren kolorea aldatu
			// JColorChooser atera
			UIManager.put("OptionPane.okButtonText", "Onartu");
			Color nuevoColor = JColorChooser.showDialog(contentPane, "Aukeratu kolorea....", contentPane.getBackground());			
			//Font iturburu berria;
			//iturburuberria = this.editor.getFont();
			this.editor.setForeground(nuevoColor);

			// egoera aldatu
			((JLabel)this.egoeraBarraPanel.getComponent(0)).setText("Testuaren kolorea aldatua");
		}
		else if(e.getSource() == btnHoniBuruz || e.getSource() == mniHoniBuruz){
			//this.editor.setText("Honi buruz ...");
			// Aplikazioaren informazioa atera
			JOptionPane.showMessageDialog(editor, "Editorea 1.0 bertsioa");
		}
	
	}
	
	// klasearen metodo pribatuak
	// berria
	private void DokumentuBerria(){
		if (aldatua){
			// datuak aldatu baldin badira
			DokumentuaGorde();
		}
		// datuak eguneratu

		this.setTitle("berria.txt");
		DokumentuIzena=null;
		editor.setText("");
		((JLabel)this.egoeraBarraPanel.getComponent(0)).setText("Berria");
	}
	
	// DokumentuaGorde
	private void DokumentuaGorde(){
		if (aldatua){
			// datuak aldatu baldin badira
			if (DokumentuIzena == null){
				// dokumentuak izenik ez badauka
				DokumentuaGordeHonela();
			}
	
			// editoreko datuak aldatu
			try	{
        
				PrintWriter writer = new PrintWriter(DokumentuIzena);
				writer.print(editor.getText());
				writer.close();

				// datuak eguneratu
				this.setTitle(this.DokumentuIzena.getName());
				((JLabel)this.egoeraBarraPanel.getComponent(0)).setText("Gordeta");
				aldatua = false;
				
			}
			catch (Exception ioe)	{
				// errorea ematen baldin bada
				((JLabel)this.egoeraBarraPanel.getComponent(0)).setText("Errorea dokumentua gordetzean.");
			}
		}
	}

	// DokumentuaGordeHonela
	private void DokumentuaGordeHonela(){
		// Dokumentuak izenik ez badauka
		if (fileChooser == null){
			//Ez badago filechooser
			fileChooser = new JFileChooser();
			// Filtro bat jarriko diot .txt fitxategiak ateratzeko
			FileNameExtensionFilter filter = new FileNameExtensionFilter(
					"Testu fitxategiak", "txt");
			fileChooser.setFileFilter(filter);
		}
		int opcion = fileChooser.showSaveDialog(contentPane);
		
		if (opcion == JFileChooser.APPROVE_OPTION){
			// Onartu sakatu baldin badu
			DokumentuIzena = fileChooser.getSelectedFile();
			
			// Datuak gorde
			aldatua = true;
			DokumentuaGorde();
		}

	}
	
	// DokumentuaIrekiHonela
	private void DokumentuaIreki(){
		
		if (fileChooser == null){
			//Filechooser ez baldin badago
			fileChooser = new JFileChooser();
			// Filtro bat jarriko diot .txt fitxategiak ateratzeko
			FileNameExtensionFilter filter = new FileNameExtensionFilter(
					"Testu fitxategiak", "txt");
			fileChooser.setFileFilter(filter);
		}
		// Fitxategia zabaltzeko filechooserra
		int opcion = fileChooser.showOpenDialog(contentPane);
		
		if (opcion == JFileChooser.APPROVE_OPTION){
			// Onartu sakatu bada
			DokumentuIzena = fileChooser.getSelectedFile();
			
			// Datuak fitxategitik editorera
			try	{
				String path = fileChooser.getSelectedFile().getAbsolutePath();
        String contenido = leerDocumento(path);
        
        

				// datuak eguneratu
        editor.setText(contenido);
				this.setTitle(this.DokumentuIzena.getName());
				((JLabel)this.egoeraBarraPanel.getComponent(0)).setText("Irekita");
				aldatua = false;
			}
			catch (Exception ioe)	{
				// errorea
				((JLabel)this.egoeraBarraPanel.getComponent(0)).setText("Errorea dokumentua irekitzean.");
			}
			

		}

	}
	// irten
	private void irten(){
		if (aldatua){
			// datuak aldatu badira
			gordetzekogaldetu();
		}
		// irten aplikaziotik
		System.exit(0);
	}
	// Gordetzeko galdetu
	private void gordetzekogaldetu() 
	{
		// Aukera leihoetako osagarriak
		// Aukerak
		Object[] aukerak={"Bai","Ez"};
		//Dialogo modala bai, ez
		int aukera;
		aukera=JOptionPane.showOptionDialog(this,"Datuak aldatuta.Gorde nahi dituzu?","Galdetu gordetzeko",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,aukerak,aukerak[0]);
		
		if(aukera == JOptionPane.YES_OPTION){
			//Bai aukeratu badu
			this.DokumentuaGorde();
		}
	}
	
	

	// Teklak sakatzea editorean
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// cuando se escribe una tecla en el editor
		if (aldatua == false){
			// solo la primera vez
			aldatua = true;
			((JLabel) egoeraBarraPanel.getComponent(0)).setText("Aldatuta");
			egoera1.setText("aldatuta");
			
		}
		
	}
	
	// leerDocumento
	public String leerDocumento( String ruta ){
    FileReader fr = null;
    BufferedReader br = null;
    //Cadena de texto donde se guardara el contenido del archivo
    String contenido = "";
    try
    {
        //ruta puede ser de tipo String o tipo File
        fr = new FileReader( ruta );
        br = new BufferedReader( fr );

        String linea;
        //Obtenemos el contenido del archivo linea por linea
        while( ( linea = br.readLine() ) != null ){ 
            contenido += linea + "\n";
        }

    }catch( Exception e ){  }
    //finally se utiliza para que si todo ocurre correctamente o si ocurre 
    //algun error se cierre el archivo que anteriormente abrimos
    finally
    {
        try{
            br.close();
        }catch( Exception ex ){}
    }
    return contenido;
	}

}
