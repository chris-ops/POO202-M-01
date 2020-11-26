import java.io.Serializable;

import javax.swing.JPanel;

public abstract class Enigma implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int qtdAtivacoes;
	protected int qtdUsos;
	protected int qtdDecifrados;
	protected int qtdErros;
	protected String descricao;
	protected boolean estado = false;
	protected EnigmaLevel level;
	protected ModuloM01 m;
	
	


	public Enigma(ModuloM01 m) {
		super();
		this.m = m;
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
