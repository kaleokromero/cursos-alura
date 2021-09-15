package br.com.bytebank.banco.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.alura.modelo.Cliente;
import br.com.bytebank.banco.alura.modelo.ContaCorrente;

public class TesteSerializacao {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Cliente cliente = new Cliente();
        cliente.setNome("Kaleo");
        cliente.setProfissao("Dev");
        cliente.setCpf("1233456");

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.setTitular(cliente);
        cc.deposita(550.0);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();
	}
}
