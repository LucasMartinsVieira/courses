package oo.polymorphism;

public class Dinner {
    public static void main(String[] args) {
        Person invited = new Person(99.65);

        Food ingredient1 = new Rice(0.2);
        Food ingredient2 = new Beans(0.1);

        Food ingredient3 = new Rice(0.1);

        System.out.println(invited.getWeight());

        invited.eat(ingredient1);
        invited.eat(ingredient2);
        invited.eat(ingredient3);

        System.out.println(invited.getWeight());

        IceCream dessert = new IceCream(0.4);
        invited.eat(dessert);
        
        System.out.println(invited.getWeight());
    }
}
