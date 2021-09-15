package br.com.alura.bytebank.herdado;

public class Administrador extends Funcionario implements Autenticavel{

	private int senha;
	private Autenticacao autenticador;
	
	public Administrador() {
	 this.setAutenticador(new Autenticacao());
		
	}
	
	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;}
	}
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	@Override
	public double getBonificacao() {
		System.out.println("Pegando a bonificacao do gerente");
		return + 250;
	}

	public Autenticacao getAutenticador() {
		return autenticador;
	}

	public void setAutenticador(Autenticacao autenticador) {
		this.autenticador = autenticador;
	}
	

}
