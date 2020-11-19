import javax.swing.JPanel;

public class LogicaProposicional extends Enigma {
	
	public LogicaProposicional(int qtdAtivacoes, int qtdUsos, int qtdDecifrados, int qtdErros, String descricao, EnigmaLevel level) {
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

	@Override
	public JPanel getPanel() {
		// TODO Auto-generated method stub
		return null;
	}

}
