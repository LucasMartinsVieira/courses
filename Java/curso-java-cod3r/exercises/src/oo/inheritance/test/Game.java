package oo.inheritance.test;

import oo.inheritance.Direction;
import oo.inheritance.Hero;
import oo.inheritance.Monster;

public class Game {
    public static void main(String[] args) {
        Monster monster = new Monster();
        monster.x = 10;
        monster.y = 10;

        Hero hero = new Hero(10, 11);
//        hero.x = 10;
//        hero.y = 11;

        System.out.println("The Monster has => " + monster.hearts);
        System.out.println("The Hero has => " + hero.hearts);

        monster.attack(hero);
        hero.attack(monster);

        monster.attack(hero);
        hero.attack(monster);


        monster.walk(Direction.NORTH);
        monster.attack(hero);
        hero.attack(monster);

        System.out.println("The Monster has => " + monster.hearts);
        System.out.println("The Hero has => " + hero.hearts);
    }
}
