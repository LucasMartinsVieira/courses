package test.manytomany;

import infra.DAO;
import model.manytomany.Nephew;
import model.manytomany.Uncle;

public class NewUncleNephew {
    public static void main(String[] args) {
        Uncle untie1 = new Uncle("Maria");
        Uncle uncle2 = new Uncle("João");

        Nephew nephew1 = new Nephew( "Davi");
        Nephew nephew2 = new Nephew( "Ana");

        untie1.getNephews().add(nephew1);
        nephew1.getUncles().add(untie1);

        untie1.getNephews().add(nephew2);
        nephew2.getUncles().add(untie1);

        uncle2.getNephews().add(nephew1);
        nephew1.getUncles().add(uncle2);

        uncle2.getNephews().add(nephew2);
        nephew2.getUncles().add(uncle2);

        DAO<Object> dao = new DAO<>();

        dao.openT()
                .include(untie1)
                .include(uncle2)
                .include(nephew1)
                .include(nephew2)
                .closeT()
                .close();
    }
}
