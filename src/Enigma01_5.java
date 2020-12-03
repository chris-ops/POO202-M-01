import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

import javax.swing.JButton;

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

public class Enigma01_5 extends EnigmaM01{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected static EnigmaLevel level;
	
	private JPanel panel;

	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */


	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	

	/**
	 * Initialize the contents of the frame.
	 */
	public Enigma01_5(ModuloM01 m) {
		super(m);

		panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(0, 0, 350, 250);
		panel.setLayout(null);
		
		
		JButton btnAlternativa1 = new JButton();
		btnAlternativa1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.bomb.addError();
				setQtdErros(getQtdErros()+1);
	              System.out.println(m);
	              m.serialize();
	              
				Clip clip;
					File file = new File("C:\\Users\\yagakimi\\eclipse-workspace\\poofinal\\images\\hitsound.wav");
					if (file.exists()) {
						try {
							AudioInputStream sound = AudioSystem.getAudioInputStream(file);
							 clip = AudioSystem.getClip();
				              clip.open(sound);
				              clip.start();

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
					panel.setBackground(Color.GREEN);
	              setQtdDecifrados(getQtdDecifrados()+1);
	              setEstado(true);
	              m.serialize();
				Clip clip;
					File file = new File("C:\\Users\\yagakimi\\eclipse-workspace\\poofinal\\images\\certo.wav");
					setEstado(true);
					if (file.exists()) {
						try {
							AudioInputStream sound = AudioSystem.getAudioInputStream(file);
							 clip = AudioSystem.getClip();
				              clip.open(sound);
				              clip.start();
				              

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
					 catch (NullPointerException e1) {
						 System.out.println("asd");
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
				m.bomb.addError();
				setQtdErros(getQtdErros()+1);
	              
	              m.serialize();
				Clip clip;
				File file = new File("C:\\Users\\yagakimi\\eclipse-workspace\\poofinal\\images\\hitsound.wav");
				if (file.exists()) {
					try {
						AudioInputStream sound = AudioSystem.getAudioInputStream(file);
						 clip = AudioSystem.getClip();
			              clip.open(sound);
			              clip.start();

			        
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
				m.bomb.addError();
				setQtdErros(getQtdErros()+1);
	              
	              m.serialize();
				Clip clip;
				File file = new File("C:\\Users\\yagakimi\\eclipse-workspace\\poofinal\\images\\hitsound.wav");
				if (file.exists()) {
					try {
						AudioInputStream sound = AudioSystem.getAudioInputStream(file);
						 clip = AudioSystem.getClip();
			              clip.open(sound);
			              clip.start();

			         
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
		textPane.setText("Considerando o esquema:\n"
				+ " G(x,y) = x gosta de y"
				+ "V(x) = x é um vampiro"
				+ "Q(x) = x queima no sol"
				+ "m = Márcio"
				+ "c = Cláudia");
		appendToPane(textPane, "a) (G(c,m))^(V(m) -> V(c))\n", Color.MAGENTA);
		appendToPane(textPane, "b) (G(m,c))^(V(m) -> Q(m))\n", Color.GREEN);
		appendToPane(textPane, "c) (G(m,c))^(V(c) -> Q(c))\n", Color.YELLOW);
		appendToPane(textPane, "d) G(m,c)^V(m)", Color.CYAN);
		panel_1.setLayout(null);

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