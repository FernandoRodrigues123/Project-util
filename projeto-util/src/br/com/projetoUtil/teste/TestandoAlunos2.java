package br.com.projetoUtil.teste;

import java.util.Collections;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import br.com.projetoUtil.modulo.Aluno;
import br.com.projetoUtil.modulo.Aula;
import br.com.projetoUtil.modulo.Curso;

public class TestandoAlunos2 {

	public static void main(String[] args) {
		 
		Curso jc = new Curso("Java colecoes", "Luiz" );
		
		jc.adiciona(new Aula("Sets",10));
		jc.adiciona(new Aula("java colletions",21));
		
		Aluno a1 = new Aluno("Fernando", 07);
		jc.matricula(a1);
		jc.matricula(new Aluno("jao", 88));
		jc.matricula(new Aluno("Cleber", 19));
		jc.matricula(new Aluno("Pol", 1));
		
		jc.getAlunos().forEach(aluno ->{
			System.out.println(aluno.getNome());
		});
		Aluno Fernando = new Aluno("Fernando", 07);
		System.out.println("o aluno Fernando esta matriculado ");
		System.out.println(jc.estaMatriculado(a1));
		System.out.println(a1.equals(Fernando));
		System.out.println(a1.hashCode() == Fernando.hashCode());
		
		Set<Aluno> pacoteAluno =  jc.getAlunos();
		
		java.util.Iterator<Aluno> iterator = pacoteAluno.iterator();
		
			while(iterator.hasNext()) {
				System.out.println(iterator.next().getNumeroMatricula());
			}
		}
		
	}





