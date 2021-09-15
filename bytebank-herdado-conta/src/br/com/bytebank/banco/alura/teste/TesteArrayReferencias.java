package br.com.bytebank.banco.alura.teste;

import br.com.bytebank.banco.alura.modelo.Conta;
import br.com.bytebank.banco.alura.modelo.ContaCorrente;
import br.com.bytebank.banco.alura.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
	//int[] idade = new int[]5;
	Conta[] contas = new Conta[5];
	Conta cc1 = new ContaCorrente(22, 330);
	contas[0] = cc1;
	
	Conta cc2 = new ContaPoupanca(22, 430);
    contas[1] = cc2;
    
    System.out.println(contas[1].getnumero());
    
    Conta ref = (ContaPoupanca) contas[1];
    System.out.println(cc2.getnumero());
    System.out.println(ref.getnumero());
    
    
    
	}
}
