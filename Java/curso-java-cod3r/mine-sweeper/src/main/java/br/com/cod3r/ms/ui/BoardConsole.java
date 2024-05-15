package br.com.cod3r.ms.ui;

import br.com.cod3r.ms.exception.ExplosionException;
import br.com.cod3r.ms.exception.QuitException;
import br.com.cod3r.ms.model.Board;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class BoardConsole {
    private Board board;
    private Scanner input = new Scanner(System.in);

    public BoardConsole(Board board) {
        this.board = board;

        executeGame();
    }

    private void executeGame() {
        try {
            boolean continuePlaying = true;

            while (continuePlaying) {
                gameCycle();

                System.out.println("Another match? (Y/n) ");
                String response = input.nextLine();

                if ("n".equalsIgnoreCase(response)) {
                    continuePlaying = false;
                } else {
                    board.restart();
                }
            }

        } catch (QuitException e) {
            System.out.println("Bye!!!");
        } finally {
            input.close();
        }
    }

    private void gameCycle() {
        try {

            while(!board.goalAchieved()) {
                System.out.println(board);

                String entered = captureEnteredValue("Enter (x, y): ");

                Iterator<Integer> xy = Arrays.stream(entered.split(",")).map(e -> Integer.parseInt(e.trim())).iterator();

                entered = captureEnteredValue("1- Open or 2 - (Un)Mark: ");

                if ("1".equals(entered)) {
                    board.open(xy.next(), xy.next());
                } else if ("2".equals(entered)) {
                    board.toggleMarked(xy.next(), xy.next());
                }
            }

            System.out.println(board);
            System.out.println("You won!!!");
        } catch (ExplosionException e) {
            System.out.println(board);
            System.out.println("You lost!");
        }
    }

    private String captureEnteredValue(String text) {
        System.out.print(text);
        String entered = input.nextLine();

        if ("quit".equalsIgnoreCase(entered)) {
            throw new QuitException();
        }
        return entered;
    }
}
