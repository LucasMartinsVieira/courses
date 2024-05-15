package br.com.cod3r.ms.model;

import br.com.cod3r.ms.exception.ExplosionException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldTesjt {
    private Field field;

    @BeforeEach
    void setUp() {
        field = new Field(3, 3);
    }

    @Test
    void neighborDistance1Left() {
        Field neighbor = new Field(3, 2);
        boolean result = field.addNeighbor(neighbor);
        assertTrue(result);
    }

    @Test
    void neighborDistance1Right() {
        Field neighbor = new Field(3, 4);
        boolean result = field.addNeighbor(neighbor);
        assertTrue(result);
    }

    @Test
    void neighborDistance1OnTop() {
        Field neighbor = new Field(2, 3);
        boolean result = field.addNeighbor(neighbor);
        assertTrue(result);
    }

    @Test
    void neighborDistance1Below() {
        Field neighbor = new Field(4, 3);
        boolean result = field.addNeighbor(neighbor);
        assertTrue(result);
    }

    @Test
    void neighborDistance2() {
        Field neighbor = new Field(2, 2);
        boolean result = field.addNeighbor(neighbor);
        assertTrue(result);
    }

    @Test
    void notNeighbor() {
        Field neighbor = new Field(1, 2);
        boolean result = field.addNeighbor(neighbor);
        assertFalse(result);
    }

    @Test
    void standardValueMarkedAttribute() {
        assertFalse(field.isMarked());
    }

    @Test
    void toggleMarked() {
        field.toggleMarked();
        assertTrue(field.isMarked());
    }

    @Test
    void toggleMarkedTwoCalls() {
        field.toggleMarked();
        field.toggleMarked();
        assertFalse(field.isMarked());
    }

    @Test
    void openNotUnderminedNotMarked() {
        assertTrue(field.open());
    }

    @Test
    void openNotUnderminedMarked() {
        field.toggleMarked();
        assertFalse(field.open());
    }

    @Test
    void openUnderminedMarked() {
        field.toggleMarked();
        field.undermine();
        assertFalse(field.open());
    }

    @Test
    void openUnderminedNotMarked() {
        field.undermine();

        assertThrows(ExplosionException.class, () -> {
            field.open();
        });
    }

    @Test
    void openWithNeighbors1() {
        Field field11 = new Field(1, 1);
        Field field22 = new Field(2, 2);
        field22.addNeighbor(field11);
        
        field.addNeighbor(field22);
        field.open();

        assertTrue(field22.isOpen() && field11.isOpen());
    }

    @Test
    void openWithNeighbors2() {
        Field field11 = new Field(1, 1);
        Field field12 = new Field(1, 2);
        field12.undermine();

        Field field22 = new Field(2, 2);
        field22.addNeighbor(field11);
        field22.addNeighbor(field12);

        field.addNeighbor(field22);
        field.open();

        assertTrue(field22.isOpen() && field11.isClosed());
    }

}