
import java.util.ArrayList;


import javax.swing.JPanel;


public class ModuloM01 implements ModuleInterface {

	private ArrayList<Enigmas> enigmas = new ArrayList<>();
	LogicaPredicados lp = new LogicaPredicados(0, 0, 0, 0, null);
	Enigmas ea;
	
	
	public void addModulo(Enigmas e) {
		if(e == null) {
			throw new IllegalArgumentException("testando...");
		}
		this.enigmas.add(e);
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
		return ea.getPanel();
			
			
		
	}


	@Override
	public boolean isDefused() {
		return ea.isEstado();
	}
	
}
