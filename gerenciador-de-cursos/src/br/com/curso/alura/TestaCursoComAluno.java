package br.com.curso.alura;

public class TestaCursoComAluno {

	public static void main(String[] args) {

        Cursos javaColecoes = new Cursos("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);
        Aluno a4 = new Aluno("Kaleo Kuka", 12345);
        
        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        javaColecoes.matricula(a4);
        
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno.toInt());
         });
        
        Aluno Kaleo = new Aluno("Kaleo Kuka", 12345);
        System.out.println(javaColecoes.estaMatriculado(Kaleo));
 }
}
