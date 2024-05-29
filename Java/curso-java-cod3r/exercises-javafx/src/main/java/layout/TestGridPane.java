package layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class TestGridPane extends GridPane {
    public TestGridPane() {
        Box b1 = new Box().withText("1");
        Box b2 = new Box().withText("2");
        Box b3 = new Box().withText("3");
        Box b4 = new Box().withText("4");
        Box b5 = new Box().withText("5");
        Box b6 = new Box().withText("6");

        setGridLinesVisible(true);

        getColumnConstraints().addAll(cc(), cc(), fcc(), cc(), cc());
        getRowConstraints().addAll(rc(), rc(), frc(), rc(), rc());

        setVgap(10);
        setHgap(10);

        add(b1, 0, 0, 2, 2);
        add(b2, 1, 1, 2, 2);
        add(b3, 4, 2, 1, 3);
        add(b4, 3, 1);
        add(b5, 0, 4, 2, 1);
        add(b6, 3, 3);
    }

    private ColumnConstraints cc() {
        ColumnConstraints cc = new ColumnConstraints();
        cc.setPercentWidth(20);
        cc.setFillWidth(true);
        return cc;
    }

    private ColumnConstraints fcc() {
        ColumnConstraints cc = new ColumnConstraints();
        cc.setMinWidth(50);
        cc.setMaxWidth(50);
        cc.setFillWidth(true);
        return cc;
    }

    private RowConstraints rc() {
        RowConstraints rc = new RowConstraints();
        rc.setPercentHeight(20);
        rc.setFillHeight(true);
        return rc;
    }

    private RowConstraints frc() {
        RowConstraints rc = new RowConstraints();
        rc.setMinHeight(20);
        rc.setMaxHeight(20);
        rc.setFillHeight(true);
        return rc;
    }
}
