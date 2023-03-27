package com.ecomerce.nabil.service;

import com.ecomerce.nabil.dao.ProductDao;
import com.ecomerce.nabil.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductDao productDao;
    public Product addNewProduct(Product product){
        Product p=productDao.save(product);
        return p;

    }

    public List<Product> getAllProducts(){
        return  (List<Product>) productDao.findAll();
    }
    public void deleteProductDetails(Integer productId){
        productDao.deleteById(productId);

    }
}
