package br.imd.controller;

import java.io.IOException;

import br.imd.App;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Button BtbtLimpar;

    @FXML
    private Button btSalvar;

    @FXML
    private PasswordField pfSenha;

    @FXML
    private TextField tfLogin;

    @FXML
    private void switchToSecondary() throws IOException {

        String login = tfLogin.getText();
        String senha = pfSenha.getText();

        if(!login.isEmpty() && !senha.isEmpty()){
            if(login.equals("admin") && senha.equals("admin")){
                App.setRoot("secondary.fxml");
            }else{
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Informação");
                alert.setHeaderText("Login não realizado");
                alert.setContentText("Senha ou login incorretos");
                alert.showAndWait();
            }
        }else{
            Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Informação");
                alert.setHeaderText("Login não realizado");
                alert.setContentText("Login ou senha não preenchido");
                alert.showAndWait();
        }

       
    }
}
