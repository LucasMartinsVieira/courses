package ExceptionPackage.personalizedB;

public class NumberOutOfBoundsException extends Exception {
    private String attributeName;
    public NumberOutOfBoundsException(String attributeName) {
        this.attributeName = attributeName;
    }

    @Override
    public String getMessage() {
        return String.format("The attribute '%s' is out of bounds", attributeName);
    }
}
