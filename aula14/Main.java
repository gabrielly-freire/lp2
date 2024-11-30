import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // String dataNascimento = "01/01/1990";
        
        Pessoa pessoa1 = new Pessoa("João", "123.456.789-00", LocalDate.of(1990, 1, 1));
        Pessoa pessoa2 = new Pessoa("José", "123.123.789-00", LocalDate.of(1990, 1, 1));
        Pessoa pessoa3 = new Pessoa("Maria", "123.456.456-00", LocalDate.of(1990, 1, 1));
        Pessoa pessoa4 = new Pessoa("Joana", "123.789.789-00", LocalDate.of(1990, 1, 1));
        
        List<Pessoa> pessoas = Arrays.asList(pessoa1, pessoa2, pessoa3, pessoa4);
        
        try {
            FileOutputStream arquivo = new FileOutputStream("pessoa.txt");
            ObjectOutputStream objGravar = new ObjectOutputStream(arquivo);
            for (Pessoa p : pessoas)
                objGravar.writeObject(p);
            objGravar.close();
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Erro ao gravar arquivo");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Erro inesperado");
            e.printStackTrace();
        }

    
    }
}
