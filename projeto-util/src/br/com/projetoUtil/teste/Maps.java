package br.com.projetoUtil.teste;

import br.com.projetoUtil.modulo.Aluno;
import br.com.projetoUtil.modulo.Curso;

import java.util.HashMap;
public class Maps{

	public static void main(String[] args) {
	

		Curso jc = new Curso("java", "Luca");
		
		Aluno a1 = new Aluno("Mathus", 9);
		Aluno a2 = new Aluno("Olavio", 911);
		Aluno a3 = new Aluno("Susan", 43);
		Aluno a4 = new Aluno("Yasuo", 1);
		
		jc.matricula(a1);
		jc.matricula(a2);
		jc.matricula(a3);
		jc.matricula(a4);
		System.out.println(jc.estaMatriculado(a4));
		
		Aluno aluno = jc.buscaMatriculado(9);
		System.out.println(aluno);
		
		
		}
	
}