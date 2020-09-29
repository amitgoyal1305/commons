package com.orderitems.service;

import java.util.List;

import com.orderitems.entiry.Order;
import com.orderitems.exception.OrderNotFoundException;

public interface OrderService {
	
	public Order getOredrById(Integer id) throws OrderNotFoundException;
	
	public List<Order> getOrders();
	
	public void createOrder(Order order) throws OrderNotFoundException ;

}
