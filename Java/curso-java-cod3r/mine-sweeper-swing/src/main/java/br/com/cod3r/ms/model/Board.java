package br.com.cod3r.ms.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Board implements FieldObserver {
    private final int lines;
    private final int columns;
    private final int mines;
    private final List<Field> fields = new ArrayList<>();
    private final List<Consumer<ResultEvent>> observers = new ArrayList<>();

    public Board(int lines, int columns, int mines) {
        this.lines = lines;
        this.columns = columns;
        this.mines = mines;

        generateFields();
        associateNeighbors();
        sortMines();
    }

    public void forEachField(Consumer<Field> function) {
        fields.forEach(function);
    }
    public void registerObserver(Consumer<ResultEvent> observer) {
        observers.add(observer);
    }

    private void notifyObservers(boolean result) {
        observers.stream().forEach(o -> o.accept(new ResultEvent(result)));
    }

    public void open(int line, int column) {
        fields.parallelStream()
                .filter(c -> c.getLine() == line && c.getColumn() == column)
                .findFirst()
                .ifPresent(c -> c.open());
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
                Field field = new Field(line, column);
                field.registerObserver(this);
                fields.add(field);
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

    public int getLines() {
        return lines;
    }

    public int getColumns() {
        return columns;
    }

    @Override
    public void eventOccurred(Field field, FieldEvent event) {
        if (event == FieldEvent.EXPLODE) {
            showMines();
            notifyObservers(false);
        } else if (goalAchieved()) {
            notifyObservers(true);
        }
    }

    private void showMines() {
        fields.stream()
                .filter(c -> c.isUndermined())
                .filter(c -> !c.isMarked())
                .forEach(c -> c.setOpen(true));
    }
}
