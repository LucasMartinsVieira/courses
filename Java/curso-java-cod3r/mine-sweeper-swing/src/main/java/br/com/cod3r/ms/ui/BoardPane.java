package br.com.cod3r.ms.ui;

import br.com.cod3r.ms.model.Board;

import javax.swing.*;
import java.awt.*;

public class BoardPane extends JPanel {
    public BoardPane(Board board) {
        setLayout(new GridLayout(board.getLines(), board.getColumns()));

        board.forEachField(f -> add(new FieldButton(f)));
        board.registerObserver(e -> {
            SwingUtilities.invokeLater(() -> {
                if (e.isWon()) {
                    JOptionPane.showMessageDialog(this, "You won :)");
                } else {
                    JOptionPane.showMessageDialog(this, "You lost :(");
                }

                board.restart();
            });
        });
    }
}
