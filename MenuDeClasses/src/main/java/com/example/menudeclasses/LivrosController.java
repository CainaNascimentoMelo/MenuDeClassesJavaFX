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

public class LivrosController {

    private String titulo = "20.000 Léguas Submarinas";
    private String genero = "Romance";
    private String autor = "Jules Verne";

    @FXML
    private Label ExibirTitulo;
    public void setTitulo(String t) {
        this.titulo = t;
    }

    public String getTitulo() {
        return titulo;
    }

    @FXML
    private Label ExibirGenero;
    public void setGenero(String g) {
        this.genero = g;
    }

    public String getGenero() {
        return genero;
    }

    @FXML
    private Label ExibirAutor;
    public void setAutor(String a) {
        this.autor = a;
    }

    public String getAutor() {
        return autor;
    }

    public void exibirTitulo() {
        ExibirTitulo.setText("O título do livro é " + titulo);
    }

    public void exibirGenero() {
        ExibirGenero.setText("20.000 Léguas Submarinas é um " + genero);
    }

    public void exibirAutor() {
        ExibirAutor.setText("O autor do livro é " + autor);
    }

    public void VoltarMenuDeClasses(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MenuDeClasses.fxml"));
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}