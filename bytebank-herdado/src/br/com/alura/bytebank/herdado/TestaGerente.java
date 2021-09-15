package br.com.alura.bytebank.herdado;

public class TestaGerente {

	public static void main(String[] args) {
	Gerente g1 = new Gerente();
	g1.setNome("Marco");
	g1.setCpf("987654321-1");
	g1.setSalario(6000);
	
	System.out.println(g1.getNome());
	System.out.println(g1.getCpf());
	System.out.println(g1.getSalario());
	
	g1.setSenha(3333);
	boolean autenticou = g1.autentica (3333);
	System.out.println(autenticou);
	
	System.out.println( g1.getBonificacao());



	}

}
