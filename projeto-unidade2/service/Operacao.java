package service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import database.BancoDAO;
import model.Funcionario;
import model.Professor;
import model.TecnicoADM;

/**
 * Classe que representa as operações que podem ser realizadas com os
 * funcionários
 * 
 * @author Gabrielly Freire
 * @version 1.0
 */
public class Operacao {

    private static final String ARQUIVO_FUNCIONARIOS = "funcionarios.txt";
    private BancoDAO bancoDAO = BancoDAO.getIntance();
    private List<Funcionario> funcionarios = bancoDAO.getArrayFuncionarios();

    public Operacao() {
        funcionarios = carregarFuncionariosSalvas();
    }

    /**
     * Cadastra um professor
     * 
     * @param professor - Professor a ser cadastrado
     * @return Professor - Professor cadastrado
     */
    public Professor cadastraProfessor(Professor professor) {
        validarMatricula(professor.getMatricula());
        professor.calcularSalario();
        funcionarios.add(professor);

        salvarFuncionariosNoArquivo();
        System.out.println("Professor cadastrado com sucesso!");
        return professor;
    }

    /**
     * Cadastra um técnico administrativo
     * 
     * @param tecnicoADM - Técnico administrativo a ser cadastrado
     * @return TecnicoADM - Técnico administrativo cadastrado
     */
    public TecnicoADM cadastraTecnicoADM(TecnicoADM tecnicoADM) {
        validarMatricula(tecnicoADM.getMatricula());
        tecnicoADM.calcularSalario();
        funcionarios.add(tecnicoADM);

        salvarFuncionariosNoArquivo();
        System.out.println("Técnico administrativo cadastrado com sucesso!");
        return tecnicoADM;
    }

    /**
     * Lista todos os funcionários
     * 
     * @return List<Funcionario> - Lista de funcionários
     */
    public List<Funcionario> listarProfessores() {
        if (funcionarios.size() == 0) {
            System.out.println("Nenhum professor cadastrado.");
            return null;
        }

        for (Funcionario pessoa : funcionarios) {
            if (pessoa instanceof Professor) {
                System.out.println(pessoa);
            }
        }
        return funcionarios;
    }

    /**
     * Lista todos os técnicos administrativos
     * 
     * @return List<Funcionario> - Lista de técnicos administrativos
     */
    public List<Funcionario> listarTecnicosADM() {
        if (funcionarios.size() == 0) {
            System.out.println("Nenhum técnico administrativo cadastrado.");
            return null;
        }

        for (Funcionario pessoa : funcionarios) {
            if (pessoa instanceof TecnicoADM) {
                System.out.println(pessoa);
            }
        }
        return funcionarios;
    }

    /**
     * Exclui um professor pelo número de matrícula
     * 
     * @param matricula - Matrícula do professor a ser excluído
     * @return void
     */
    public void excluirProfessor(Long matricula) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Professor) {
                if (((Professor) funcionario).getMatricula().equals(matricula)) {
                    funcionarios.remove(funcionario);
                    salvarFuncionariosNoArquivo();
                    System.out.println("Professor excluído com sucesso!");
                    return;
                }
            }
        }
        System.out.println("Professor não encontrado.");
    }

    /**
     * Exclui um técnico administrativo pelo número de matrícula
     * 
     * @param matricula - Matrícula do técnico administrativo a ser excluído
     * @return void
     */
    public void excluirTecnicoADM(Long matricula) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof TecnicoADM) {
                if (((TecnicoADM) funcionario).getMatricula().equals(matricula)) {
                    funcionarios.remove(funcionario);
                    salvarFuncionariosNoArquivo();
                    System.out.println("Técnico administrativo excluído com sucesso!");
                    return;
                }
            }
        }
        System.out.println("Técnico administrativo não encontrado.");
    }

    /**
     * Busca um professor pelo número de matrícula
     * 
     * @param matricula - Matrícula do professor a ser buscado
     * @return Professor - Professor encontrado
     */
    public Funcionario buscarProfessor(Long matricula) {
        return funcionarios.stream()
                .filter(pessoa -> pessoa instanceof Professor)
                .filter(pessoa -> ((Professor) pessoa).getMatricula().equals(matricula))
                .findFirst()
                .map(professor -> {
                    System.out.println(professor);
                    return professor;
                })
                .orElseGet(() -> {
                    System.out.println("Professor não encontrado.");
                    return null;
                });
    }

    /**
     * Busca um técnico administrativo pelo número de matrícula
     * 
     * @param matricula - Matrícula do técnico administrativo a ser buscado
     * @return TecnicoADM - Técnico administrativo encontrado
     */
    public Funcionario buscarTecnicoADM(Long matricula) {
        return funcionarios.stream()
                .filter(pessoa -> pessoa instanceof TecnicoADM)
                .filter(pessoa -> ((TecnicoADM) pessoa).getMatricula().equals(matricula))
                .findFirst()
                .map(tecnicoADM -> {
                    System.out.println(tecnicoADM);
                    return tecnicoADM;
                })
                .orElseGet(() -> {
                    System.out.println("Técnico administrativo não encontrado.");
                    return null;
                });
    }

    /**
     * Exibe o salário de um professor
     * 
     * @param matricula - Matrícula do professor
     * @return Double - Salário do professor
     */
    public Double exibirSalarioProfessor(Long matricula) {
        return funcionarios.stream()
                .filter(pessoa -> pessoa instanceof Professor)
                .filter(pessoa -> ((Professor) pessoa).getMatricula().equals(matricula))
                .findFirst()
                .map(professor -> {
                    System.out.println(professor);
                    return ((Professor) professor).calcularSalario();
                })
                .orElseGet(() -> {
                    System.out.println("Professor não encontrado.");
                    return null;
                });
    }

    /**
     * Exibe o salário de um técnico administrativo
     * 
     * @param matricula - Matrícula do técnico administrativo
     * @return Double - Salário do técnico administrativo
     */
    public Double exibirSalarioTecnicoADM(Long matricula) {
        return funcionarios.stream()
                .filter(pessoa -> pessoa instanceof TecnicoADM)
                .filter(pessoa -> ((TecnicoADM) pessoa).getMatricula().equals(matricula))
                .findFirst()
                .map(tecnicoADM -> {
                    System.out.println(tecnicoADM);
                    return ((TecnicoADM) tecnicoADM).calcularSalario();
                })
                .orElseGet(() -> {
                    System.out.println("Técnico administrativo não encontrado.");
                    return null;
                });
    }

    /**
     * Salva as funcionarios no arquivo
     */
    private void salvarFuncionariosNoArquivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARQUIVO_FUNCIONARIOS))) {
            oos.writeObject(funcionarios);
        } catch (IOException e) {
            System.err.println("Erro ao salvar funcionarios: " + e.getMessage());
        }
    }

    /**
     * Carrega as funcionarios salvos no arquivo
     * 
     * @return List<Funcionario> - Lista de funcionarios carregados
     */
    @SuppressWarnings("unchecked")
    private List<Funcionario> carregarFuncionariosSalvas() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARQUIVO_FUNCIONARIOS))) {
            funcionarios = (List<Funcionario>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Nenhum pessoa encontrado. Um novo arquivo será criado.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao recuperar funcionarios: " + e.getMessage());
        }
        return funcionarios;
    }

    private void validarMatricula(Long matricula) {
        if (funcionarios.stream().anyMatch(
                pessoa -> pessoa instanceof Professor && ((Professor) pessoa).getMatricula().equals(matricula))) {
            throw new IllegalArgumentException("Matrícula já cadastrada.");
        }
    }
}
