package com.ddusi.basic.controller;

import java.util.List;

import javax.persistence.NonUniqueResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ddusi.basic.model.Product;
import com.ddusi.basic.repository.ProductRepository;

import lombok.extern.slf4j.Slf4j;

// Shift + ctrl + R : 파일 찾기

@Slf4j
@RestController

public class JpaController {
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("/jpa/product2")
	public Product product2(String name) {
		
		Product list = null;
		try {
			list = productRepository.findByName(name);
		} catch (NonUniqueResultException e) {
			list = new Product();
			list.setName("오류!!!!");
		}
		return list;
	}
	
	@GetMapping("/jpa/product")
	public List<Product> product() {
		
		List<Product> list = productRepository.findAll();
		return list;
	}

	@PostMapping("/jpa/product")
	public String productPost(@ModelAttribute Product product) {
		Product pro = productRepository.save(product);
		log.error(pro.toString()); 
		return "redirect:/jpa/product";
	}
}