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

public class EspadasController {

    private String anoDeCriacao = "1053";
    private String paisDeOrigem = "Japão";
    private String nome = "Tentetsutou";


    @FXML
    private Label ExibirAnoDeCriacao;
    public void setAnoDeCriacao(String a) {
        this.anoDeCriacao = a;
    }

    public String getAnoDeCriacao() {
        return anoDeCriacao;
    }

    @FXML
    private Label ExibirPaisDeOrigem;
    public void setPaisDeOrigem(String p) {
        this.paisDeOrigem = p;
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }

    @FXML
    private Label ExibirnomeDaEspada;
    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void exibirAnoDeCriacao() {
        ExibirAnoDeCriacao.setText("A Tentetsutou foi forjada no ano de " + anoDeCriacao);
    }

    public void exibirPaisDeOrigem() {
        ExibirPaisDeOrigem.setText("A Tentetsutou surgiu no " + paisDeOrigem);
    }

    public void exibirNome() {
        ExibirnomeDaEspada.setText("O nome da espada é " + nome);
    }

    public void VoltarMenuDeClasses(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MenuDeClasses.fxml"));
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}