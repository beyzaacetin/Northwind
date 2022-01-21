package kodlama.io.northwind.DataAccess.Abstracts;

import kodlama.io.northwind.Entities.Concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductDao extends JpaRepository<Product,Integer> {

}
