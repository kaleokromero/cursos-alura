package br.com.bytebank.banco.alura.modelo;

import java.io.Serializable;
import java.util.Comparator;

public abstract class Conta extends Object implements Comparable<Conta>, Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 3L;

protected double saldo;
private int agencia;
private int numero;
private Cliente titular;
private static int total;

/**
 *
 * @author kaleokromero
 * @param agencia
 * @param numero
 */

public Conta (int agencia, int numero) {
	total++;
	this.agencia = agencia;
	this.numero = numero;
	
}
public abstract void deposita(double valor);

public void saca(double valor) {
 if(this.saldo < valor) {
	throw new SaldoInsuficienteException("Saldo de " + getSaldo() + " é insuficiente");
	} else {
		this.saldo -= valor;
	}
	
}
    public void transfere (double valor, Conta destino) {
     this.saca(valor);
	  destino.deposita(valor);
    }

	public double getSaldo() {
		return this.saldo;
	}
	public int getnumero() {
		return this.numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	@Override
	public boolean equals(Object ref) {
		
		Conta outra = (Conta) ref;
		
		if (this.agencia != outra.agencia) {
		    return false;
				}
		if (this.numero != outra.numero) {
			return false;
		}
		return true;
	}
	
	
	@Override
		public String toString() {
		return "Agencia: " + this.agencia + (" Número: ") + this.numero;
		}
	
	class NumeroContaComparator implements Comparator<Conta> {
		
	@Override
	 public int compare (Conta c1, Conta c2) {
		return Integer.compare(c1.getnumero(), c2.getnumero());
	}
	
 }
}


