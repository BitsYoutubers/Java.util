package br.com.bytebank.banco.Testes.utill;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappers {
	
	public static void main(String[] args) {
		
		Integer idadeRef1 = Integer.valueOf(29); //autoboxing
		System.out.println(idadeRef1.intValue());
		
	    Double dRef = Double.valueOf(3.2); //autoboxing
	    System.out.println(dRef.doubleValue()); //unboxing
	    
	    Boolean bRef = Boolean.FALSE;
	    System.out.println(bRef.booleanValue());
	    
	    Number refNumero = Double.valueOf(48.7);
	    //poderia ser usado também o float (tendo o f no final):
	    //Number refNumero1 = Float.valueOf(5.5f);
	    System.out.println(refNumero.doubleValue());
	    
	    List<Number> lista = new ArrayList<>();
	    lista.add(35.6);
	    lista.add(37.9);
	
	}
	

}
