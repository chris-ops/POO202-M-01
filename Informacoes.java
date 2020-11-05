import java.util.ArrayList;


public class Informacoes {
	
	private ArrayList<Enigma> enigmas = new ArrayList<>();
	LogicaPredicados lp = new LogicaPredicados(0, 0, 0, 0, null, null);
	
	
	public void addModulo(Enigma e) {
		if(e == null) {
			throw new IllegalArgumentException("testando...");
		}
		this.enigmas.add(e);
	}
	
}
