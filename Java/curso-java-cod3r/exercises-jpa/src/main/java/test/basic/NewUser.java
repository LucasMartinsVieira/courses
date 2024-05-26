package test.basic;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.base.User;

public class NewUser {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercises-jpa");
        EntityManager em = emf.createEntityManager();

        User newUser = new User("Lucas", "lucas@email.com");

//        newUser.setId(1L);

        em.getTransaction().begin();
        em.persist(newUser);
        em.getTransaction().commit();

        System.out.println("The generated ID is: " + newUser.getId());

        em.close();
        emf.close();
    }
}