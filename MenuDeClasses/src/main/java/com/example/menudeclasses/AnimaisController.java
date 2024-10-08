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

public class AnimaisController {

    private String especie = "Corvus Corax";
    private String dietaAlimentar = "Necrófaga";
    private String nome = "Corvo";

    @FXML
    private Label ExibirEspecie;
    public void setEspecie(String e) {
        this.especie = e;
    }

    public String getEspecie() {
        return especie;
    }

    @FXML
    private Label ExibirDietaAlimentar;
    public void setDietaAlimentar(String d) {
        this.dietaAlimentar = d;
    }

    public String getDietaAlimentar() {
        return dietaAlimentar;
    }

    @FXML
    private Label ExibirNomeAnimal;
    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void exibirEspecie() {
        ExibirEspecie.setText("Os Corvos pertencem a espécie " + especie);
    }

    public void exibirDietaAlimentar() {
        ExibirDietaAlimentar.setText("Os Corvos possuem uma dieta alimentar " + dietaAlimentar);
    }

    public void exibirNome() {
        ExibirNomeAnimal.setText("O nome do animal é " + nome);
    }

    public void VoltarMenuDeClasses(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MenuDeClasses.fxml"));
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}