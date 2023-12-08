package com.centella.crud.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;*/
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.centella.crud.example.entity.Product;
import com.centella.crud.example.service.ProductService;

@RestController
public class ProductController 
{
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product)
	{
		return service.saveProduct(product);
	}
	
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> products)
	{
		return service.saveProducts(products);
	}
	
	@GetMapping("/products")
	public List<Product> findAllProducts()
	{
		return service.getProducts();
	}
	
	@GetMapping("/productById/{id}")
	public Product findProductById(@PathVariable int id)
	{
		return service.getProductById(id);
	}
	
	@GetMapping("/product/{name}")
	public List<Product> findProductByName(@PathVariable String name)
	{
		return service.getProductByName(name);
	}
	
	/*@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product)
	{
		return service.updateProduct(product);
	}*/
	
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id)
	{
		return service.deleteProduct(id);
	}
	
	 /*@GetMapping("/current-username")
	    public String getCurrentUsername() 
	 	{
	        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	        String username;

	        if (principal instanceof UserDetails) {
	            username = ((UserDetails) principal).getUsername();
	        } else {
	            username = principal.toString();
	        }

	        return "Current username: " + username;
	    }
	 
	 private UserDetailsService userDetailsService;
	 
	    public ProductController(UserDetailsService userDetailsService) {
	        this.userDetailsService = userDetailsService;
	    }

	 
	 @GetMapping("/users")
	    public List<String> getUsers() {
	        // Access details of both users
	        UserDetails userShreyesh = userDetailsService.loadUserByUsername("Shreyesh");
	        UserDetails userRobot = userDetailsService.loadUserByUsername("robot");
	        
	        // You can access the details of each user
	        String username1 = userShreyesh.getUsername();
	        String username2 = userRobot.getUsername();
	        // Similarly, you can access other user details such as roles
	        
	        List<String> l=new ArrayList<>();
	        l.add(username1);
	        l.add(username2);
	        
	        return l;
	    }*/
}
