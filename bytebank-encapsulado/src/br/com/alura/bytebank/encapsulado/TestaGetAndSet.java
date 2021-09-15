package br.com.alura.bytebank.encapsulado;

public class TestaGetAndSet {
	public static void main(String[] args) {
		Conta conta = new Conta(1336, 8822);
		System.out.println(conta.getnumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Oliveira");
		
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");  
		
	}
}
