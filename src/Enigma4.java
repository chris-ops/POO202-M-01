import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

import javax.swing.JButton;

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

public class Enigma4 extends Enigma{
	
	private JFrame frame;
	private JPanel[] panels = new JPanel[6];
	private JTable table;


	protected static EnigmaLevel level;

	private JPanel panel;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Enigma4 window = new Enigma4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public Enigma4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.RED);
		frame.setBounds(100, 100, 300, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(0, 0, 284, 211);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnAlternativa1 = new JButton();
		btnAlternativa1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Clip clip;
					File file = new File("C:\\Users\\yagakimi\\eclipse-workspace\\poofinal\\images\\hitsound.wav");
					if (file.exists()) {
						try {
							AudioInputStream sound = AudioSystem.getAudioInputStream(file);
							 clip = AudioSystem.getClip();
				              clip.open(sound);
				              clip.start();
				              setQtdErros(getQtdErros()+1);
				              System.out.println(getQtdErros());
				            //  m.attach(arg0);
						} catch (UnsupportedAudioFileException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (LineUnavailableException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}

			}
		});
		btnAlternativa1.setBounds(25, 97, 89, 23);
		btnAlternativa1.setOpaque(true);
		btnAlternativa1.setBackground(Color.MAGENTA);
		panel.add(btnAlternativa1);
		
		JButton btnAlternativa2 = new JButton();
		btnAlternativa2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Clip clip;
					File file = new File("C:\\Users\\yagakimi\\eclipse-workspace\\poofinal\\images\\certo.wav");
					setEstado(true);
					if (file.exists()) {
						try {
							AudioInputStream sound = AudioSystem.getAudioInputStream(file);
							 clip = AudioSystem.getClip();
				              clip.open(sound);
				              clip.start();
				              panel.setBackground(Color.GREEN);
				              setQtdDecifrados(getQtdDecifrados()+1);
				              System.out.println(getQtdDecifrados());
						} catch (UnsupportedAudioFileException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (LineUnavailableException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}

			}
			
		});
		btnAlternativa2.setBounds(161, 97, 89, 23);
		btnAlternativa2.setBackground(Color.GREEN);
		panel.add(btnAlternativa2);
		
		JButton btnAlternativa3 = new JButton();
		btnAlternativa3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clip clip;
				File file = new File("C:\\Users\\yagakimi\\eclipse-workspace\\poofinal\\images\\hitsound.wav");
				if (file.exists()) {
					try {
						AudioInputStream sound = AudioSystem.getAudioInputStream(file);
						 clip = AudioSystem.getClip();
			              clip.open(sound);
			              clip.start();
			              setQtdErros(getQtdErros()+1);
			              System.out.println(getQtdErros());
			          //  m.attach(arg0);
					} catch (UnsupportedAudioFileException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (LineUnavailableException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

			}
		});
		btnAlternativa3.setBounds(25, 145, 89, 23);
		btnAlternativa3.setBackground(Color.YELLOW);
		panel.add(btnAlternativa3);
		
		JButton btnAlternativa4 = new JButton();
		btnAlternativa4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clip clip;
				File file = new File("C:\\Users\\yagakimi\\eclipse-workspace\\poofinal\\images\\hitsound.wav");
				if (file.exists()) {
					try {
						AudioInputStream sound = AudioSystem.getAudioInputStream(file);
						 clip = AudioSystem.getClip();
			              clip.open(sound);
			              clip.start();
			              setQtdErros(getQtdErros()+1);
			              System.out.println(getQtdErros());
			          //  m.attach(arg0);
					} catch (UnsupportedAudioFileException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (LineUnavailableException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

			}
		});
		btnAlternativa4.setBounds(161, 145, 89, 23);
		btnAlternativa4.setBackground(Color.CYAN);
		panel.add(btnAlternativa4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 261, 75);
		panel.add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		textPane.setForeground(Color.LIGHT_GRAY);
		textPane.setBackground(Color.DARK_GRAY);
		scrollPane.setViewportView(textPane);
	
		JPanel panel_1 = new JPanel();
		textPane.setText("2-Um jovem, ao ser flagrado no aeroporto portando certa quantidade de entorpecentes, argumentou com os policiais conforme o esquema a seguir:\n");
		appendToPane(textPane, "Premissa 1: Eu não sou traficante, eu sou usuário;\n", Color.WHITE);
		appendToPane(textPane, "Premissa 2: Se eu fosse traficante, estaria levando uma grande quantidade de droga e a teria escondido;", Color.WHITE);
		appendToPane(textPane, "Premissa 3: Como sou usuário e não levo uma grande quantidade, não escondi a droga.\n", Color.WHITE);
		appendToPane(textPane, "Conclusão: Se eu estivesse levando uma grande quantidade, não seria usuário.", Color.WHITE);
		appendToPane(textPane, "Considerando a situação hipotética apresentada acima, julgue os itens a seguir.\r\n" + 
				"Se P e Q representam, respectivamente, as proposições “Eu não sou traficante” e “Eu sou usuário”, então a premissa 1 estará corretamente representada por:", Color.WHITE);
		appendToPane(textPane, "a) ~P ^ Q", Color.MAGENTA);
		appendToPane(textPane, "b) P v Q\n", Color.GREEN);
		appendToPane(textPane, "c) P -> ~Q\n", Color.YELLOW);
		appendToPane(textPane, "d) P ^ Q", Color.CYAN);
		
		panel_1.setLayout(null);
		panels[0] = panel_1;
		
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

		public JPanel getPanel() {
			return panel;
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
