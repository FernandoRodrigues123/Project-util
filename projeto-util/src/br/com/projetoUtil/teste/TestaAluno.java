package br.com.projetoUtil.teste;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import java.util.*;

public class TestaAluno {

	public static void main(String[] args) {
		
		Collection<String> nomes = new HashSet<>();
		nomes.add("Abo");
		nomes.add("Zom");
		nomes.add("cao");
		nomes.add("Lol");
		
		System.out.println(nomes.size());
		System.out.println(nomes.contains("Abo"));

		nomes.remove("cao");
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
			
		System.out.println(nomes);
		System.out.println(nomes.size());
		
		List<String> i = new ArrayList<>(nomes);
	
	}

}
