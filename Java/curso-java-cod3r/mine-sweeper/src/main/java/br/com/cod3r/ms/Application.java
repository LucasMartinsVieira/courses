package br.com.cod3r.ms;

import br.com.cod3r.ms.model.Board;
import br.com.cod3r.ms.ui.BoardConsole;

public class Application {
    public static void main(String[] args) {
        Board board = new Board(6, 6 ,6);
        new BoardConsole(board);
    }
}
