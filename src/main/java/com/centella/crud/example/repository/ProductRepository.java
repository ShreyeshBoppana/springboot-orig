package com.centella.crud.example.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.centella.crud.example.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>
{
	List<Product> findByName(String name);
}
