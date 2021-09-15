package br.com.curso.alura;

import java.util.HashMap;
import java.util.Map;

public class Exercio {

	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<>();
		pessoas.put(123, "Sophia Kuka");
		pessoas.put(743, "Kaleo Kuka");
		pessoas.put(876, "Billie EIlish");
		
		pessoas.keySet().forEach(idade -> {
			System.out.println(pessoas.get(idade));
		});
	}

}
