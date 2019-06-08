package edu.mum.cs.cs425.prodmgmt.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.mum.cs.cs425.prodmgmt.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}