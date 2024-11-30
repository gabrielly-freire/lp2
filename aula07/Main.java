package aula07;

import aula07.utils.BibliotecaFunctions;

public class Main {

    public static void main(String[] args) {
      
        //Cadastro de livros
        BibliotecaFunctions.cadastrarMaterial("Algebra Linear", "Gustavo Antunes", 2017, "4ª ed");
        BibliotecaFunctions.cadastrarMaterial("Quimica Fundamental", "Pedro Paulo de Arantes", 2001, "1ª ed");
        BibliotecaFunctions.cadastrarMaterial("Linguagem Java - Easy version", "Gustavo Guanabara", 2020, "2ª ed");
        BibliotecaFunctions.cadastrarMaterial("Estrutura basica de dados", "Willian Frederico", 1998, "2ª ed");
        BibliotecaFunctions.cadastrarMaterial("Fundamentos da educação contemporanea", "Paulo Freire", 1975, "8ª ed");
        

        //Cadastro de revistas
        BibliotecaFunctions.cadastrarMaterial("Epoca", "Globo", 45);
        BibliotecaFunctions.cadastrarMaterial("Galineu", "Abreu", 39);
        BibliotecaFunctions.cadastrarMaterial("Mundo Curioso", "Abril", 20);
        BibliotecaFunctions.cadastrarMaterial("SuperInteressante", "Abril", 41);
        BibliotecaFunctions.cadastrarMaterial("Cientifica", "UFCR", 41);

        //Lista todas aos Materiais (livros e revistas)
        BibliotecaFunctions.exibirListaMateriais();

        //Pesquisar material - (Achar)
        BibliotecaFunctions.pesquisarMaterial("Linguagem Java - Easy version");
        
        //Pesquisar material - (Não achar)
        BibliotecaFunctions.pesquisarMaterial("Nada para pesquisar");

        //Remove um material
        BibliotecaFunctions.removerMaterial("Linguagem Java - Easy version");

         //Pesquisar material - (Não achar por ter sido deletado)
         BibliotecaFunctions.removerMaterial("Linguagem Java - Easy version");
    }
}
