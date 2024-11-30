package heranca;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", "123.456.789-00", "01/01/2000", "1234", "ADS", "2020");
        Professor professor = new Professor("Maria", "987.654.321-00", "01/01/1970", "5678", 5000.0, 1990);

        aluno.falar();
        professor.falar();

    }
}
