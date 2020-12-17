package ebaluaketa3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;

public class leihoaJProgressBar extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 6100750367690375904L;
	private JPanel contentPane;
	private JLabel lblProgreso;
	private JButton btnStart;
	private Timer timer;
	JProgressBar progressBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					leihoaJProgressBar frame = new leihoaJProgressBar();
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
	public leihoaJProgressBar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JPanel panelDatos = new JPanel();
		contentPane.add(panelDatos, BorderLayout.NORTH);
		
		
		lblProgreso = new JLabel("Progreso");
		panelDatos.add(lblProgreso);
		
		progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		contentPane.add(progressBar, BorderLayout.NORTH);
		
		timer = new Timer (100, this);
		
		btnStart = new JButton("Start");
		btnStart.addActionListener(this);
		contentPane.add(btnStart);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// cuando se produce un evento de accion
		Object o = ae.getSource();
		if (o == btnStart){
			// Si se pulsa start
			// inicializo el valor de la barra de progreso a su valor minimo
			progressBar.setValue(progressBar.getMinimum());
			timer.start();
		}
		else {
			// si el evento lo genera el timer
			int valor;
			valor = progressBar.getValue();
			valor = valor + 1;
			progressBar.setValue(valor);
			
			if (valor == progressBar.getMaximum()){
				// si la barra de progreso alcanza su valor maximo
				// paro el timer
				timer.stop();
			}
		}
	}
	

}
