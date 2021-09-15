package br.com.bytebank.banco.alura.teste;

import br.com.bytebank.banco.alura.modelo.Conta;
import br.com.bytebank.banco.alura.modelo.ContaCorrente;
import br.com.bytebank.banco.alura.modelo.GuardadorDeContas;

public class Teste {
	public static void main(String[] args) {
		
	GuardadorDeContas guardador = new GuardadorDeContas();
	
	ContaCorrente cc = new ContaCorrente(22, 444);
	guardador.adiciona(cc);
	
	ContaCorrente cc2 = new ContaCorrente(22, 555);
	guardador.adiciona(cc2);
	
    int tamanho = guardador.getQuantidadeDeElementos();
    System.out.println(tamanho);
    
    Conta ref = (Conta) guardador.getReferencia(1);
    System.out.println(ref.getnumero());
  }
}