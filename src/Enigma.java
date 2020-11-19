import javax.swing.JPanel;

public abstract class Enigma {
	
	protected int qtdAtivacoes;
	protected int qtdUsos;
	protected int qtdDecifrados;
	protected int qtdErros;
	protected String descricao;
	protected boolean estado = false;
	protected EnigmaLevel level;
	

	
	
	public Enigma(int qtdAtivacoes, int qtdUsos, int qtdDecifrados, int qtdErros, String descricao, EnigmaLevel level) {
		super();
		this.qtdAtivacoes = qtdAtivacoes;
		this.qtdUsos = qtdUsos;
		this.qtdDecifrados = qtdDecifrados;
		this.qtdErros = qtdErros;
		this.descricao = descricao;
	
	}
	public Enigma() {
		// TODO Auto-generated constructor stub
	}
	public int getQtdAtivacoes() {
		return qtdAtivacoes;
	}
	public void setQtdAtivacoes(int qtdAtivacoes) {
		this.qtdAtivacoes = qtdAtivacoes;
	}
	public int getQtdUsos() {
		return qtdUsos;
	}
	public void setQtdUsos(int qtdUsos) {
		this.qtdUsos = qtdUsos;
	}
	public int getQtdDecifrados() {
		return qtdDecifrados;
	}
	public void setQtdDecifrados(int qtdDecifrados) {
		this.qtdDecifrados = qtdDecifrados;
	}
	public int getQtdErros() {
		return qtdErros;
	}
	public void setQtdErros(int qtdErros) {
		this.qtdErros = qtdErros;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public EnigmaLevel getLevel() {
		return level;
	}
	public void setLevel(EnigmaLevel level) {
		this.level = level;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public abstract JPanel getPanel();
}
