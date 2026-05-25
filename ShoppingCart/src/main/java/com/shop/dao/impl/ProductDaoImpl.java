package com.shop.dao.impl;

import java.sql.*;
import java.util.*;

import com.shop.dao.ProductDao;
import com.shop.model.Product;
import com.shop.util.DBConnection;

public class ProductDaoImpl implements ProductDao {

    @Override
    public boolean addProduct(Product p) {
        boolean status = false;

        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO products(name, description, price, category, quantity, image) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, p.getName());
            ps.setString(2, p.getDescription());
            ps.setDouble(3, p.getPrice());
            ps.setString(4, p.getCategory());
            ps.setInt(5, p.getQuantity());
            ps.setString(6, p.getImage());

            status = ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> list = new ArrayList<>();

        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM products";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Product p = new Product();
                p.setProductId(rs.getInt("product_id"));
                p.setName(rs.getString("name"));
                p.setDescription(rs.getString("description"));
                p.setPrice(rs.getDouble("price"));
                p.setCategory(rs.getString("category"));
                p.setQuantity(rs.getInt("quantity"));
                p.setImage(rs.getString("image"));
                list.add(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public Product getProductById(int id) {
        Product p = null;

        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM products WHERE product_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                p = new Product();
                p.setProductId(rs.getInt("product_id"));
                p.setName(rs.getString("name"));
                p.setDescription(rs.getString("description"));
                p.setPrice(rs.getDouble("price"));
                p.setCategory(rs.getString("category"));
                p.setQuantity(rs.getInt("quantity"));
                p.setImage(rs.getString("image"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return p;
    }

    @Override
    public boolean updateProduct(Product p) {
        boolean status = false;

        try {
            Connection con = DBConnection.getConnection();
            String query = "UPDATE products SET name=?, description=?, price=?, category=?, quantity=?, image=? WHERE product_id=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, p.getName());
            ps.setString(2, p.getDescription());
            ps.setDouble(3, p.getPrice());
            ps.setString(4, p.getCategory());
            ps.setInt(5, p.getQuantity());
            ps.setString(6, p.getImage());
            ps.setInt(7, p.getProductId());

            status = ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    @Override
    public boolean deleteProduct(int id) {
        boolean status = false;

        try {
            Connection con = DBConnection.getConnection();
            String query = "DELETE FROM products WHERE product_id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            status = ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }
}