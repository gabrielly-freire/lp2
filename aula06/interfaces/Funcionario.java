package interfaces;

public interface Funcionario {

    double SALARIO_MINIMO = 1041.0;

    public double calcularSalario();
    public void verificarFolhaPonto();
    public boolean isAfastado();
}