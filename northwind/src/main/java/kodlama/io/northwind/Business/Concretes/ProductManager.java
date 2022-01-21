package kodlama.io.northwind.Business.Concretes;

import kodlama.io.northwind.Business.Abstracts.IProductService;
import kodlama.io.northwind.DataAccess.Abstracts.IProductDao;
import kodlama.io.northwind.Entities.Concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductManager implements IProductService {

    private IProductDao productDao;

    @Autowired
    public ProductManager(IProductDao productDao) {
        super();
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}
