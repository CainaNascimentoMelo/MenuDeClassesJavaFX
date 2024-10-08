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

public class PokemonsController {

    private String tipo = "Fogo";
    private String especie = "Pokémon Lagarto";
    private String nome = "Charmander";

    @FXML
    private Label ExibirTipo;
    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getTipo() {
        return tipo;
    }

    @FXML
    private Label ExibirEspecie;
    public void setEspecie(String e) {
        this.especie = e;
    }

    public String getEspecie() {
        return especie;
    }

    @FXML
    private Label ExibirNome;
    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void exibirTipo() {
        ExibirTipo.setText("o Charmander é do tipo " + tipo);
    }

    public void exibirEspecie() {
        ExibirEspecie.setText("Ele é denominado como " + especie);
    }

    public void exibirNome() {
        ExibirNome.setText("O nome do Pokémon é " + nome);
    }

    public void VoltarMenuDeClasses(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MenuDeClasses.fxml"));
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
