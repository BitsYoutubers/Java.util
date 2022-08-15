package br.com.bytebank.banco.Testes;
//public dentro e fora do pacote;
//private vísivel dentro da classe;
//protected 

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSaca {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(450.0);
		
		try {
			conta.saca(460.0);
		} catch(Exception ex) {
			System.out.println("Ex: " + ex.getMessage());
		}

		
		System.out.println(conta.getSaldo());
		
	}

}
