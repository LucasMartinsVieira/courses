package br.com.cod3r.ms.ui;

import br.com.cod3r.ms.model.Field;
import br.com.cod3r.ms.model.FieldEvent;
import br.com.cod3r.ms.model.FieldObserver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FieldButton extends JButton implements FieldObserver, MouseListener {
    private final Color BG_STANDARD = new Color(184, 184, 184);
    private final Color BG_MARK = new Color(8, 179, 247);
    private final Color BG_EXPLOSION = new Color(189, 66, 68);
    private final Color TEXT_GREEN = new Color(0, 100, 0);
    private Field field;

    public FieldButton(Field field) {
        this.field = field;
        setBackground(BG_STANDARD);
        setBorder(BorderFactory.createBevelBorder(0));

        addMouseListener(this);
        field.registerObserver(this);
    }

    @Override
    public void eventOccurred(Field field, FieldEvent event) {
        switch (event) {
            case OPEN:
                applyStyleOpen();
                break;
            case MARK:
                applyStyleMark();
                break;
            case EXPLODE:
                applyStyleExplode();
                break;
            default:
                applyStyleStandard();
        }

        SwingUtilities.invokeLater(() -> {
            repaint();
            validate();
        });
    }

    private void applyStyleStandard() {
        setBackground(BG_STANDARD);
        setBorder(BorderFactory.createBevelBorder(0));
        setOpaque(true);
        setText("");
    }

    private void applyStyleExplode() {
        setBackground(BG_EXPLOSION);
        setForeground(Color.WHITE);
        setText("X");
    }

    private void applyStyleMark() {
        setBackground(BG_MARK);
        setForeground(Color.BLACK);
        setText("M");
    }

    private void applyStyleOpen() {
        setBorder(BorderFactory.createLineBorder(Color.GRAY));

        if (field.isUndermined()) {
            setBackground(BG_EXPLOSION);
            return;
        }

        setBackground(BG_STANDARD);

        switch (field.minesOnNeighborhood()) {
            case 1:
                setForeground(TEXT_GREEN);
                break;
            case 2:
                setForeground(Color.BLUE);
                break;
            case 3:
                setForeground(Color.YELLOW);
                break;
            case 4:
            case 5:
            case 6:
                setForeground(Color.RED);
                break;
            default:
                setForeground(Color.PINK);
        }

        String value = !field.safeNeighborhood() ? field.minesOnNeighborhood() + "" : "";
        setText(value);
    }


    // Interface MouseListenerMethod
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == 1) {
            field.open();
        } else {
            field.toggleMarked();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
