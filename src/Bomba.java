import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;

import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.JScrollPane;

import javax.swing.JTextPane;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;

public class Bomba implements BombInterface{
	
	JFrame frame;
	private Modulo module;
	private JTable table;

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
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 322, 268);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.PINK);
		tabbedPane.setBounds(10, 11, 286, 207);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		JButton btnAlternativa1 = new JButton();
		btnAlternativa1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}});
		

		btnAlternativa1.setBackground(Color.MAGENTA);
		btnAlternativa1.setBounds(25, 97, 89, 23);
		btnAlternativa1.setOpaque(true);
		panel.add(btnAlternativa1);
		
		JButton btnAlternativa2 = new JButton();
		btnAlternativa2.setBackground(Color.GREEN);
		btnAlternativa2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAlternativa2.setBounds(161, 97, 89, 23);
		btnAlternativa1.setOpaque(true);
		panel.add(btnAlternativa2);
		
		JButton btnAlternativa3 = new JButton();
		btnAlternativa3.setBackground(Color.YELLOW);
		btnAlternativa3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAlternativa3.setBounds(25, 145, 89, 23);
		panel.add(btnAlternativa3);
		btnAlternativa1.setOpaque(true);
		
		JButton btnAlternativa4 = new JButton();
		btnAlternativa4.setBackground(Color.CYAN);
		btnAlternativa4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAlternativa4.setBounds(161, 145, 89, 23);
		panel.add(btnAlternativa4);
		btnAlternativa1.setOpaque(true);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 261, 75);
		panel.add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		textPane.setForeground(Color.LIGHT_GRAY);
		textPane.setBackground(Color.DARK_GRAY);
		scrollPane.setViewportView(textPane);
	
		JPanel panel_1 = new JPanel();
		textPane.setText("Faço aula de inglês ou jogo.\nEstudo programação ou faço aula de inglês.\nEstudo programação ou não durmo.\nOra, durmo. Logo:\n");
		appendToPane(textPane, "a)Estudo programação e jogo.\n", Color.MAGENTA);
		appendToPane(textPane, "b)Estudo progrmação e faço aula de inglês.\n", Color.GREEN);
		appendToPane(textPane, "c)Faço aula de inglês e durmo.\n", Color.YELLOW);
		appendToPane(textPane, "d)Não estudo programação e não durmo.", Color.CYAN);
		panel_1.setLayout(null);
		
		JButton btnSubmeter2nd = new JButton("Colocar na tabela");
		btnSubmeter2nd.setBounds(21, 64, 117, 23);
		panel_1.add(btnSubmeter2nd);
		
		JButton btnSubmeter1st = new JButton("Colocar na tabela");
		btnSubmeter1st.setBounds(154, 64, 117, 23);
		panel_1.add(btnSubmeter1st);
		
		JLabel lblFirstCarac = new JLabel("Primeira Caracter\u00EDstica:");
		lblFirstCarac.setBounds(21, 11, 111, 14);
		panel_1.add(lblFirstCarac);
		
		JLabel lblSecondCarac = new JLabel("Segunda Caracter\u00EDstica:");
		lblSecondCarac.setBounds(156, 11, 115, 14);
		panel_1.add(lblSecondCarac);
		
		table = new JTable();
		table.setBounds(258, 40, 0, 0);
		panel_1.add(table);
		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.setBounds(187, 121, 73, 23);
		panel_1.add(btnReiniciar);
		
		JButton btnSubmeterTabela = new JButton("Submeter");
		btnSubmeterTabela.setBounds(21, 121, 79, 23);
		panel_1.add(btnSubmeterTabela);
	}

	@Override
	public void addError() {
		// TODO Auto-generated method stub
		
	}
    private void appendToPane(JTextPane tp, String msg, Color c)
    {
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, c);

        aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Lucida Console");
        aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);

        int len = tp.getDocument().getLength();
        tp.setCaretPosition(len);
        tp.setCharacterAttributes(aset, false);
        tp.replaceSelection(msg);
    }
}
