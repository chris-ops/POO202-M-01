
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JPanel;


public class ModuloM01 implements ModuleInterface, java.io.Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Enigma> Enigma = new ArrayList<>();
	Enigma ea;
	
	
	public void addModulo(Enigma e) {
		if(e == null) {
			throw new IllegalArgumentException("testando...");
		}
		this.Enigma.add(e);
	}


	@Override
	public void attach(BombInterface arg0) {
		arg0.addError();
	
		}


	@Override
	public EnigmaLevel getEnigmaLevel(byte arg0) {
		return ea.getLevel();
	}


	@Override
	public int getHowManyActivations() {
		return ea.getQtdAtivacoes();
		
	}


	@Override
	public int getHowManyExecutions(byte arg0) {
		return ea.getQtdUsos();
	}


	@Override
	public int getHowManyRightAnswers(byte arg0) {
		return ea.getQtdDecifrados();
	}


	@Override
	public int getHowManyWrongAnswers(byte arg0) {
		return ea.getQtdErros();
	}


	@Override
	public JPanel getPanel(byte arg0) {
		ea = Enigma.get(arg0-1);
		JPanel j = ea.getPanel();
		System.out.println("asd");
		return j;

		
	}
	public void serialize() {
		String filename = "ModuloM01"; 
		try
        {    
            //Saving of object in a file 
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            // Method for serialization of object 
            out.writeObject(this); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized"); 
  
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 

	}

	@Override
	public boolean isDefused() {
		return ea.isEstado();
	}

}
