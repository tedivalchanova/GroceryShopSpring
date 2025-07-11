
package com.shop.controller;

import com.shop.model.Product;
import com.shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepo;

    @GetMapping
    public List<Product> getAll() {
        return productRepo.findAll();
    }

    @PostMapping
    public Product add(@RequestBody Product product) {
        return productRepo.save(product);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product updated) {
        return productRepo.findById(id).map(p -> {
            p.setName(updated.getName());
            p.setPrice(updated.getPrice());
            p.setQuantity(updated.getQuantity());
            p.setX(updated.getX());
            p.setY(updated.getY());
            return productRepo.save(p);
        }).orElseThrow();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productRepo.deleteById(id);
    }
}
