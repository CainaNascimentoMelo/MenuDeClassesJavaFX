package com.example.menudeclasses;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class PessoasController {

    private String etnia = "Branco";
    private String anoDeNascimento = "1992";
    private String nome = "Arthur Cervero";

    @FXML
    private Label ExibirEtnia;
    public void setEtnia(String e) {
        this.etnia = e;
    }

    public String getEtnia() {
        return etnia;
    }

    @FXML
    private Label ExibirAnoDeNascimento;
    public void setAnoDeNascimento(String a) {
        this.anoDeNascimento = a;
    }

    public String getAnoDeNascimento() {
        return anoDeNascimento;
    }

    @FXML
    private Label ExibirNome;
    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void exibirEtnia() {
        ExibirEtnia.setText("Arthur Cervero se identifica como " + etnia);
    }

    public void exibirAnoDeNascimento() {
        ExibirAnoDeNascimento.setText("Arthur Cervero nasceu em " + anoDeNascimento);
    }

    public void exibirNome() {
        ExibirNome.setText("O nome da pessoa é " + nome);
    }

    public void VoltarMenuDeClasses(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MenuDeClasses.fxml"));
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}