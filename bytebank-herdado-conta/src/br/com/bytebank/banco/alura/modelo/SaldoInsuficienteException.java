package br.com.bytebank.banco.alura.modelo;

public class SaldoInsuficienteException extends RuntimeException {
     
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
