

public class LogicaProposicional extends Enigmas {
	
	public LogicaProposicional(int qtdAtivacoes, int qtdUsos, int qtdDecifrados, int qtdErros, String descricao) {
		super(qtdAtivacoes, qtdUsos, qtdDecifrados, qtdErros, descricao, level);
		// TODO Auto-generated constructor stub
	}

	private String descricao;
	


	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
