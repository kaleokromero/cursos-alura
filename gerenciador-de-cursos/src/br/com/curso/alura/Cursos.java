package br.com.curso.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Cursos {
	private String nome;
	private String professor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> MatriculaAluno = new HashMap<>();
    
    
    public Cursos (String nome, String professor) {
    	this.nome = nome;
    	this.professor = professor;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}
	
    public void adiciona (Aula aula) {
    	this.aulas.add(aula);
    }
    
    public int getTempoTotal() {
    	return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }
    
    @Override
    public String toString() {
    	return "[Curso: " + this.getNome() + ", tempo total: " + this.getTempoTotal()
        + ", aulas: + " + this.aulas + "]";
    }
    public void matricula(Aluno aluno) {
    	this.alunos.add(aluno);
    	MatriculaAluno.put(aluno.getMatricula(), aluno);
	}
    
    public Set<Aluno> getAlunos(){
    	return Collections.unmodifiableSet(alunos);
    }
    
    public boolean estaMatriculado(Aluno aluno){
    	return this.alunos.contains(aluno); 
    }
    
    public Aluno BuscaMatricula(int numero) {
    	if(!MatriculaAluno.containsKey(numero))
    		throw new NoSuchElementException("Nao achamos essa matricula");
    	return MatriculaAluno.get(numero);
    }
}
