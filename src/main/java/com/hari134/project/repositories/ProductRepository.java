package com.hari134.project.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hari134.project.models.Product;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;

public interface ProductRepository extends MongoRepository<Product, String> {

    @Query("{'name': { $regex: ?0, $options: 'i' }}")
    List<Product> findByNameFuzzySearch(String searchTerm);
}
