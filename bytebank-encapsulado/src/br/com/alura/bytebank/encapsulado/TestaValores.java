package br.com.alura.bytebank.encapsulado;

public class TestaValores {

		public static void main(String[] args) {
			Conta conta = new Conta(1336, 28899);
			System.out.println(conta.getAgencia());
						
			Conta conta2 = new Conta(1336, 19542);
			System.out.println(conta2.getAgencia());

			Conta conta3 = new Conta(1227, 11951);
			System.out.println(conta3.getAgencia());

			System.out.println("O total de contas é de: " + Conta.getTotal());
		}
		
}
