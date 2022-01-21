package kodlama.io.northwind.Business.Abstracts;

import kodlama.io.northwind.Entities.Concretes.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();
}
