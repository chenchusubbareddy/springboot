package com.example.jpaexamples.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.jpaexamples.entity.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {

}
