package br.com.bytebank.banco.alura.teste.util;

import java.util.LinkedList;

import br.com.bytebank.banco.alura.modelo.Conta;
import br.com.bytebank.banco.alura.modelo.ContaCorrente;

public class TesteArrayList {
	public static void main(String[] args) {
		
	LinkedList<Conta> lista = new LinkedList<Conta>();
	
	Conta cc = new ContaCorrente(22, 444);
	lista.add(cc);
	
	Conta cc2 = new ContaCorrente(22, 555);
	lista.add(cc2);
	
	System.out.println("tamanho: " + lista.size());
	Conta ref = lista.get(0);
	System.out.println(ref.getnumero());
	
	lista.remove(0);
	
	System.out.println("tamanho: " + lista.size());
	
	Conta cc3 = new ContaCorrente(202, 3333);
	lista.add(cc3);
	
	ContaCorrente cc5 = new ContaCorrente(22, 5525);
	lista.add(cc5);
	
	for(Conta Conta : lista) {
		System.out.println(Conta);
	}
  }
}
