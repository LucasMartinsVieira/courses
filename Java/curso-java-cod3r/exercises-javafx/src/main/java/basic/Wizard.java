package basic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application {

    private Stage window;
    private Scene step1;
    private Scene step2;
    private Scene step3;

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        createStep1();
        createStep2();
        createStep3();

        window.setScene(step1);
        window.setTitle("Wizard :: Step 01");
        window.show();
    }

    private void createStep1() {
        Button nextStep = new Button("Go to Step 2 >>");
        nextStep.setOnAction(e -> {
            window.setScene(step2);
            window.setTitle("Wizard :: Step 02");
        });

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(nextStep);

        step1 = new Scene(box, 400, 400);
    }

    private void createStep2() {
        Button previousStep = new Button("<< Back to Step 1");
        previousStep.setOnAction(e -> {
            window.setScene(step1);
            window.setTitle("Wizard :: Step 01");
        });

        Button nextStep = new Button("Go to Step 3 >>");
        nextStep.setOnAction(e -> {
            window.setScene(step3);
            window.setTitle("Wizard :: Step 03");
        });

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(previousStep);
        box.getChildren().add(nextStep);

        step2 = new Scene(box, 400, 400);
    }

    private void createStep3() {
        Button previousStep = new Button("<< Back to Step 2");
        previousStep.setOnAction(e -> {
            window.setScene(step2);
        });

        Button finishButton = new Button("Finish!");
        finishButton.setOnAction(e -> {
            System.exit(0);
        });

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(previousStep);
        box.getChildren().add(finishButton);

        step3 = new Scene(box, 400, 400);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
