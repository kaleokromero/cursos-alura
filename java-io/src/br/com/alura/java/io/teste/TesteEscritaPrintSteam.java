package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintSteam {

	public static void main(String[] args) throws IOException {
		//OutputStream fos = new FileOutputStream("AluraText2.txt");
		//Writer osw = new OutputStreamWriter(fos);
		//BufferedWriter bw = new BufferedWriter(osw);
		
		PrintWriter pw = new PrintWriter("AluraText2");
		
		pw.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod?");
		pw.println();
		pw.println("esta é uma nova linha");
		
		pw.close();
	}

}
