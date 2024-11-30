import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas;

        try {
            FileInputStream arquivo2 = new FileInputStream("pessoa.txt");
            ObjectInputStream leitor = new ObjectInputStream(arquivo2);
            try {
                pessoas = (ArrayList<Pessoa>) leitor.readObject();
                for (Pessoa p : pessoas) {
                    System.out.println(p);
                }
                leitor.close();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }
}