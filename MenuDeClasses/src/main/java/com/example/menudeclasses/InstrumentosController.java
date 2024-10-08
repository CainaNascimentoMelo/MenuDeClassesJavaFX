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

public class InstrumentosController {

    private String tipoDeInstrumento = "Cordas";
    private String anoDeCriacao = "1930";
    private String nome = "Baixo Elétrico";

    @FXML
    private Label ExibirTipoDeInstrumento;
    public void setTipoDeInstrumento(String t) {
        this.tipoDeInstrumento = t;
    }

    public String getTipoDeInstrumento() {
        return tipoDeInstrumento;
    }

    @FXML
    private Label ExibirAnoDeCriacao;
    public void setAnoDeCriacao(String a) {
        this.anoDeCriacao = a;
    }

    public String getAnoDeCriacao() {
        return anoDeCriacao;
    }

    @FXML
    private Label ExibirNome;
    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void exibirTipoDeInstrumento() {
        ExibirTipoDeInstrumento.setText("Se trata de um instrumento de " + tipoDeInstrumento);
    }

    public void exibirAnoDeCriacao() {
        ExibirAnoDeCriacao.setText("O Baixo Elétrico foi criado em " + anoDeCriacao);
    }

    public void exibirNome() {
        ExibirNome.setText("O instrumento se chama " + nome);
    }

    public void VoltarMenuDeClasses(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MenuDeClasses.fxml"));
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
