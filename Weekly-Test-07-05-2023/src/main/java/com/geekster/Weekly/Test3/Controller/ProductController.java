package com.geekster.Weekly.Test3.Controller;

import com.geekster.Weekly.Test3.Model.Product;
import com.geekster.Weekly.Test3.Service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductServices prductService;

    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product product){
        return prductService.addProduct(product);
    }
    @GetMapping("/getAllProduct")
    public List<Product> getAllProduct(){
        return prductService.getAllProduct();
    }
    @GetMapping("/getProduct")
    public List<Product> getProduct(@RequestParam String category){
        return prductService.findProductByCategory(category);
    }
    @DeleteMapping("/deleteProduct")
    public String deleteProduct(@RequestParam Integer id){
        return prductService.deleteById(id);
    }
}
