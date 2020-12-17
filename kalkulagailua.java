package eb3;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class kalkulagailua extends JFrame {

	private static final long serialVersionUID = -7470373813631650601L;
	private JPanel edukiontzia;
	private JPanel panelTestua;
	private JPanel panelZifrak;
	private JTextField textField;
	private JButton btn0;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnBerdin;
	private JButton btnPuntua;
	private JPanel panelEragiketak;
	private JButton btnBatu;
	private JButton btnKendu;
	private JButton btnBiderkatu;
	private JButton btnZatitu;
	
	
	//aldagaiak
	double eragilea1=0;
	double eragilea2=0;
	String eragiketa="";
	double emaitza=0;
	String znbString="";
	boolean zeeragilea=false;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kalkulagailua frame = new kalkulagailua();
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
	public kalkulagailua() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 763);
		edukiontzia = new JPanel();
		edukiontzia.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(edukiontzia);
		edukiontzia.setLayout(new BorderLayout(0, 0));
		
		panelTestua = new JPanel();
		edukiontzia.add(panelTestua, BorderLayout.NORTH);
		panelTestua.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setForeground(new Color(0, 0, 128));
		textField.setText("0");
		textField.setFont(new Font("Arial", Font.BOLD, 40));
		panelTestua.add(textField);
		textField.setColumns(10);
		
		panelZifrak = new JPanel();
		edukiontzia.add(panelZifrak, BorderLayout.CENTER);
		panelZifrak.setLayout(new GridLayout(4, 3, 0, 0));
		
		btn7 = new JButton("7");
		btn7.setForeground(new Color(0, 0, 128));
		btn7.setFont(new Font("Arial", Font.BOLD, 40));
		btn7.addActionListener(new actionlistenerZenbakiak());
		panelZifrak.add(btn7);
		
		btn8 = new JButton("8");
		btn8.setForeground(new Color(0, 0, 128));
		btn8.setFont(new Font("Arial", Font.BOLD, 40));
		btn8.addActionListener(new actionlistenerZenbakiak());
		panelZifrak.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setForeground(new Color(0, 0, 128));
		btn9.setFont(new Font("Arial", Font.BOLD, 40));
		btn9.addActionListener(new actionlistenerZenbakiak());
		panelZifrak.add(btn9);
		
		btn4 = new JButton("4");
		btn4.setForeground(new Color(0, 0, 128));
		btn4.setFont(new Font("Arial", Font.BOLD, 40));
		btn4.addActionListener(new actionlistenerZenbakiak());
		panelZifrak.add(btn4);
		
		btn5 = new JButton("5");
		btn5.setForeground(new Color(0, 0, 128));
		btn5.setFont(new Font("Arial", Font.BOLD, 40));
		btn5.addActionListener(new actionlistenerZenbakiak());
		panelZifrak.add(btn5);
		
		btn6 = new JButton("6");
		btn6.setForeground(new Color(0, 0, 128));
		btn6.setFont(new Font("Arial", Font.BOLD, 40));
		btn6.addActionListener(new actionlistenerZenbakiak());
		panelZifrak.add(btn6);
		
		btn1 = new JButton("1");
		btn1.setForeground(new Color(0, 0, 128));
		btn1.setFont(new Font("Arial", Font.BOLD, 40));
		btn1.addActionListener(new actionlistenerZenbakiak());
		panelZifrak.add(btn1);
		
		btn2 = new JButton("2");
		btn2.setForeground(new Color(0, 0, 128));
		btn2.setFont(new Font("Arial", Font.BOLD, 40));
		btn2.addActionListener(new actionlistenerZenbakiak());
		panelZifrak.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setForeground(new Color(0, 0, 128));
		btn3.setFont(new Font("Arial", Font.BOLD, 40));
		btn3.addActionListener(new actionlistenerZenbakiak());
		panelZifrak.add(btn3);
		
		btn0 = new JButton("0");
		btn0.setForeground(new Color(0, 0, 128));
		btn0.setFont(new Font("Arial", Font.BOLD, 40));
		btn0.addActionListener(new actionlistenerZenbakiak());
		panelZifrak.add(btn0);
		
		btnBerdin = new JButton("=");
		btnBerdin.setForeground(new Color(0, 0, 128));
		btnBerdin.setFont(new Font("Arial", Font.BOLD, 40));
		btnBerdin.addActionListener(new actionlistenerBerdin());
		panelZifrak.add(btnBerdin);
		
		btnPuntua = new JButton(".");
		btnPuntua.setForeground(new Color(0, 0, 128));
		btnPuntua.setFont(new Font("Arial", Font.BOLD, 40));
		panelZifrak.add(btnPuntua);
		
		panelEragiketak = new JPanel();
		edukiontzia.add(panelEragiketak, BorderLayout.EAST);
		panelEragiketak.setLayout(new GridLayout(4, 1, 0, 0));
		
		btnBatu = new JButton("+");
		btnBatu.setForeground(new Color(0, 0, 128));
		btnBatu.setFont(new Font("Arial", Font.BOLD, 40));
		btnBatu.addActionListener(new actionlistenerEragiketak());
		panelEragiketak.add(btnBatu);
		
		btnKendu = new JButton("-");
		btnKendu.setForeground(new Color(0, 0, 128));
		btnKendu.setFont(new Font("Arial", Font.BOLD, 40));
		btnKendu.addActionListener(new actionlistenerEragiketak());
		panelEragiketak.add(btnKendu);
		
		btnBiderkatu = new JButton("*");
		btnBiderkatu.setForeground(new Color(0, 0, 128));
		btnBiderkatu.setFont(new Font("Arial", Font.BOLD, 40));
		btnBiderkatu.addActionListener(new actionlistenerEragiketak());
		panelEragiketak.add(btnBiderkatu);
		
		btnZatitu = new JButton("/");
		btnZatitu.setForeground(new Color(0, 0, 128));
		btnZatitu.setFont(new Font("Arial", Font.BOLD, 40));
		btnZatitu.addActionListener(new actionlistenerEragiketak());
		panelEragiketak.add(btnZatitu);
		
		
		
	
	
	
	}
	public void hasiera(){
		eragilea1=0;
		eragilea2=0;
		eragiketa="";
		emaitza=0;
		zeeragilea=false;
	}

	private class actionlistenerZenbakiak implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		if (textField.getText().equals("0"))
				textField.setText("");
		if (e.getSource()==btn0)
			textField.setText(textField.getText()+'0');
		if (e.getSource()==btn1)
			textField.setText(textField.getText()+'1');
		if (e.getSource()==btn2)
			textField.setText(textField.getText()+'2');
		if (e.getSource()==btn3)
			textField.setText(textField.getText()+'3');
		if (e.getSource()==btn4)
			textField.setText(textField.getText()+'4');
		if (e.getSource()==btn5)
			textField.setText(textField.getText()+'5');
		if (e.getSource()==btn6)
			textField.setText(textField.getText()+'6');
		if (e.getSource()==btn7)
			textField.setText(textField.getText()+'7');
		if (e.getSource()==btn8)
			textField.setText(textField.getText()+'8');
		if (e.getSource()==btn9)
			textField.setText(textField.getText()+'9');
		
			}
		
		
		}
	private class actionlistenerEragiketak implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		eragilea1=Double.valueOf(textField.getText());
		if (eragilea1!=0){
			eragilea1=Double.valueOf(textField.getText());
			if (e.getSource()==btnBatu)
				eragiketa="ba";
				
			if (e.getSource()==btnKendu)
				eragiketa="ke";
				
			if (e.getSource()==btnBiderkatu)
				eragiketa="bi";
				
			if (e.getSource()==btnZatitu)
				eragiketa="za";
			}
		textField.setText("0");
		}
	}
	private class actionlistenerBerdin implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				
			//System.out.println("eragilea1: "+eragilea1+ " eragilea2 "+ 
			//textField.getText()+ "eragiketa "+eragiketa);
			eragilea2=Double.valueOf(textField.getText());
			//System.out.println("eragilea1: "+eragilea1+ " eragilea2 "+ 
			//		textField.getText()+ "eragiketa "+eragiketa);
			if (!eragiketa.equals("")){
				
				//if (e.getSource()==btnBatu)
				if (eragiketa.equals("ba"))
					emaitza=eragilea1+eragilea2;
				System.out.println("Batu: "+emaitza);
					
				if (eragiketa.equals("ke"))
					emaitza=eragilea1-eragilea2;
					
				if (eragiketa.equals("bi"))
					emaitza=eragilea1*eragilea2;
					
				if (eragiketa.equals("za"))
					emaitza=eragilea1/eragilea2;
			}
			
			textField.setText(Double.toString(emaitza));
			
			System.out.println("eragilea1: "+eragilea1+ " eragilea2 "+ 
					eragilea2+ "eragiketa "+eragiketa+ " emaitza "+ emaitza);
			
			JOptionPane.showMessageDialog
			(null,(String)"Hau da emaitza: " +emaitza,"Emaitza",
					JOptionPane.INFORMATION_MESSAGE,null);
			}
			
			
				
	}
}



