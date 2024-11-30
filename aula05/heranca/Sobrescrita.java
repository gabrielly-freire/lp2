package heranca;
import java.util.ArrayList;

public class Sobrescrita {
   public static void main(String[] args) {
    
    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    Pessoa joao = new Pessoa();
    Aluno maria = new Aluno();
    Professor jose = new Professor();

    pessoas.add(joao);
    pessoas.add(maria);
    pessoas.add(jose);

    for (Pessoa pessoa : pessoas) {
        if (pessoa instanceof Aluno) {
            System.out.println("Aluno");
        }
        if (pessoa instanceof Professor) {
            System.out.println("Professor");
        }
        if (pessoa instanceof Pessoa) {
            System.out.println("Pessoa");
        }
    }
   }
}
