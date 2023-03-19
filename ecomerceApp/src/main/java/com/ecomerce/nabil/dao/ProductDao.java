package com.ecomerce.nabil.dao;

import com.ecomerce.nabil.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends CrudRepository<Product,Integer> {


}
