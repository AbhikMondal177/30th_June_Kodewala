package com.zepto.search.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.search.entity.ProductEntity;
import com.zepto.search.request.SearchRequest;
import com.zepto.search.serivce.ProductService;

@RestController
public class SearchController {
	@Autowired
	ProductService productService;
	
	@GetMapping("/searchProduct")
	public ResponseEntity searchProduct(@RequestBody SearchRequest searchRequest) {
		
		System.out.println(searchRequest.getProductName());
		List<ProductEntity> list= new ArrayList<ProductEntity>();
		
	    list= productService.searchProduct(searchRequest.getProductName());
	    
	    return ResponseEntity.ok(list);
	}


}