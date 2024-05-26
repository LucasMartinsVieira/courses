package test.basic;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.base.User;

public class DeleteUser {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercises-jpa");
        EntityManager em = emf.createEntityManager();

        User user = em.find(User.class, 8L);

        if (user != null) {
            em.getTransaction().begin();
            em.remove(user);
            em.getTransaction().commit();
        }

        em.close();
        emf.close();
    }
}
