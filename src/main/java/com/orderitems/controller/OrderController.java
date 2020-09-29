package com.orderitems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.orderitems.entiry.Order;
import com.orderitems.service.OrderService;

@RestController
public class OrderController {


	@Autowired
	OrderService orderService;

	@GetMapping("/order/{id}")
	public Order getOredrById(@PathVariable("id") Integer id)  {
		return orderService.getOredrById(id);
	}

	@GetMapping("/orders")
	public List<Order> getOrders() {
		return orderService.getOrders();
	}

	@PostMapping("/order/place")
	public ResponseEntity<Object> createOrder(@RequestBody Order order) {
		orderService.createOrder(order);
		return ResponseEntity.noContent().build();
	}

}
