package br.com.cod3r.calc.ui;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {
    public Button(String text, Color color) {
        setText(text);
        setOpaque(true);
        setBackground(color);
        setFont(new Font("courier", Font.PLAIN, 25));
        setForeground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}
