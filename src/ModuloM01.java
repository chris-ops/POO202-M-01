
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
	private ArrayList<Enigma> enigmas = new ArrayList<>();
	Enigma ea;
	String filename = "ModuloM01";
	FileOutputStream fileOut;
	FileInputStream fileIn;
	
	
	public void CreateModulo() {
		Enigma a = new Enigma1();
		Enigma b = new Enigma2();
		Enigma c = new Enigma3();
		Enigma d = new Enigma4();
		enigmas.add(0, a);
		enigmas.add(1, b);
		enigmas.add(2, c);
		enigmas.add(3, d);
		
	}


	@Override
	public void attach(BombInterface arg0) {
			this.attach(arg0);
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
		System.out.println("asd");
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
		public void deserialize() {
		       try
		        {    
		            // Reading the object from a file 
		            fileIn = new FileInputStream(filename); 
		            ObjectInputStream in = new ObjectInputStream(fileIn); 
		              
		            // Method for deserialization of object 
		            enigmas = (ArrayList<Enigma>) in.readObject(); 
		              
		            in.close(); 
		            fileIn.close(); 
		              
		            System.out.println("Object has been deserialized"); 

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
