package br.com.bytebank.banco.alura.teste;

public class TestaString {

	public static void main(String[] args) {
		
		String vazio = "	Alura	";
		String outroVazio = vazio.trim();
		
		System.out.println(outroVazio);
		System.out.println(vazio.contains("Alu"));
		
		String nome = "Alura";
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(i);
		} 	
	}

}
