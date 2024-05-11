package oo.abstractPackage;

public abstract class Mammal extends Animal {

    public abstract String breastFeed();

    @Override
    public String toMove() {
        return "Getting out of place";
    }
}
