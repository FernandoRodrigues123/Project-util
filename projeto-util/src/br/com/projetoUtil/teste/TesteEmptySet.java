package br.com.projetoUtil.teste;

import java.util.*;

import br.com.projetoUtil.modulo.Aluno;

public class TesteEmptySet {

    public static void main(String[] args) {

//        Set<String> nomes = Collections.emptySet();
//        nomes.add("Paulo"); //o que acontece aqui?
        Aluno a1 = new Aluno("lucas", 12);
        Aluno a2 = new Aluno("vitor", 77);
        
        Set<Aluno> alunos = new HashSet<>();
        alunos.add(a1);
        alunos.add(a2);
        
        Set<Aluno> alunosSincronizados = Collections.synchronizedSet(alunos);
        System.out.println(alunosSincronizados);
    }

}