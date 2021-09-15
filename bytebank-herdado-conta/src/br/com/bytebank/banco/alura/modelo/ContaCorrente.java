package br.com.bytebank.banco.alura.modelo;

public class ContaCorrente extends Conta implements Imposto {
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public ContaCorrente(int agencia, int numero){
			super(agencia, numero);
		}
		
		@Override
		public void saca(double valor) {
		 double ValorASacar = valor + 0.2;
		  super.saca(ValorASacar);
		}
		
		@Override
		public void deposita(double valor) {
			super.saldo += valor;

		}
		@Override
		public double getValorImposto() {
			return super.saldo * 0.10;
		}
		@Override
		public String toString() {
		 return "ContaCorrente " + super.toString();
		}

		@Override
		public int compareTo(Conta o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
}