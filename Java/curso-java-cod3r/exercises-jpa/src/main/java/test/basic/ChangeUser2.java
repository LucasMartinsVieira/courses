package test.basic;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.base.User;

public class ChangeUser2 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercises-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        User user = em.find(User.class, 5L);
        user.setName("lucas martins");

//        user.setEmail("lu@email.com");
//        em.merge(user);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
