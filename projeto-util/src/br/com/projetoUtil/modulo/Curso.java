package br.com.projetoUtil.modulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

    private String nome;
	private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<Aluno>();
    private Map<Integer, Aluno> matricula = new HashMap<>(); 
    
    public Curso(String nome, String instrutor) {
        if(nome == null) {
        	throw new NullPointerException();
        }
    	this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }
    
    public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
       
    }
    
    public void matricula(Aluno aluno) {
    	this.alunos.add(aluno);
    	 this.matricula.put(aluno.getNumeroMatricula(), aluno);
    }
    
    
    
    public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
    	return tempoTotal;
    	
    }
   
    
    @Override
    public String toString() {
    	return "Curso " + nome + ", " + "tempo total " + this.getTempoTotal()
    	+ aulas;
    }

	public boolean estaMatriculado(Aluno aluno) {
		
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
	if(matricula.get(numero) != null) {
		return matricula.get(numero);
	}
	throw new NoSuchElementException("Aluno nao matriculado"); 
	}   
  
}