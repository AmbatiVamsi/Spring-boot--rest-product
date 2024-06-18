package com.example.service;

import java.util.List;
import com.example.entity.Product;

public interface IProductService {
    List<Product> getProductsFromDatabase();
}
