package com.shop.dao.impl;

import java.sql.*;
import java.util.List;

import com.shop.dao.OrderDao;
import com.shop.model.*;
import com.shop.util.DBConnection;

public class OrderDaoImpl implements OrderDao {

    @Override
    public int createOrder(Order order, List<CartItem> cart) {

        int orderId = 0;

        try {
            Connection con = DBConnection.getConnection();

            // 🔹 STEP 1: Insert into orders table
            String orderSql = "INSERT INTO orders(user_id, total_amount) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(orderSql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, order.getUserId());
            ps.setDouble(2, order.getTotalAmount());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                orderId = rs.getInt(1);
            }

            // 🔹 STEP 2: Insert into order_items
            String itemSql = "INSERT INTO order_items(order_id, product_id, quantity, price) VALUES (?, ?, ?, ?)";
            PreparedStatement psItem = con.prepareStatement(itemSql);

            for (CartItem item : cart) {
                psItem.setInt(1, orderId);
                psItem.setInt(2, item.getProductId());
                psItem.setInt(3, item.getQuantity());
                psItem.setDouble(4, item.getPrice());

                psItem.executeUpdate();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return orderId;
    }

    @Override
    public void savePayment(Payment payment) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO payments(order_id, card_name, card_number, expiry, cvv) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, payment.getOrderId());
            ps.setString(2, payment.getCardName());
            ps.setString(3, payment.getCardNumber());
            ps.setString(4, payment.getExpiry());
            ps.setString(5, payment.getCvv());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}