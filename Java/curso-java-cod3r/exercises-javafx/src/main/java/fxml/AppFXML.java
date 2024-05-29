package fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.net.URL;

public class AppFXML extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        String CSSfile = getClass().getResource("Login.css").toExternalForm();
        URL FXMLfile = getClass().getResource("Login.fxml");
        GridPane root = FXMLLoader.load(FXMLfile);

        Scene scene = new Scene(root, 350, 350);
        scene.getStylesheets().add(CSSfile);

        primaryStage.setResizable(false);
        primaryStage.setTitle("Login Screen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
