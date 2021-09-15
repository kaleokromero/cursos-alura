package br.com.curso.alura;

public class Aluno {
	
	private String Nome;
	private int Matricula;
	
	
	public Aluno (String Nome, int Matricula){
		if(Nome == null) {
			throw new NullPointerException("O nome nao pode ser == null");
		}
		this.Nome = Nome;
		this.Matricula = Matricula;
	}

	public String getNome() {
		return Nome;
	}

	public int getMatricula() {
		return Matricula;
	}
	
	public String toInt() {
		return "[Aluno: " + getNome() + ", " + " Matricula: " + getMatricula() + "]";   
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outroAluno = (Aluno) obj;
		return this.Nome.equals(outroAluno.Nome);
	}
	
	@Override
	public int hashCode() {
		return this.Nome.hashCode();
	}
}
