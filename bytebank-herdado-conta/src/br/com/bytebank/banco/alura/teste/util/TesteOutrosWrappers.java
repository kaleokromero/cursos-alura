package br.com.bytebank.banco.alura.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29);
		System.out.println(idadeRef.intValue());
		
		Double dRef = Double.valueOf(4.5);
		System.out.println(dRef.doubleValue());
		
		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());
		
		//Number Refnumero = Float.valueOf(24.8f);
		
		List<Number> lista = new ArrayList<Number>();
		lista.add(10);
		lista.add(11.7);
		lista.add(23.8f);
		
	}

}
