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
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

import javax.swing.JList;

public class LehioaJlistAukeraAnitza extends JFrame implements ActionListener{

	//defino los componentes
	private static final long	serialVersionUID = 1183812776304203166L;
	private JPanel contentPane;
	private JLabel lblTexto;
	private JButton btnSalir;
	// lista de los Grupos
	private JList<String> lstGrupos;
	private DefaultListModel<String> dlm;
	private JList<String> lstGruposCopia;
	private DefaultListModel<String> dlmCopia;
	private JButton btnCopiarDerecha;
	private JPanel panel;
	private JButton btnCopiarIzquierda;
	// main
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LehioaJlistAukeraAnitza frame = new LehioaJlistAukeraAnitza();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// JFrame
	public LehioaJlistAukeraAnitza() {
		
		setTitle("Ventana JfList");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		lblTexto = new JLabel("Selecciona una Opción ...");
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexto.setFont(new Font("Lucida Console", Font.PLAIN, 24));
		contentPane.add(lblTexto, BorderLayout.NORTH);
		
		// boton Salir
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		});
		contentPane.add(btnSalir, BorderLayout.SOUTH);
		
		// lista de Opciones
		dlm = new DefaultListModel<String>();
		dlm.addElement("1AS3");
		dlm.addElement("2AS3");
		dlm.addElement("1DW3");
		dlm.addElement("2DW3");
		lstGrupos = new JList<String>();
		lstGrupos.setModel(dlm);
		lstGrupos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		contentPane.add(lstGrupos, BorderLayout.WEST);
		// lista de Copia
		lstGruposCopia = new JList<String>();
		dlmCopia = new DefaultListModel<String>();
		lstGruposCopia.setModel(dlmCopia);
		contentPane.add(lstGruposCopia, BorderLayout.EAST);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		// btnCopiarIzquierda
		btnCopiarIzquierda = new JButton("<<");
		btnCopiarIzquierda.addActionListener(this);
		panel.add(btnCopiarIzquierda);
		// btnCopiarDerecha
		btnCopiarDerecha = new JButton(">>");
		btnCopiarDerecha.addActionListener(this);
		panel.add(btnCopiarDerecha);
	}

	// controlo cuando cambia la seleccion de la lista
	@Override
	public void actionPerformed(ActionEvent ae) {
		// cuando pulso un boton
		Object source = ae.getSource();
		
		if (source == this.btnCopiarDerecha){
			// si quiero copiar de la lista izquierda a la derecha
			int[]indices = this.lstGrupos.getSelectedIndices();
			int numeroOpciones = indices.length;
			String opcion = null;
			for(int posicion=0;posicion<numeroOpciones;posicion++){
				opcion = dlm.getElementAt(indices[posicion]);
				this.dlmCopia.addElement(opcion);
			}
		}
		else if (source == this.btnCopiarIzquierda){
			// si quiero copiar de la lista derecha a la izquierda
			int[]indices = this.lstGruposCopia.getSelectedIndices();
			int numeroOpciones = indices.length;
			String opcion = null;
			for(int posicion=0;posicion<numeroOpciones;posicion++){
				//opcion = dlmCopia.getElementAt(posicion);
				dlmCopia.remove(indices[posicion]);
				//this.dlm.addElement(opcion);
			}
			
		}
	}

}
