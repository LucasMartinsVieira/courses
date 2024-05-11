package oo.inheritance;

public class Player {
    public int hearts = 100;
    public int x;
    public int y;

//    Player() {
//        this(0, 0);
//    }
    protected Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean attack(Player opponent) {
        int deltaX = Math.abs(x - opponent.x);
        int deltaY = Math.abs(y - opponent.y);

        if ((deltaX == 0 && deltaY == 1) || (deltaX == 1 && deltaY == 0)) {
            opponent.hearts -= 10;
            return true;
        } else {
            return false;
        }
    }

    public boolean walk(Direction direction) {
        switch (direction) {
            case NORTH:
                y--;
                break;
            case EAST:
                x++;
                break;
            case SOUTH:
                y++;
                break;
            case WEST:
                x--;
                break;
        }

        return true;
    }
}
