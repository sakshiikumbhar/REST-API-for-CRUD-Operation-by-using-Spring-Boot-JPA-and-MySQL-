package com.demo.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.product.entity.Product;
import com.demo.product.repository.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	ProductRepository repos;
	
    @RequestMapping(value="/product" , method=RequestMethod.POST)
	public Product save(@RequestBody  Product product)
	{
		return repos.save(product);
		
	}
    
    @RequestMapping(value = "/product" , method = RequestMethod.GET)
	public List<Product> getAllProducts() {

		return repos.findAll();
	}
    

	@RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
	public Product getProductById(@PathVariable("id") int id) {
		return repos.findById(id).get();
	}

	
	@RequestMapping(value = "/product/{id}", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("id") int id) {

		repos.deleteById(id);
	}
	
	@RequestMapping(value = "/product", method = RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product) {
		return repos.save(product);
	}
	

}
