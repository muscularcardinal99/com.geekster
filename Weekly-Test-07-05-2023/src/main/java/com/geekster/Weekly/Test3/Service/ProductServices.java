package com.geekster.Weekly.Test3.Service;

import com.geekster.Weekly.Test3.DAO.IProductRepo;
import com.geekster.Weekly.Test3.Model.Product;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ProductServices {
    @Autowired
    IProductRepo productRepo;
    public String addProduct(Product product) {
        productRepo.save(product);
        return "product added successfully!!!!!!!!!! ";
    }

    public List<Product> getAllProduct() {
        return productRepo.getAlProduct();
    }


    public List<Product> findProductByCategory(String category) {
        return productRepo.findAllByCategory(category);
    }

    public String deleteById(Integer id) {
        if(!productRepo.existsById(id)|| id==null){
            return "enter valid Id!!!!!";
        }
        else {
            productRepo.deleteById(id);
            return "product deleted SuccessFully!!!!!!!";
        }
    }


}
