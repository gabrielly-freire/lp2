import java.util.Scanner;

import model.Professor;
import model.TecnicoADM;
import service.Operacao;
import util.Util;

/**
 * Classe principal para execução do programa.
 * 
 * @author Gabrielly Freire
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operacao operacao = new Operacao();
        int opcao;

        do {
            Util.exibirMenu();
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    Professor funcionario = Util.cadastrarProfessor(sc);
                    operacao.cadastraProfessor(funcionario);
                    break;
                case 2:
                    operacao.buscarProfessor(Util.solicitarMatricula(sc));
                    break;
                case 3:
                    operacao.listarProfessores();
                    break;
                case 4:
                    operacao.excluirProfessor(Util.solicitarMatricula(sc));
                    break;
                case 5:
                    operacao.exibirSalarioProfessor(Util.solicitarMatricula(sc));
                    break;
                case 6:
                    TecnicoADM tecnicoADM = Util.cadastrarTecnicoADM(sc);
                    operacao.cadastraTecnicoADM(tecnicoADM);
                    break;
                case 7:
                    operacao.buscarTecnicoADM(Util.solicitarMatricula(sc));
                    break;
                case 8:
                    operacao.listarTecnicosADM();
                    break;
                case 9:
                    operacao.excluirTecnicoADM(Util.solicitarMatricula(sc));
                    break;
                case 10:
                    operacao.exibirSalarioTecnicoADM(Util.solicitarMatricula(sc));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}