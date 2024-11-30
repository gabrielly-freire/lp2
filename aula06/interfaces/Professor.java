package interfaces;

public class Professor extends Pessoa  implements Funcionario {
    
    private String matricula;
    private double salario;
    private int anoIngresso;

    public Professor() {
    }
    
    public Professor(String nome, String cpf, String dataNascimento, String matricula, double salario,
            int anoIngresso) {
        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
        this.salario = salario;
        this.anoIngresso = anoIngresso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    @Override
    public double calcularSalario() {
        double salario = SALARIO_MINIMO * 5;
        return salario;
    }

    @Override
    public void verificarFolhaPonto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verificarFolhaPonto'");
    }

    @Override
    public boolean isAfastado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isAfastado'");
    }

    
}
