package br.com.projetoUtil.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.projetoUtil.modulo.Aula;
import br.com.projetoUtil.modulo.Curso;

public class TesteCurso {

	public static void main(String[] args) {
		Curso jc = new Curso("Java", "Lucas");
		
		jc.adiciona(new Aula("treino", 10));
		jc.adiciona(new Aula("manca", 13));
		jc.adiciona(new Aula("olho", 11));
		
		List<Aula> list = jc.getAulas();
		
		
		System.out.println(list);
		
		List<Aula> listMutavel = new ArrayList<>(list);
		
		Collections.sort(listMutavel);
		System.out.println(listMutavel);
		System.out.println(jc.getTempoTotal());
		System.out.println();
		System.out.println(jc);
	}
}
