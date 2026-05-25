package com.shop.dao;

import java.util.List;

import com.shop.model.CartItem;
import com.shop.model.Order;
import com.shop.model.Payment;

public interface OrderDao 
{
	public int createOrder(Order order, List<CartItem> cart);
	public void savePayment(Payment payment);
}
