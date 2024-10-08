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

public class JogosController {

    private String plataforma = "Nintendo Switch";
    private String anoDeLancamento = "2017";
    private String nome = "Super Mario Odyssey";

    @FXML
    private Label ExibirPlataforma;
    public void setPlataforma(String p) {
        this.plataforma = p;
    }

    public String getPlataforma() {
        return plataforma;
    }

    @FXML
    private Label ExibirAnoDeLancamento;
    public void setAnoDeLancamento(String a) {
        this.anoDeLancamento = a;
    }

    public String getAnoDeLancamento() {
        return anoDeLancamento;
    }

    @FXML
    private Label ExibirNome;
    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void exibirPlataforma() {
        ExibirPlataforma.setText("Ele é exclusivo de " + plataforma);
    }

    public void exibirAnoDeLancamento() {
        ExibirAnoDeLancamento.setText("Super Mario Odyssey foi lançado em " + anoDeLancamento);
    }

    public void exibirNome() {
        ExibirNome.setText("O nome do jogo é " + nome);
    }

    public void VoltarMenuDeClasses(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MenuDeClasses.fxml"));
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
