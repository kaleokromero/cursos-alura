package br.com.alura.bytebank.herdado;

public class Autenticacao implements Autenticavel{
	
	private Autenticacao autenticador;
	
	@Override
	public void setSenha(int senha) {
	 this.autenticador.setSenha(senha);
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
