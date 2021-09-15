package br.com.bytebank.banco.alura.modelo;

public class ContaPoupanca extends Conta {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ContaPoupanca(int agencia, int numero) {
	super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
    @Override
    public String toString() {
	return "ContaPoupanca " + super.toString();
    }

	@Override
	public int compareTo(Conta o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
