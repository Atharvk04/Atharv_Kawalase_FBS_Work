package com.shop.serviceImpl;

import java.util.List;

import com.shop.dao.*;
import com.shop.dao.impl.OrderDaoImpl;
import com.shop.dao.impl.ProductDaoImpl;
import com.shop.dao.impl.UserDaoImpl;
import com.shop.model.*;
import com.shop.service.ShopService;

public class ShopServiceImpl implements ShopService {

    private UserDao userDAO = new UserDaoImpl();
    private ProductDao productDAO = new ProductDaoImpl();
    private OrderDao orderDAO = new OrderDaoImpl();

    // USER
    @Override
    public boolean registerUser(User user) {
        return userDAO.registerUser(user);
    }

    @Override
    public User loginUser(String email, String password) {
        return userDAO.login(email, password);
    }

    // PRODUCT
    @Override
    public boolean addProduct(Product product) {
        return productDAO.addProduct(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productDAO.getAllProducts();
    }

    // CART
    @Override
    public List<CartItem> addToCart(List<CartItem> cart, CartItem item) {

        boolean found = false;

        for (CartItem c : cart) {
            if (c.getProductId() == item.getProductId()) {
                c.setQuantity(c.getQuantity() + item.getQuantity());
                found = true;
                break;
            }
        }

        if (!found) {
            cart.add(item);
        }

        return cart;
    }

    @Override
    public List<CartItem> removeFromCart(List<CartItem> cart, int productId) {
        cart.removeIf(item -> item.getProductId() == productId);
        return cart;
    }

    @Override
    public double calculateTotal(List<CartItem> cart) {
        double total = 0;
        for (CartItem item : cart) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

    // ORDER
    @Override
    public int placeOrder(User user, List<CartItem> cart) {

        double total = calculateTotal(cart);
        Order order = new Order(user.getUserId(), total);

        return orderDAO.createOrder(order, cart);
    }

    @Override
    public void savePayment(Payment payment) {
        orderDAO.savePayment(payment);
    }

}