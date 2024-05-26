package test.basic;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import model.base.User;

import java.util.List;

public class GetUsers {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercises-jpa");
        EntityManager em = emf.createEntityManager();

//        String jpql = "select u from User u";
//        TypedQuery<User> query = em.createQuery(jpql, User.class);
//        query.setMaxResults(5);

//        List<User> users = query.getResultList();
        List<User> users = em
                .createQuery("select u from User u", User.class)
                .setMaxResults(5)
                .getResultList();

        for (User user : users) {
            System.out.println("ID: " + user.getId() + " Email: " + user.getEmail());
        }

        em.close();
        emf.close();
    }
}
