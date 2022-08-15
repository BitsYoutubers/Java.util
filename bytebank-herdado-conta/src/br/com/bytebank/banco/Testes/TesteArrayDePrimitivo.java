package br.com.bytebank.banco.Testes;

public class TesteArrayDePrimitivo {

	//Array [];
	public static void main(String[] args) {
		
		int[] idades = new int[3]; //inicializa a array com 0
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
//		idades[0] = 29;
//		idades[1] = 39;
//		idades[2] = 49;
		
//		int idade1 = idades[0];
//		int idade2 = idades[1];
//		int idade3 = idades[2];
		
//		System.out.println(idade1);
//		System.out.println(idade2);
//		System.out.println(idade3);
		
//		System.out.println(idades.length);

	}

}
