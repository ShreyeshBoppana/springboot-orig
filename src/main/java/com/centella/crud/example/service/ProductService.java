package com.centella.crud.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centella.crud.example.entity.Product;
import com.centella.crud.example.repository.ProductRepository;


@Service
public class ProductService
{
	@Autowired
	private ProductRepository repository;
	
	public Product saveProduct(Product product)
	{
		return repository.save(product);
	}
	
	public List<Product> saveProducts(List<Product> product)
	{
		return repository.saveAll(product);
	}
	
	public List<Product> getProducts()
	{
		return repository.findAll();
	}
	
	public Product getProductById(int id)
	{
		return repository.findById(id).orElse(null);
	}
	
	public List<Product> getProductByName(String name)
	{
		return repository.findByName(name);
	}
	
	public String deleteProduct(int id)
	{
		repository.deleteById(id);
		return "product removed ! ! "+id;
	}
	
	/*public Product updateProduct(Product product)
	{
		Product existingProduct=repository.findById(product.getId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setPrice(product.getPrice());
		return repository.save(existingProduct);
	}*/
}
