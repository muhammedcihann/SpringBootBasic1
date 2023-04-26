package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.northwind.entities.concretes.Product;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer>{
	
//JpaRepository de bir interdace olduğu için interface interface i extend ettik
	
	
	
}
/*
 JpaRepository, bir veritabanı tablosuyla ilgili temel veri işlemlerini (oluşturma, okuma, güncelleme, silme) gerçekleştirmek için önceden tanımlanmış yöntemleri içerir. Bu sayede, veritabanı işlemlerini gerçekleştirmek için kod yazmak yerine, JpaRepository arayüzü üzerinden gerekli veritabanı işlemlerini gerçekleştirmek için hazır yöntemleri kullanabilirsiniz.
 
 Örneğin, JpaRepository kullanarak bir "User" sınıfı için veritabanında bir kayıt oluşturmak için "save" yöntemini kullanabilirsiniz:
 
 @Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User save(User user);
}

 
 */
