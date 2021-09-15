package br.com.curso.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestaAluno {

	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();
		alunos.add("Paulo");
		alunos.add("Alberto");
		alunos.add("Pedro");
		alunos.add("Nico");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
			}
		System.out.println(alunos.size());
		
		alunos.add("Paulo");
		boolean adicionou = alunos.add("Paulo");
		System.out.println("Paulo foi adicionado?" + adicionou);
	}
}
