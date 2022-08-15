package br.com.bytebank.banco.Testes.utill;

import java.util.List;
import java.util.ArrayList;

public class TesteInteger {
	public static void main(String[] args) {
		
		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		int idade = 13; //Integer
		
		//Integer idadeRef = new Integer(29);
		
		Integer idadeRef1 = Integer.valueOf(29); //autoboxing
		
		System.out.println(idadeRef1.doubleValue());
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
	    int valor = idadeRef1.intValue(); //unboxing
		
		//Se estiver riscado é para falar que é melhor não usar;
		
		String s = args[0]; //"10"
		
		//Integer numero = Integer.valueOf(s);
		
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); //Autoboxing
		
		
	}

}
