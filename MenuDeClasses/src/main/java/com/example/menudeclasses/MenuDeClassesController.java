package com.example.menudeclasses;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuDeClassesController {

    public void trocaAnimais(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Animais.fxml"));
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void trocaCadernos(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Cadernos.fxml"));
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void trocaCarros(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Carros.fxml"));
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void trocaEspadas(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Espadas.fxml"));
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void trocaInstrumentos(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Instrumentos.fxml"));
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void trocaJogos(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Jogos.fxml"));
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void trocaLivros(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Livros.fxml"));
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void trocaPessoas(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Pessoas.fxml"));
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void trocaPokemons(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Pokemons.fxml"));
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void trocaVideogames(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Videogames.fxml"));
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}

