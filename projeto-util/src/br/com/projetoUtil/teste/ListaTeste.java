package br.com.projetoUtil.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ListaTeste {
	public static void main(String[] args) {
		String nome1 = "João";
		String nome2 = "Fernando"; 
		String nome3 = "Marcos";
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add(nome1);
		lista.add(nome2);
		lista.add(nome3);
		
		Collections.sort(lista);
		
		for(int i = 0; i < lista.size(); i++){
			System.out.println(lista.get(i));
		}
	}
}
