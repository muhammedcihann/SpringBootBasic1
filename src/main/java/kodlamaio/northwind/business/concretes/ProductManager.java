package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service //Bu anotasyon, bir sınıfın iş mantığını içeren bir servis bileşeni olduğunu belirtir
public class ProductManager implements ProductService{
	
	private ProductDao productDao;
	
	@Autowired //@Autowired, Spring Framework'ün bir özelliğidir ve bağımlılıkların otomatik olarak enjekte edilmesini sağlar. Bu özellik sayesinde, bir sınıfın içindeki bağımlılıkların tanımlanmasına gerek kalmaz ve Spring Framework bunları otomatik olarak enjekte eder.
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	@Override
	public List<Product> getAll() {
		
		return this.productDao.findAll();
	}

}
