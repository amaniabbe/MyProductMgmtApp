package edu.mum.cs.cs425.prodmgmt.app;

import java.util.Calendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.prodmgmt.app.model.Product;
import edu.mum.cs.cs425.prodmgmt.app.service.ProductService;

@SpringBootApplication
public class ProductMgmtApp implements CommandLineRunner{

	@Autowired
	private ProductService productService;
	public static void main(String[] args) {
		SpringApplication.run(ProductMgmtApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Product product = new Product();
		Calendar calendar = Calendar.getInstance();
		calendar.set(2018, 10, 24);
		product.setDateMfd(calendar.getTime());
		product.setName("iPhone XS Max");
		product.setProductNumber(1001);
		product.setUnitPrice(1500);

		Product p = productService.save(product);
		System.out.println("Product " + p.getName() + " is saved to database");
	}

}
