package kodlama.io.northwind.Api.Controllers;

import kodlama.io.northwind.Business.Abstracts.IProductService;
import kodlama.io.northwind.Entities.Concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
//anatasyon
public class ProductsController {

    private IProductService productService;

    @Autowired //IProductService productService bu alanı buluyor
    public ProductsController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getall")
    public List<Product> getAll(){
        return this.productService.getAll();
    }

}
//kodlama.io/api/products