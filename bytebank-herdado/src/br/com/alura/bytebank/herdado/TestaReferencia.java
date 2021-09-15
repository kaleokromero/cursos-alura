package br.com.alura.bytebank.herdado;

public class TestaReferencia {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Thiago");
		g1.setSalario(6000);
		
	
		EditorDeVideo ev = new EditorDeVideo();
		ev.setNome("Luiz");
		ev.setSalario(2500);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		
		System.out.println(controle.getSoma());
		
	}

}
