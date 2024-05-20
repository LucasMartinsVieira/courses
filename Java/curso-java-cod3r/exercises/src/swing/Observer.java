package swing;

import javax.swing.*;
import java.awt.*;

public class Observer {
    public static void main(String[] args) {
        JFrame pane = new JFrame("Observer");
        pane.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pane.setSize(600, 200);
        pane.setLayout(new FlowLayout());
        pane.setLocationRelativeTo(null);

        JButton button = new JButton("Click here");
        pane.add(button);

        button.addActionListener(e -> {
            System.out.println("Event happened!!!");
        });

        pane.setVisible(true);
    }
}
