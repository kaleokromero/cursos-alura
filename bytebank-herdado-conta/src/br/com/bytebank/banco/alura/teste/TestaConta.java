package br.com.bytebank.banco.alura.teste;
 import br.com.bytebank.banco.alura.modelo.*;

  public class TestaConta {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(41, 1500);
		cc.deposita(210.0);
		
		ContaPoupanca cp = new ContaPoupanca(11, 2022);
		cp.deposita(90.0);
		
		cc.transfere(10, cp);
		System.out.println("CC" + cc.getSaldo());
		System.out.println("CP" + cp.getSaldo());
	}

}
