package com.shop.dao;

import java.util.List;
import com.shop.model.Product;

public interface ProductDao 
{
    public boolean addProduct(Product p);
    public List<Product> getAllProducts();
    public boolean updateProduct(Product p);
    public boolean deleteProduct(int id);
    public Product getProductById(int id);  
}