package com.example.controller;


import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Product;

@RestController
public class PriceController {
@RequestMapping(value="/price", method = RequestMethod.GET)
public String calculate(ModelMap model) {
	Product p=new Product();
	model.put("product", p);
	p.setDiscount(15);
	return "price";
	
}
@RequestMapping(value = "/price" , method = RequestMethod.POST)
public String calculate(Product product,ModelMap model) {
	double netPrice  = product.getPrice()-(product.getPrice() * product.getDiscount()/100);
	product.setNetPrice(netPrice);
	return "price";
	
}
}
