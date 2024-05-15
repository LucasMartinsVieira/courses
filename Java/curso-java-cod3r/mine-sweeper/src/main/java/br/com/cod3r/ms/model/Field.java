package br.com.cod3r.ms.model;

import br.com.cod3r.ms.exception.ExplosionException;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private final int line;
    private final int column;
    private boolean open = false;
    private boolean undermined = false;
    private boolean marked = false;

    private List<Field> neighbors = new ArrayList<>();

    Field(int line, int column) {
        this.line = line;
        this.column = column;
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

    void toggleMarked() {
        if (!open) {
            marked = !marked;
        }
    }

    boolean open() {
        if (!open && !marked) {
            open = true;

            if (undermined) {
                throw new ExplosionException();
            }

            if (safeNeighborhood()) {
                neighbors.forEach(v -> v.open());
            }

            return true;
        } else {
            return false;
        }
    }

    boolean safeNeighborhood() {
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

    long minesOnNeighborhood() {
        return neighbors.stream().filter(v -> v.undermined).count();
    }

    void restart() {
        open = false;
        undermined = false;
        marked = false;
    }

    @Override
    public String toString() {
        if (marked) {
            return "x";
        } else if (open && undermined) {
            return "*";
        } else if (open && minesOnNeighborhood() > 0) {
            return Long.toString(minesOnNeighborhood());
        } else if (open) {
            return " ";
        } else {
            return "?";
        }
    }
}