import java.util.HashMap;

public class LogicaProposicional extends Enigma {
	
	public LogicaProposicional(int qtdAtivacoes, int qtdUsos, int qtdDecifrados, int qtdErros, String descricao,
			HashMap<Boolean, Alternativa> alternativas) {
		super(qtdAtivacoes, qtdUsos, qtdDecifrados, qtdErros, descricao, alternativas);
		// TODO Auto-generated constructor stub
	}

	private String descricao;
	private HashMap<Boolean,Alternativa> alternativas = new HashMap<>();
	
	public void addAlternativa(Alternativa a) {
		alternativas.put(a.isEstado(), a);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
