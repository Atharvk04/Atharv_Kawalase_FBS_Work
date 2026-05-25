package com.shop.service;

import java.util.List;
import com.shop.model.*;

public interface ShopService {

    boolean registerUser(User user);
    User loginUser(String email, String password);

    boolean addProduct(Product product);
    List<Product> getAllProducts();

    List<CartItem> addToCart(List<CartItem> cart, CartItem item);
    List<CartItem> removeFromCart(List<CartItem> cart, int productId);
    double calculateTotal(List<CartItem> cart);

    int placeOrder(User user, List<CartItem> cart);
    
    void savePayment(Payment payment);
    
}