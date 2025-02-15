package br.imd.utils;

import java.time.LocalDate;

import br.imd.DAO.Banco;
import br.imd.model.Aluno;
import br.imd.model.Genero;

public class Op {

   static Banco bd = Banco.getInstance();

    public static void salvar( String nome,
    String matricula,
    LocalDate dataNascimento,
    String curso,
    boolean alunoEAD,
    boolean pcd,
    Genero genero){
        bd.getAlunos().add(new Aluno(nome, 
        matricula, 
        dataNascimento, 
        curso, alunoEAD, 
        pcd, 
        genero));
    }
    
}
