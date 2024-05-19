package br.com.cod3r.ms.model;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private final int line;
    private final int column;
    private boolean open = false;
    private boolean undermined = false;
    private boolean marked = false;

    private List<Field> neighbors = new ArrayList<>();
    private List<FieldObserver> observers = new ArrayList<>();

    Field(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public void registerObserver(FieldObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(FieldEvent event) {
        observers.stream().forEach(o -> o.eventOccurred(this, event));
    }

    boolean addNeighbor(Field neighbor) {
        boolean differentLine = line != neighbor.line;
        boolean differentColumn = column != neighbor.column;
        boolean diagonal = differentLine && differentColumn;

        int deltaLine = Math.abs(line - neighbor.line);
        int deltaColumn = Math.abs(column - neighbor.column);
        int deltaGeneral = deltaColumn + deltaLine;

        if (deltaGeneral == 1 && !diagonal) {
            neighbors.add(neighbor);
            return true;
        } else if (deltaGeneral == 2 && diagonal) {
            neighbors.add(neighbor);
            return true;
        } else {
            return false;
        }
    }

    public void toggleMarked() {
        if (!open) {
            marked = !marked;

            if (marked) {
                notifyObservers(FieldEvent.MARK);
            } else {
                notifyObservers(FieldEvent.UNMARK);
            }
        }
    }

    public boolean open() {
        if (!open && !marked) {

            if (undermined) {
                notifyObservers(FieldEvent.EXPLODE);
                return true;
            }

            setOpen(true);

            if (safeNeighborhood()) {
                neighbors.forEach(v -> v.open());
            }

            return true;
        } else {
            return false;
        }
    }

    public boolean safeNeighborhood() {
        return neighbors.stream().noneMatch(v -> v.undermined);
    }

    void undermine() {
        if (!undermined) {
            undermined = true;
        }
    }

    public boolean isUndermined() {
        return undermined;
    }

    public boolean isMarked() {
        return marked;
    }

    void setOpen(boolean open) {
        this.open = open;

        if (open) {
            notifyObservers(FieldEvent.OPEN);
        }
    }

    public boolean isOpen() {
        return open;
    }

    public boolean isClosed() {
        return !open;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    boolean goalAchieved() {
        boolean unraveled = !undermined && open;
        boolean secure = undermined && marked;
        return unraveled || secure;
    }

    public int minesOnNeighborhood() {
        return (int) neighbors.stream().filter(v -> v.undermined).count();
    }

    void restart() {
        open = false;
        undermined = false;
        marked = false;

        notifyObservers(FieldEvent.RESTART);
    }

}