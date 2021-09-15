package br.com.bytebank.banco.alura.teste;
 import br.com.bytebank.banco.alura.modelo.*;

  public class TestaImposto {

	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente(55, 9876);
		cc1.deposita(100);
		
		PlanoDentario sofia = new PlanoDentario();
		
		CalculaImposto calc = new CalculaImposto();
		calc.registra(cc1);
		calc.registra(sofia);
	
		System.out.println(calc.getTotalImposto());
	}

}
