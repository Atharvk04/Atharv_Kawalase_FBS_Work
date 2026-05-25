package com.shop.dao.impl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.shop.dao.UserDao;
import com.shop.model.User;
import com.shop.util.DBConnection;

public class UserDaoImpl implements UserDao {

    @Override
    public boolean registerUser(User user) {
        boolean status = false;

        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO users(name, email, password, role) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getRole());

            status = ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    @Override
    public User login(String email, String password) {
        User user = null;

        try {
            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM users WHERE email=? AND password=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                user = new User();
                user.setUserId(rs.getInt("user_id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setRole(rs.getString("role"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }

    @Override
    public List<User> getAllUsers() 
    {
        List<User> list = new ArrayList<>();
         
        try
        {
            Connection con = DBConnection.getConnection();
            String query = "SELECT * FROM users";
             
            PreparedStatement ps = con.prepareStatement(query);
             
            ResultSet rs = ps.executeQuery();
             
            while (rs.next()) {
                User u = new User();

                u.setUserId(rs.getInt("user_id"));
                u.setName(rs.getString("name"));
                u.setEmail(rs.getString("email"));
                u.setPassword(rs.getString("password"));
                u.setRole(rs.getString("role"));   // FIX: role set karna bhool gaye tha — ab fix hai

                list.add(u);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
         
        return list;
    }
}