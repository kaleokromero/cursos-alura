package br.com.curso.alura;

public class TestaBuscaAluno {

	public static void main(String[] args) {
		 Cursos javaColecoes = new Cursos("Dominando as coleções do Java",
	                "Paulo Silveira");

	        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
	        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
	        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

	        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
	        Aluno a2 = new Aluno("Weverton", 1221);
	        Aluno a3 = new Aluno("Kaleo", 7777);

	        javaColecoes.matricula(a1);
	        javaColecoes.matricula(a2);
	        javaColecoes.matricula(a3);
	        
	        System.out.println("Quem é o aluno da Matrícula 7777?");
	        Aluno aluno = javaColecoes.BuscaMatricula(7777);
	        System.out.println("[Aluno : " + aluno.getNome() + aluno.getMatricula() + "]");
	        
	}

	}
