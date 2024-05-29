package layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class TestFlowPane extends FlowPane {
    public TestFlowPane() {
        Square s1 = new Square();
        Square s2 = new Square();
        Square s3 = new Square();
        Square s4 = new Square();
        Square s5 = new Square();

        setHgap(10);
        setVgap(10);
        setPadding(new Insets(10));

        setOrientation(Orientation.VERTICAL);
        setAlignment(Pos.CENTER_RIGHT);

        getChildren().addAll(s1, s2, s3, s4, s5);
    }
}
