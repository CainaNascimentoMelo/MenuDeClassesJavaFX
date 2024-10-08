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

public class CadernosController {

    private String corDaCapa = "Azul";
    private String quantidadeDePaginas = "566";
    private String tamanhoDasFolhas = "A4";

    @FXML
    private Label ExibirCorDaCapa;
    public void setCorDaCapa(String c) {
        this.corDaCapa = c;
    }

    public String getCorDaCapa() {
        return corDaCapa;
    }

    @FXML
    private Label ExibirQuantidadeDePaginas;
    public void setQuantidadeDePaginas(String q) {
        this.quantidadeDePaginas = q;
    }

    public String getQuantidadeDePaginas() {
        return quantidadeDePaginas;
    }

    @FXML
    private Label ExibirTamanhoDasFolhas;
    public void setTamanhoDasFolhas(String f) {
        this.tamanhoDasFolhas = f;
    }

    public String getTamanhoDasFolhas() {
        return tamanhoDasFolhas;
    }

    public void exibirCorDaCapa() {
       ExibirCorDaCapa.setText("A cor da capa do caderno é " + corDaCapa);
    }

    public void exibirQuantidadeDePaginas() {
        ExibirQuantidadeDePaginas.setText("O caderno possui " + quantidadeDePaginas + " páginas");
    }

    public void exibirTamanhoDasFolhas() {
        ExibirTamanhoDasFolhas.setText("As folhas do caderno são do tamanho " + tamanhoDasFolhas);
    }

    public void VoltarMenuDeClasses(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MenuDeClasses.fxml"));
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
