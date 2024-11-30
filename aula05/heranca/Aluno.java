package heranca;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;
    private String anoIngresso;

    public Aluno() {
    }

    public Aluno(String nome, String cpf, String dataNascimento, String matricula, String curso, String anoIngresso) {
        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(String anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    

    
}
