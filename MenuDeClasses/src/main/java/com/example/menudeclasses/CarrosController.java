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

public class CarrosController {

    private String placa = "RIO2A18";
    private String cor = "Vermelho Fosco";
    private String modelo = "Argo";

    @FXML
    private Label ExibirPlaca;
    public void setPlaca(String p) {
        this.placa = p;
    }

    public String getPlaca() {
        return placa;
    }

    @FXML
    private Label ExibirCorDoCarro;
    public void setCor(String c) {
        this.cor = c;
    }

    public String getCor() {
        return cor;
    }

    @FXML
    private Label ExibirModelo;
    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getModelo() {
        return modelo;
    }

    public void exibirPlaca() {
        ExibirPlaca.setText("A placa do carro é " + placa);
    }

    public void exibirCor() {
        ExibirCorDoCarro.setText("A cor do carro se trata de um " + cor);
    }

    public void exibirModelo() {
        ExibirModelo.setText("O modelo do carro se trata de um " + modelo);
    }

    public void VoltarMenuDeClasses(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MenuDeClasses.fxml"));
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
