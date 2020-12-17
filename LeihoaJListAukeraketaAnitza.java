package eb3;

import java.awt.EventQueue;

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
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

import javax.swing.JList;

public class LeihoaJListAukeraketaAnitza extends JFrame implements ActionListener{

	//osagarriak definitu
	private static final long	serialVersionUID = 1183812776304203166L;
	private JPanel contentPane;
	private JLabel lblTestua;
	private JButton btnIrten;
	// Taldeen zerrendak definitu
	private JList<String> lstTaldeak;
	private DefaultListModel<String> dlm;
	private JList<String> lstTaldeakCopia;
	private DefaultListModel<String> dlmKopia;
	private JButton btnKopiatuEskuma;
	private JPanel panel;
	private JButton btnKopiatuEzkerra;
	// main
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeihoaJListAukeraketaAnitza frame = new LeihoaJListAukeraketaAnitza();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// JFrame
	public LeihoaJListAukeraketaAnitza() {
		
		setTitle("Leihoa JList");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		lblTestua = new JLabel("Aukeratu elementuak ...");
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
		
		// Aukera Zerrenda
		dlm = new DefaultListModel<String>();
		dlm.addElement("1AS3");
		dlm.addElement("2AS3");
		dlm.addElement("1DW3");
		dlm.addElement("2DW3");
		sortModel(dlm);
		
		lstTaldeak = new JList<String>();
		lstTaldeak.setModel(dlm);
		lstTaldeak.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		contentPane.add(lstTaldeak, BorderLayout.WEST);
		// Kopia Zerrenda
		lstTaldeakCopia = new JList<String>();
		dlmKopia = new DefaultListModel<String>();
		lstTaldeakCopia.setModel(dlmKopia);
		contentPane.add(lstTaldeakCopia, BorderLayout.EAST);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		// btnKopiatuEzkerra
		btnKopiatuEzkerra = new JButton("<<");
		btnKopiatuEzkerra.addActionListener(this);
		panel.add(btnKopiatuEzkerra);
		// btnKopiatuEskuma
		btnKopiatuEskuma = new JButton(">>");
		btnKopiatuEskuma.addActionListener(this);
		panel.add(btnKopiatuEskuma);
	}

	// Zerrendaren aukeraketa kontrolatu
	@Override
	public void actionPerformed(ActionEvent ae) {
		// botoia sakatzean
		Object source = ae.getSource();
		
		if (source == this.btnKopiatuEskuma){
			// ezkerretik eskuinera
			int[]indices = this.lstTaldeak.getSelectedIndices();
			int numeroOpciones = indices.length;
			String opcion = null;
			for(int posicion=0;posicion<numeroOpciones;posicion++){
				opcion = dlm.getElementAt(indices[posicion]);
				this.dlmKopia.addElement(opcion);
			}
		}
		else if (source == this.btnKopiatuEzkerra){
			// eskuinetik ezkerrera
			int[]indices = this.lstTaldeakCopia.getSelectedIndices();
			int numeroOpciones = indices.length;
			String opcion = null;
			for(int posicion=0;posicion<numeroOpciones;posicion++){
				opcion = dlmKopia.getElementAt(indices[posicion]);
				this.dlm.addElement(opcion);
			}
		}
		
		sortModel(dlmKopia);
	}
	private void sortModel(DefaultListModel model) {
	    ArrayList <String>list = new ArrayList<>();
	    for (int i = 0; i < model.size(); i++) {
	        list.add((String)model.get(i));
	       
	    }
	    Collections.sort(list);
	    model.removeAllElements();
	    for (int i=0; i< list.size();i++) {
	        model.addElement(list.get(i));
	       
	    }
	}

}
