package br.com.bytebank.banco.alura.teste;
 import br.com.bytebank.banco.alura.modelo.*;

  public class TestaSaldo {
   
   public static void main(String[] args) {
		
	 ContaCorrente c = new ContaCorrente(55, 1234);
      c.deposita(100);
       c.saca(120);
        System.out.println(c.getSaldo());
 }
}