package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.ProductData;
import com.example.service.ProductDataService;

@RestController
@RequestMapping("/data")
public class ProductDataController {
	@Autowired
	ProductDataService productService;

	@GetMapping("/createProduct")
	public String createProduct(@RequestBody ProductData productData) {
		productService.createProduct(productData);
		return "productData";

	}
//@RequestMapping(value="/priceproduct", method = RequestMethod.GET)
//public String calculate(ModelMap model) {
//	ProductData p=new ProductData();
//	model.put("productData", p);
//	p.setDiscount(15);
//	return "ProductData";
//}
//@RequestMapping(value = "/priceproduct" , method = RequestMethod.POST)
//public String calculate(ProductData product,ModelMap model) {
//	double netPrice  = product.getPrice()-(product.getPrice() * product.getDiscount()/100);
//	product.setNetPrice(netPrice);
//	return "ProductData";
//	
//}
}
