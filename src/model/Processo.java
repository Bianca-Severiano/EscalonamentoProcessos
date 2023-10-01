package model;

public class Processo {

	public String nome;
	public int QtdeRetorno;

	public Processo(String nome, int QteRetorno) {
		this.nome = nome;
		this.QtdeRetorno = QteRetorno;
	}

	public Processo() {
		super();
	}

	@Override
	public String toString() {
		return   nome + ";" + QtdeRetorno;
	}

}
