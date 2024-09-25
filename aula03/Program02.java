package aula03;

import java.util.List;;

public class Program02 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Gabrielly Freire", "20230034464", "04/10/2003", "Tecnologia da Informação", 
                        List.of("FMC2","LP2", "EDB2", "SO", "WEB1", "WEB2", "Seminários"), 4, "Regular");
    
        System.out.println(aluno.toString());

    }
}
