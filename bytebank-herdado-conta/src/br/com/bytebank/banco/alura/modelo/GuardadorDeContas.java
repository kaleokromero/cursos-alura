package br.com.bytebank.banco.alura.modelo;

public class GuardadorDeContas {
	
	private Conta[] referencias;
	private int PosicaoLivre;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.PosicaoLivre = 0;
	}
	
	public void adiciona (Conta ref) {
	 this.referencias [this.PosicaoLivre] = ref;	
	 PosicaoLivre++;	
	}

	public int getQuantidadeDeElementos() {
		return this.PosicaoLivre;
	}

	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}
	
	
}
