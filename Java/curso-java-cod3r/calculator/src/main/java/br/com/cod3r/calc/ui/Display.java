package br.com.cod3r.calc.ui;

import br.com.cod3r.calc.model.Memory;
import br.com.cod3r.calc.model.MemoryObserver;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel implements MemoryObserver {

    private final JLabel label;
    public Display() {
        Memory.getInstance().addObserver(this);

        setBackground(new Color(46, 49, 50));
        label = new JLabel(Memory.getInstance().getCurrentText());
        label.setForeground(Color.WHITE);
        label.setFont(new Font("courier", Font.PLAIN, 30));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));

        add(label);
    }

    @Override
    public void alteredValue(String newValue) {
        label.setText(newValue);
    }
}
