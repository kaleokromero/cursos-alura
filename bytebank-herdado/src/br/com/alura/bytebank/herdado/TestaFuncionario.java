package br.com.alura.bytebank.herdado;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario nico = new Gerente();
		nico.setNome("Nico Nellic");
		nico.setCpf("123456789-2");
		nico.setSalario(1250.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}
}
