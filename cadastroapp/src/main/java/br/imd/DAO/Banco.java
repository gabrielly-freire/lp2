package br.imd.DAO;

import java.util.ArrayList;

import br.imd.model.Aluno;

public class Banco {

    private ArrayList<Aluno> alunos;
  

    private static Banco banco;


    private Banco(){
        alunos = new ArrayList<>();
    }

    public static Banco getInstance(){
        if(banco == null){
            banco = new Banco();
        }
        return banco;

    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }


    
}
