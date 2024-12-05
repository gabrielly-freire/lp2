package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Endereco;
import model.Professor;
import model.TecnicoADM;
import model.enums.Formacao;
import model.enums.Genero;
import model.enums.Nivel;

/**
 * Classe utilitária para exibir menus e cadastrar funcionários em outras
 * operações.
 * 
 * @author Gabrielly Freire
 * @version 1.0
 */
public class Util {

    /**
     * Exibe o menu de opções para o usuário.
     * 
     * @return
     */
    public static void exibirMenu() {
        System.out.println("===================MENU===================");
        System.out.println("1. Cadastrar Professor");
        System.out.println("2. Buscar Professor");
        System.out.println("3. Listar Professores");
        System.out.println("4. Deletar Professor");
        System.out.println("5. Exibir salário de um professor");
        System.out.println("6. Cadastrar Tecnico Administrativo");
        System.out.println("7. Buscar Tecnico Administrativo");
        System.out.println("8. Listar Tecnicos Administrativos");
        System.out.println("9. Deletar Tecnico Administrativo");
        System.out.println("10. Exibir salário de um Técnico Administrativo");
        System.out.println("0. Sair");
        System.out.println("=========================================");
        System.out.println("Digite a opção desejada: ");
    }

    /**
     * Cadastra um endereço.
     * 
     * @param sc Scanner para capturar os dados do usuário.
     * @return retorna o endereço cadastrado.
     */
    public static Endereco cadastrarEndereco(Scanner sc) {
        Endereco endereco = new Endereco();

        System.out.println("Digite a rua: ");
        endereco.setRua(sc.nextLine());

        System.out.println("Digite o número: ");
        endereco.setNumero(sc.nextInt());
        sc.nextLine();

        System.out.println("Digite o bairro: ");
        endereco.setBairro(sc.nextLine());

        System.out.println("Digite a cidade: ");
        endereco.setCidade(sc.nextLine());

        System.out.println("Digite o CEP: ");
        endereco.setCep(sc.nextLine());

        return endereco;
    }

    /**
     * Cadastra um professor.
     * 
     * @param sc Scanner para capturar os dados do usuário.
     * @return retorna o professor cadastrado.
     */
    public static Professor cadastrarProfessor(Scanner sc) {
        sc.nextLine();

        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o CPF: ");
        String cpf = sc.nextLine();

        System.out.println("Digite a data de nascimento(dd/MM/yyyy): ");
        String dataNascimento = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimentoFormatada = LocalDate.parse(dataNascimento, formatter);

        System.out.println("Digite o gênero: ");
        String genero = sc.nextLine();
        validarGenero(genero);

        Endereco endereco = cadastrarEndereco(sc);

        System.out.println("Digite a matrícula: ");
        Long matricula = sc.nextLong();

        sc.nextLine();

        System.out.println("Digite o departamento: ");
        String departamento = sc.nextLine();

        System.out.println("Digite a carga horária: ");
        String cargaHoraria = sc.nextLine();

        System.out.println("Digite a data de ingresso(dd/MM/yyyy): ");
        String dataIngresso = sc.nextLine();
        LocalDate dataIngressoFormatada = LocalDate.parse(dataIngresso, formatter);

        System.out.println("Digite o nível: ");
        String nivel = sc.nextLine();
        validarNivel(nivel);

        System.out.println("Digite a formação: ");
        String formacao = sc.nextLine();
        validarFormacao(formacao);

        System.out.println("Digite a quantidade de disciplinas: ");
        int quantidadeDisciplinas = sc.nextInt();
        sc.nextLine();

        List<String> disciplinas = new ArrayList<>();
        for (int i = 0; i < quantidadeDisciplinas; i++) {
            System.out.println("Digite a disciplina: ");
            String disciplina = sc.nextLine();
            disciplinas.add(disciplina);
        }

        Professor funcionario = new Professor(nome, cpf, dataNascimentoFormatada,
                validarGenero(genero), endereco, matricula,
                departamento, cargaHoraria, dataIngressoFormatada, validarNivel(nivel),
                validarFormacao(formacao), disciplinas);

        return funcionario;
    }

