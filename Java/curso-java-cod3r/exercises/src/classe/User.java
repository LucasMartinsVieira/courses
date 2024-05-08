package classe;

public class User {
    String name;
    String email;

    //    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User another) {

            boolean equalName = another.name.equals(this.name);
            boolean equalEmail = another.email.equals(this.email);

            return equalName && equalEmail;
        } else {
            return false;
        }
    }
}