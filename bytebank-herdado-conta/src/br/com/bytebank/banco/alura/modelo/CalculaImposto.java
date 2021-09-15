package br.com.bytebank.banco.alura.modelo;

public class CalculaImposto {
	
	private double totalImposto;
	
	public void registra(Imposto t) {
		double valor = t.getValorImposto();
		  this.totalImposto += valor;
	}
  public double getTotalImposto() {
	return totalImposto;
 }
}
