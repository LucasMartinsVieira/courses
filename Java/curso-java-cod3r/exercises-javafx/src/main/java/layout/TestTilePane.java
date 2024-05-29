package layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;
import java.util.List;

import java.util.ArrayList;

public class TestTilePane extends TilePane {
    public TestTilePane() {
        List<Square> squareList = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            squareList.add(new Square(i * 10));
        }

        setPadding(new Insets(20, 10, 20, 10));
        setVgap(10);
        setHgap(10);

        setOrientation(Orientation.VERTICAL);
        setTileAlignment(Pos.BOTTOM_RIGHT);

        getChildren().addAll(squareList);
    }
}