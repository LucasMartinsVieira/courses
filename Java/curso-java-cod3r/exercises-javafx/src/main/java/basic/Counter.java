package basic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Counter extends Application {
    private int counter = 0;

    // Method to update the displayed number and its style based on its value
    private void updateNumberLabel(Label label) {
        label.setText(Integer.toString(counter)); // Update the label with the current counter value

        // Remove any existing styles and add new based on the counter value
        label.getStyleClass().remove("green");
        label.getStyleClass().remove("red");

        if(counter > 0) {
            label.getStyleClass().add("green"); // Add green class if positive
        } else if(counter < 0) {
            label.getStyleClass().add("red"); // Add red class if negative
        }
    }


    @Override
    public void start(Stage stage) throws Exception {
        Label titleLabel = new Label("Counter");
        titleLabel.getStyleClass().add("title");

        Label numberLabel = new Label("0");
        numberLabel.getStyleClass().add("number");

        Button buttonDecrement = new Button("-");
        buttonDecrement.getStyleClass().add("buttons");
        buttonDecrement.setOnAction(e -> {
            counter--;
            updateNumberLabel((numberLabel));
        });

        Button buttonIncrement = new Button("+");
        buttonIncrement.getStyleClass().add("buttons");
        buttonIncrement.setOnAction(e -> {
            counter++;
            updateNumberLabel((numberLabel));
        });

        HBox boxButtons = new HBox();
        boxButtons.setAlignment(Pos.CENTER);
        boxButtons.setSpacing(10);
        boxButtons.getChildren().add(buttonDecrement);
        boxButtons.getChildren().add(buttonIncrement);

        VBox contentBox = new VBox();
        contentBox.getStyleClass().add("content");
        contentBox.setSpacing(10);
        contentBox.setAlignment(Pos.CENTER);
        contentBox.getChildren().add(titleLabel);
        contentBox.getChildren().add(numberLabel);
        contentBox.getChildren().add(boxButtons);

        String cssPath = getClass().getResource("Counter.css").toExternalForm();


        Scene mainScene = new Scene(contentBox, 400, 400);
        mainScene.getStylesheets().add(cssPath);
        mainScene.getStylesheets().add("https://fonts.googleapis.com/css?family=Oswald"); // Google fonts

        stage.setScene(mainScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
