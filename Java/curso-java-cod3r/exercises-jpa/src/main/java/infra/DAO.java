package infra;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import model.base.Product;

import java.util.List;

public class DAO<E> {
    private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<E> eClass;

    static {
        try {
            emf = Persistence.createEntityManagerFactory("exercises-jpa");
        } catch(Exception e) {
            // LOG -> log4j
        }
    }

    public DAO() {
        this(null);
    }

    public DAO(Class<E> eClass) {
        this.eClass = eClass;
        em = emf.createEntityManager();
    }

    public DAO<E> test() {

        return this;
    }

    public DAO<E> openT() {
        em.getTransaction().begin();
        return this;
    }

    public DAO<E> closeT() {
        em.getTransaction().commit();
        return this;
    }

    public DAO<E> include(E entity) {
        em.persist(entity);
        return this;
    }

    public DAO<E> includeAtomic(E entity) {
        return this.openT().include(entity).closeT();
    }

    public E getById(Object id) {
        return em.find(eClass, id);
    }

    public List<E> getAll(int qty, int offset) {
        if (eClass == null) {
            throw new UnsupportedOperationException("Null class.");
        }

        String jpql = "select e from " + eClass.getName() + " e";
        TypedQuery<E> query = em.createQuery(jpql, eClass);
        query.setMaxResults(qty);
        query.setFirstResult(offset);
        return query.getResultList();
    }

    public List<E> getAll() {
        return this.getAll(10, 0);
    }

    public List<E> query(String nameQuery, Object... params) {
        TypedQuery<E> query = em.createNamedQuery(nameQuery, eClass);

        for (int i = 0; i < params.length; i += 2) {
            query.setParameter(params[i].toString(), params[i + 1]);
        }

        return query.getResultList();
    }

    public E queryOne(String nameQuery, Object... params) {
        List<E> list = query(nameQuery, params);

        return list.isEmpty() ? null : list.get(0);
    }

    public void close() {
        em.close();
    }
}
