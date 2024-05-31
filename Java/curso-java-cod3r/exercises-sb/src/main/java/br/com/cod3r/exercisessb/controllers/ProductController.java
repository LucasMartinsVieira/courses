package br.com.cod3r.exercisessb.controllers;

import br.com.cod3r.exercisessb.model.entities.Product;
import br.com.cod3r.exercisessb.model.repositories.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

//    @PostMapping
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Product saveProduct(@Valid Product product) {
        productRepository.save(product);
        return product;
    }

    @GetMapping(path = "/page/{pageNumber}/{pageSize}")
    public Iterable<Product> getProductsByPage(@PathVariable int pageNumber, @PathVariable int pageSize) {
        if (pageSize >= 5) pageSize = 5;
        Pageable page = PageRequest.of(pageNumber, pageSize);
        return productRepository.findAll(page);
    }

    @GetMapping()
    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }

    @GetMapping(path = "/name/{partName}")
    public Iterable<Product> getProductsByName(@PathVariable String partName) {
        return productRepository.findByNameContainingIgnoreCase(partName);
    }

    @GetMapping(path = "/{id}")
    public Optional<Product> getProductByID(@PathVariable int id) {
        return productRepository.findById(id);
    }

    @PutMapping
    public Product changeProduct(@Valid Product product) {
        productRepository.save(product);
        return product;
    }

    @DeleteMapping(path = "/{id}")
    public void deleteProduct(@PathVariable int id) {
        productRepository.deleteById(id);
    }
}
