package br.com.alura.bytebank.herdado;

public class EditorDeVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Pegando a bonificacao do Editor de video");
		return + 100;
	}

}
