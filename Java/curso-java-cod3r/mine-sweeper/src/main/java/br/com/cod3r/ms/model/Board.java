package br.com.cod3r.ms.model;

import br.com.cod3r.ms.exception.ExplosionException;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Board {
    private int lines;
    private int columns;
    private int mines;
    private final List<Field> fields = new ArrayList<>();

    public Board(int lines, int columns, int mines) {
        this.lines = lines;
        this.columns = columns;
        this.mines = mines;

        generateFields();
        associateNeighbors();
        sortMines();
    }

    public void open(int line, int column) {
        try {
            fields.parallelStream()
                    .filter(c -> c.getLine() == line && c.getColumn() == column)
                    .findFirst()
                    .ifPresent(c -> c.open());
        } catch (ExplosionException e) {
            fields.forEach(c -> c.setOpen(true));
            throw e;
        }

    }

    public void toggleMarked(int line, int column) {
        fields.parallelStream()
                .filter(c -> c.getLine() == line && c.getColumn() == column)
                .findFirst()
                .ifPresent(c -> c.toggleMarked());
    }

    private void generateFields() {
        for (int line = 0; line < lines; line++) {
            for (int column = 0; column < columns; column++) {
                fields.add(new Field(line, column));
            }
        }
    }

    private void associateNeighbors() {
        for (Field f1 : fields) {
            for (Field f2 : fields) {
                f1.addNeighbor(f2);
            }
        }
    }

    private void sortMines() {
        long armedMines = 0;
        Predicate<Field> undermined = c -> c.isUndermined();

        do {
            int random = (int) (Math.random() * fields.size());
            fields.get(random).undermine();
            armedMines = fields.stream().filter(undermined).count();
        } while (armedMines < mines);
    }

    public boolean goalAchieved() {
        return fields.stream().allMatch(c -> c.goalAchieved());
    }

    public void restart() {
        fields.stream().forEach(c -> c.restart());
        sortMines();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("  ");
        for (int c = 0; c < columns; c++) {
            sb.append(" ");
            sb.append(c);
            sb.append(" ");
        }

        sb.append("\n");

        int i = 0;
        for (int l = 0; l < lines; l++) {
            sb.append(l);
            sb.append(" ");
            for (int c = 0; c < columns; c++) {
                sb.append(" ");
                sb.append(fields.get(i));
                sb.append(" ");
                i++;
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
