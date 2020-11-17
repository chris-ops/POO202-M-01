//import java.util.ArrayList;
//
//
//public abstract class Enigma {
//	
//	private int qtdAtivacoes;
//	private int qtdUsos;
//	private int qtdDecifrados;
//	private int qtdErros;
//	private String descricao;
//	protected static EnigmaLevel level;
//	private ArrayList<Alternativa> alternativas = new ArrayList<>();
//
//	
//	
//	public Enigma(int qtdAtivacoes, int qtdUsos, int qtdDecifrados, int qtdErros, String descricao, EnigmaLevel level,
//			ArrayList<Alternativa> alternativas) {
//		super();
//		this.qtdAtivacoes = qtdAtivacoes;
//		this.qtdUsos = qtdUsos;
//		this.qtdDecifrados = qtdDecifrados;
//		this.qtdErros = qtdErros;
//		this.descricao = descricao;
//		
//		this.alternativas = alternativas;
//	}
//	public int getQtdAtivacoes() {
//		return qtdAtivacoes;
//	}
//	public void setQtdAtivacoes(int qtdAtivacoes) {
//		this.qtdAtivacoes = qtdAtivacoes;
//	}
//	public int getQtdUsos() {
//		return qtdUsos;
//	}
//	public void setQtdUsos(int qtdUsos) {
//		this.qtdUsos = qtdUsos;
//	}
//	public int getQtdDecifrados() {
//		return qtdDecifrados;
//	}
//	public void setQtdDecifrados(int qtdDecifrados) {
//		this.qtdDecifrados = qtdDecifrados;
//	}
//	public int getQtdErros() {
//		return qtdErros;
//	}
//	public void setQtdErros(int qtdErros) {
//		this.qtdErros = qtdErros;
//	}
//	public String getDescricao() {
//		return descricao;
//	}
//	public void setDescricao(String descricao) {
//		this.descricao = descricao;
//	}
//	public void addAlternativa(Alternativa a) {
//		alternativas.add(a);
//	}
//	public EnigmaLevel getLevel() {
//		return level;
//	}
//	public void setLevel(EnigmaLevel level) {
//		Enigma.level = level;
//	}
//	
//}
