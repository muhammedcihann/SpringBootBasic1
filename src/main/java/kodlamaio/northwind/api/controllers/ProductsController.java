package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products") // (table ismi) bir HTTP isteği yolunu belirler ve bu yola karşılık gelen bir yöntemi tanımlar.
public class ProductsController {
	
	@Autowired
	private ProductService productService;
	
/*	
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	İçerdeki bu mevzuyu zaten @autowired anotasyonu yapıyor.
	*/
	
	
	@GetMapping("/getall")
	public List<Product> getAll(){
		return this.productService.getAll();
		
		}
}
