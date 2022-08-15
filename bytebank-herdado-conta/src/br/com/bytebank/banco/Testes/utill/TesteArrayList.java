package br.com.bytebank.banco.Testes.utill;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		//Com Generics <>, o código fica mais seguro, e apenas usa uma Array, string só em string;       
		//Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 33);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 44);
		lista.add(cc2);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref = lista.get(0);
		
		System.out.println(ref.getNumero());
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(22, 55);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(22, 66);
		lista.add(cc4);

		for(Object conta : lista) {
			System.out.println(conta);
		}

		
	}

}
