package ebaluaketa3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JProgressBarFroga extends JFrame implements ActionListener{
private static final long serialVersionUID = 6100750367690375904L;
private JPanel edukiontzia;
private JLabel lblAurrerapena;
private JProgressBar progressBar;
private JButton btnStart;
private Timer timer;
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				JProgressBarFroga frame = new JProgressBarFroga();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}

	public JProgressBarFroga() {
				setTitle("JProgressBarFroga");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 450, 300);
				edukiontzia = new JPanel();
				edukiontzia.setBorder(new EmptyBorder(5, 5, 5, 5));
				edukiontzia.setLayout(new BorderLayout(0, 0));
				setContentPane(edukiontzia);

				JPanel panelDatos = new JPanel();
				edukiontzia.add(panelDatos, BorderLayout.NORTH);

				lblAurrerapena = new JLabel("Aurrerapena");
				panelDatos.add(lblAurrerapena);

				progressBar = new JProgressBar();
				progressBar.setStringPainted(true);
				panelDatos.add(progressBar);

				timer = new Timer (100,this);

				btnStart = new JButton("Start");
				btnStart.addActionListener(this);

				panelDatos.add(btnStart);
	}
@Override
public void actionPerformed(ActionEvent ae) {
	//Ebento bat sortzen denean
	Object o = ae.getSource();
	if (o == btnStart){
		// Start sakatu
		// barra balio minimoan jarri
		progressBar.setValue(progressBar.getMinimum());
		timer.start();
	}
	else {
		// timer-aren ebentoa
		int valor;
		valor = progressBar.getValue();
		valor = valor + 1;
		progressBar.setValue(valor);

		if (valor == progressBar.getMaximum()){
			// balio maximoa lortzen denean
			timer.stop();
			}
	}
	}
}