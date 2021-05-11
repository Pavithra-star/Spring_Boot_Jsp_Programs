package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ProductDao;
import com.example.model.ProductData;

@Service
public class ProductDataService {
@Autowired
ProductDao productDao;
public void createProduct(ProductData product) {
	 productDao.save(product);
}

}
