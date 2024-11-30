import java.util.ArrayList;
import java.util.List;

import interfaces.Professor;

public class Main {
    public static void main(String[] args) {
        ArrayList<Professor> funcionarios = new ArrayList<>();
        funcionarios.add(new Professor("João", "123.456.789-00", "01/01/2000", "1234", 5000.0, 2010));
        funcionarios.add(new Professor("Maria", "987.654.321-00", "01/01/2000", "5678", 5000.0, 2010));
        funcionarios.add(new Professor("José", "456.789.123-00", "01/01/2000", "9012", 5000.0, 2010));


        List<Professor> professores = new ArrayList<>();
    }
}
