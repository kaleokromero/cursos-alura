package br.com.curso.alura;

public class Aula implements Comparable<Aula> {
	private String Titulo;
	private int Tempo;
	
	
	public Aula(String titulo, int tempo) {
		this.Titulo = titulo;
		this.Tempo = tempo;
	}
	
	 public String getTitulo() {
	        return Titulo;
	    }

	    public int getTempo() {
	        return Tempo;
	    }
	
	@Override
	public String toString() {
		return ("[Aula: " + this.Titulo + ", " + this.Tempo + " minutos]");
	}
	
	@Override
	public int compareTo(Aula outraAula) {
		return this.Titulo.compareTo(outraAula.Titulo);
	}
	
	

}
