package edu.mum.cs.cs425.prodmgmt.app.service;

import java.util.List;

import edu.mum.cs.cs425.prodmgmt.app.model.Product;

public interface ProductService<P> {
    List<Product> findAll();
	Product save(Product product);
	Product findOne(Long id);
	void delete(Long id);
}