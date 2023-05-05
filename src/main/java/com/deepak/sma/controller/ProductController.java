package com.deepak.sma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.deepak.sma.dao.ProductRepository;
import com.deepak.sma.entity.Product;



@Controller
@RequestMapping("/products")
public class ProductController {
	
	
	@Autowired
	ProductRepository proRepo;
	
	
	@GetMapping
	public String displayProduct(Model model) {
		
		List<Product> prod = proRepo.findAll();
		model.addAttribute("products",prod );
		
		return "products/list-products";
	}
	
	@GetMapping("/new")
	public String displayProductForm(Model model) {
		
	Product aProduct = new Product();
				
    model.addAttribute("product", aProduct);
				
    return "products/new-product";
		 
		

	}
	
	@PostMapping("/save")
	public String createProduct(Product product , Model model) {
		
		proRepo.save(product);
		
		
		// redirect is to prevent duplicate entry
		return"redirect:/products/new";
		
		
		
	}

}










 /*Model: use to exchange  data between view and controller (bind data between java code and html code , Model is used)
  * h2- rutime, test db, default url: 
jdbc:h2:mem:testdb
  * 
  * */
 