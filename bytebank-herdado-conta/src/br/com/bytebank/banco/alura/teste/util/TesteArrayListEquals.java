package br.com.bytebank.banco.alura.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.alura.modelo.Conta;
import br.com.bytebank.banco.alura.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
	
	ArrayList<Conta> lista = new ArrayList<Conta>();
	
	Conta cc = new ContaCorrente(22, 444);
	lista.add(cc);
	
	Conta cc2 = new ContaCorrente(22, 555);
	lista.add(cc2);
	
	Conta cc3 = new ContaCorrente(22, 555);	
	boolean existe = lista.contains(cc3);
	
	System.out.println("Já existe? " + existe);
	
	for(Conta Conta : lista) {
		System.out.println(Conta);
	}
  }
}