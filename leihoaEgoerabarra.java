package ebaluaketa3;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import java.awt.ScrollPane;

public class leihoaEgoerabarra extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					leihoaEgoerabarra frame = new leihoaEgoerabarra();
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
	public leihoaEgoerabarra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JLabel egoera1 = new JLabel("Egoera1");
		panel.add(egoera1);
		
		JLabel egoera2 = new JLabel("Egoera2");
		panel.add(egoera2);
		
		panel.add(egoera1, BorderLayout.CENTER);
		panel.add(egoera2, BorderLayout.CENTER);
		
		JEditorPane editorPane = new JEditorPane();
		//JScrollPane scrollPaneEditorea = new JScrollPane(editorPane);
		contentPane.add(editorPane, BorderLayout.CENTER);
		
		//JPanel egoeraBarraPanela= new JPanel();

		//egoeraBarraPanela.setLayout(new BorderLayout());
		//creo los mensajes para la barra de estado Egoera barrarako mezuak egin
		//JLabel egoera1 = new JLabel("Egoera: ");
		//JLabel egoera2 = new JLabel();
		
	}

}
