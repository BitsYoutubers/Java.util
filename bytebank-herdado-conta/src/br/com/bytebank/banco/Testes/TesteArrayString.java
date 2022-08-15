package br.com.bytebank.banco.Testes;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayString {
	
	public static void main(String[] args) {
		
		Object[] referencias = new Object[4];
		ContaCorrente cc1 = new ContaCorrente(22, 23);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 24);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
//		Object referenciaGenerica = contas[1];
		
//		System.out.println(cc2.getNumero());
//		System.out.println(referenciaGenerica.getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1]; //type cast
		
		System.out.println(ref.getNumero());
		
		
	}

}