    /**
     * Cadastra um técnico administrativo.
     * 
     * @param sc Scanner para capturar os dados do usuário.
     * @return retorna o técnico administrativo cadastrado.
     */
    public static TecnicoADM cadastrarTecnicoADM(Scanner sc) {
        sc.nextLine();

        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o CPF: ");
        String cpf = sc.nextLine();

        System.out.println("Digite a data de nascimento(dd/MM/yyyy): ");
        String dataNascimento = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimentoFormatada = LocalDate.parse(dataNascimento, formatter);

        System.out.println("Digite o gênero: ");
        String genero = sc.nextLine();
        validarGenero(genero);

        Endereco endereco = cadastrarEndereco(sc);

        System.out.println("Digite a matrícula: ");
        Long matricula = sc.nextLong();
        sc.nextLine();

        System.out.println("Digite o departamento: ");
        String departamento = sc.nextLine();

        System.out.println("Digite a carga horária: ");
        String cargaHoraria = sc.nextLine();

        System.out.println("Digite a data de ingresso(dd/MM/yyyy): ");
        String dataIngresso = sc.nextLine();
        LocalDate dataIngressoFormatada = LocalDate.parse(dataIngresso, formatter);

        System.out.println("Digite o nível: ");
        String nivel = sc.nextLine();
        validarNivel(nivel);

        System.out.println("Digite a formação: ");
        String formacao = sc.nextLine();
        validarFormacao(formacao);

        System.out.println("Digite se tem insalubridade(sim/não): ");
        String isInsalubridade = sc.nextLine();

        System.out.println("Digite se tem função gratificada(sim/não): ");
        String isFuncaoGratificada = sc.nextLine();

        TecnicoADM funcionario = new TecnicoADM(nome, cpf, dataNascimentoFormatada,
                validarGenero(genero), endereco, matricula,
                departamento, cargaHoraria, dataIngressoFormatada, validarNivel(nivel), validarFormacao(formacao),
                validarBoolean(isInsalubridade), validarBoolean(isFuncaoGratificada));

        return funcionario;
    }

    /**
     * Solicita a matrícula do professor.
     * 
     * @param sc Scanner para capturar os dados do usuário.
     * @return retorna a matrícula do professor.
     */
    public static Long solicitarMatricula(Scanner sc) {
        System.out.println("Digite a matrícula: ");
        Long matricula = sc.nextLong();
        return matricula;
    }

    /**
     * Validação do enum de gênero.
     * 
     * @param genero String de gênero a ser validado.
     * @return retorna o enum de gênero validado.
     */
    private static Genero validarGenero(String genero) {
        if (genero == null || genero.isEmpty()) {
            throw new IllegalArgumentException("Gênero não pode ser vazio.");
        }
        if (!genero.equalsIgnoreCase("MASCULINO") && !genero.equalsIgnoreCase("FEMININO")
                && !genero.equalsIgnoreCase("OUTRO")) {
            throw new IllegalArgumentException("Gênero inválido. Os gêneros são: Masculino, Feminino e Outro.");

        }

        return Genero.valueOf(genero.toUpperCase());
    }

    /**
     * Validação do enum de nível.
     * 
     * @param nivel String de nível a ser validado.
     * @return retorna o enum de nível validado.
     */
    private static Nivel validarNivel(String nivel) {
        if (nivel == null || nivel.isEmpty()) {
            throw new IllegalArgumentException("Nível não pode ser vazio.");
        }
        if (!nivel.equalsIgnoreCase("I") && !nivel.equalsIgnoreCase("II") && !nivel.equalsIgnoreCase("III")
                && !nivel.equalsIgnoreCase("IV") && !nivel.equalsIgnoreCase("V") && !nivel.equalsIgnoreCase("VI")
                && !nivel.equalsIgnoreCase("VII") && !nivel.equalsIgnoreCase("VIII")) {
            throw new IllegalArgumentException("Nível inválido. Os níveis são: I, II, III, IV, V, VI, VII e VIII.");
        }

        return Nivel.valueOf(nivel.toUpperCase());
    }

    /**
     * Validação do enum de formação.
     * 
     * @param formacao String de formação a ser validado.
     * @return retorna o enum de formação validado.
     */
    private static Formacao validarFormacao(String formacao) {
        if (formacao == null || formacao.isEmpty()) {
            throw new IllegalArgumentException("Formação não pode ser vazia.");
        }
        if (!formacao.equalsIgnoreCase("ESPECIALIZACAO") && !formacao.equalsIgnoreCase("MESTRADO")
                && !formacao.equalsIgnoreCase("DOUTORADO")) {
            throw new IllegalArgumentException(
                    "Formação inválida. As formações são: Especialização, Mestrado e Doutorado.");
        }

        return Formacao.valueOf(formacao.toUpperCase());
    }

    private static Boolean validarBoolean(String booleano) {
        if (booleano == null || booleano.isEmpty()) {
            throw new IllegalArgumentException("Booleano não pode ser vazio.");
        }
        if (!booleano.equalsIgnoreCase("SIM") && !booleano.equalsIgnoreCase("NÃO")) {
            throw new IllegalArgumentException("Booleano inválido.");
        }
        return booleano == "SIM" ? true : false;
    }
}
