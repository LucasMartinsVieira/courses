package br.com.cod3r.exercisessb.model.repositories;

import br.com.cod3r.exercisessb.model.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends CrudRepository<Product, Integer>, PagingAndSortingRepository<Product, Integer> {
    public Iterable<Product> findByNameContainingIgnoreCase(String partName);
}
