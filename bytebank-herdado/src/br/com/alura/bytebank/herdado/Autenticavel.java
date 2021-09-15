package br.com.alura.bytebank.herdado;

public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha);
			
	public abstract boolean autentica(int senha);

}
