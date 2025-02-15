package br.imd.controller;

import java.io.IOException;
import java.time.LocalDate;
import br.imd.model.Genero;
import br.imd.utils.Op;
import br.imd.App;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class SecondaryController {

    @FXML
    private CheckBox cbEAD;

    @FXML
    private CheckBox cbPCD;

    @FXML
    private DatePicker dpNascumento;

    @FXML
    private ToggleGroup grupo;

    @FXML
    private RadioButton rbFem;

    @FXML
    private RadioButton rbMasc;

    @FXML
    private RadioButton rbOutros;

    @FXML
    private TextField tfCurso;

    @FXML
    private TextField tfMatricula;

    @FXML
    private TextField tfNome;

    @FXML
    private Button btSalvar;

    @FXML
    private Button btVoltar;

    @FXML
    public void salvarAluno() {
        String nome = tfNome.getText().toString();
        String matricula = tfMatricula.getText().toString();
        String curso = tfCurso.getText().toString();
        LocalDate nascimento = dpNascumento.getValue();
        boolean alunoEAD = cbEAD.isSelected();
        boolean alunoPCD = cbPCD.isSelected();
        Genero generoEnun;

        RadioButton selecionado = (RadioButton)grupo.getSelectedToggle();
        String genero = selecionado.getText();
        if(genero.equals("Masc")){
            generoEnun = Genero.MASCULINO;
        }else if(genero.equals("Fem")){
            generoEnun = Genero.FEMININO;
        }else{
            generoEnun = Genero.OUTRO;
        }

        Op.salvar(nome, matricula, nascimento, curso, alunoEAD, alunoPCD, generoEnun);

         Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Informação");
                alert.setHeaderText("Aluno salvo com sucesso");
                alert.showAndWait();
    }

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary.fxml");

    }
}