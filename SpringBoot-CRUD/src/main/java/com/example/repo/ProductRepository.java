package com.example.repo;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.modal.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product,Serializable> {

}
