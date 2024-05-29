package basic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class FirstFX extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Button buttonA = new Button("A");
        Button buttonB = new Button("B");
        Button buttonC = new Button("C");

        buttonA.setOnAction(e -> System.out.println("A"));
        buttonB.setOnAction(e -> System.out.println("B"));
        buttonC.setOnAction(e -> System.exit(0));

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.setSpacing(10);
        box.getChildren().add(buttonA);
        box.getChildren().add(buttonB);
        box.getChildren().add(buttonC);

        Scene onlyScene = new Scene(box, 150, 100);

        primaryStage.setScene(onlyScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
