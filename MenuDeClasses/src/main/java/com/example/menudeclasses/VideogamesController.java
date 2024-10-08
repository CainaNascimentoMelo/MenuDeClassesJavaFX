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

public class VideogamesController {

    private String nome = "Nintendo 3DS";
    private String preco = "699";
    private String anoDeLancamento = "2011";

    @FXML
    private Label ExibirNome;
    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return nome;
    }

    @FXML
    private Label ExibirPreco;
    public void setPreco(String p) {
        this.preco = p;
    }

    public String getPreco() {
        return preco;
    }

    @FXML
    private Label ExibirAnoLancamento;
    public void setAnoDeLancamento(String a) {
        this.anoDeLancamento = a;
    }

    public String getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void exibirNome() {
        ExibirNome.setText("O nome do videogame é " + nome);
    }

    public void exibirPreco() {
        ExibirPreco.setText("O preço do videogame é de R$" + preco );
    }

    public void exibirAnoDeLancamento() {
        ExibirAnoLancamento.setText("o videogame foi lançando em " + anoDeLancamento);
    }

    public void VoltarMenuDeClasses(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MenuDeClasses.fxml"));
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
