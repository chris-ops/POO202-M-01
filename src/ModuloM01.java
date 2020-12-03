
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JPanel;


public class ModuloM01 implements ModuleInterface, java.io.Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<EnigmaM01> enigmas = new ArrayList<>();
	EnigmaM01 ea;
	String filename = "ModuloM01";
	transient FileOutputStream fileOut;
	transient FileInputStream fileIn;
	transient BombInterface bomb;
	
	
	public ModuloM01() {
		EnigmaM01 a = new Enigma01_1(this);
		EnigmaM01 b = new Enigma01_2(this);
		EnigmaM01 c = new Enigma01_3(this);
		EnigmaM01 d = new Enigma01_4(this);
		EnigmaM01 e = new Enigma01_5(this);
		EnigmaM01 f = new Enigma01_6(this);
		enigmas.add(0, a);
		enigmas.add(1, b);
		enigmas.add(2, c);
		enigmas.add(3, d);
		enigmas.add(4, e);
		enigmas.add(5, f);
	}




	@Override
	public void attach(BombInterface arg0) {
			bomb = arg0;
		}


	@Override
	public EnigmaLevel getEnigmaLevel(byte arg0) {
		return ea.getLevel();
	}


	@Override
	public int getHowManyActivations() {
		int atv = 0;
		for (EnigmaM01 ex : enigmas) {
			atv += ex.getQtdAtivacoes();
		}
		return atv;
		
	}


	@Override
	public int getHowManyExecutions(byte arg0) {
		return ea.getQtdUsos();
	}


	@Override
	public int getHowManyRightAnswers(byte arg0) {
		ea = enigmas.get(arg0-1);
		return ea.getQtdDecifrados();
	}


	@Override
	public int getHowManyWrongAnswers(byte arg0) {
		ea = enigmas.get(arg0-1);
		return ea.getQtdErros();
	}


	@Override
	public JPanel getPanel(byte arg0) {
		ea = enigmas.get(arg0-1);
		JPanel j = ea.getPanel();
		ea.setQtdUsos(ea.getQtdUsos()+1);
		this.deserialize();
		return j;
		
		
	}
	public void serialize() {
		try
        {    
            //Saving of object in a file 
            fileOut = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(fileOut); 
              
            // Method for serialization of object 
            
            out.writeObject(enigmas); 
              
            out.close(); 
            fileOut.close(); 
              
            System.out.println("Object has been serialized"); 
  
        } 
          
        catch(IOException ex) 
        { 
            System.out.println(ex.getMessage());
            
        } 
        catch(NullPointerException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
	}
		@SuppressWarnings("unchecked")
		public void deserialize() {
		       try
		        {    
		            // Reading the object from a file 
		            fileIn = new FileInputStream(filename); 
		            ObjectInputStream in = new ObjectInputStream(fileIn); 
		              
		            // Method for deserialization of object 
		            enigmas = (ArrayList<EnigmaM01>) in.readObject(); 
		              
		            in.close(); 
		            fileIn.close(); 
		              
		             

		        } 
		          
		        catch(IOException ex) 
		        { 
		            System.out.println(ex.getMessage()); 
		        } 
		          
		        catch(ClassNotFoundException ex) 
		        { 
		            System.out.println("ClassNotFoundException is caught"); 
		        } 
		  
		    } 
		
	
	@Override
	public boolean isDefused() {
		return ea.isEstado();
	}

}
