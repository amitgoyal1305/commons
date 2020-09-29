package com.orderitems.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderitems.entiry.Order;
import com.orderitems.exception.OrderNotFoundException;
import com.orderitems.repository.OrderRepository;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	

	public Order getOredrById(Integer id) throws OrderNotFoundException {
			return orderRepository.findAll().stream()
					.filter(o->o.getId().equals(id))
					.findAny().orElse(null);
	}

	public List<Order> getOrders() {
			return orderRepository.findAll();
	}

	public void createOrder(Order order) throws OrderNotFoundException {
		orderRepository.save(order);
	}

}
