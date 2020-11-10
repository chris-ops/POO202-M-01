import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Bomba {

	private JFrame frame;
	private Informacao info;
	private JTextField tfDescricao;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bomba window = new Bomba();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bomba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tfDescricao = new JTextField();
		tfDescricao.setBounds(31, 38, 353, 46);
		frame.getContentPane().add(tfDescricao);
		tfDescricao.setColumns(10);
		
		JLabel lblDescricao = new JLabel("Descricao");
		lblDescricao.setBounds(46, 11, 46, 14);
		frame.getContentPane().add(lblDescricao);
		
		JRadioButton radioAlt1 = new JRadioButton("\uD83E\uDC58");
		radioAlt1.setBounds(31, 102, 109, 23);
		frame.getContentPane().add(radioAlt1);
		
		JRadioButton radioAlt2 = new JRadioButton("New radio button");
		radioAlt2.setBounds(31, 140, 109, 23);
		frame.getContentPane().add(radioAlt2);
		
		JRadioButton radioAlt3 = new JRadioButton("New radio button");
		radioAlt3.setBounds(31, 179, 109, 23);
		frame.getContentPane().add(radioAlt3);
		
		JRadioButton radioAlt4 = new JRadioButton("New radio button");
		radioAlt4.setBounds(31, 220, 109, 23);
		frame.getContentPane().add(radioAlt4);
	}
}
