package br.com.curso.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
		Aula a1 = new Aula ("Revisando Array List", 21);
		Aula a2 = new Aula("Lista de objeto", 19);
		Aula a3 = new Aula("Relacionamento lista e objeto", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aula :: getTempo));
		
		System.out.println(aulas);

	}

}
