package classe;

public class AreaCirc {
    double radius;
    final static double PI = 3.14;

    AreaCirc(double initialRadius) {
        radius = initialRadius;
    }

    double area() {
        return PI * radius * radius;
    }

    static double area(double radius) {
        return PI * Math.pow(radius, 2);
    }
}
