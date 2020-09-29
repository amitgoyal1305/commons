package com.orderitems.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orderitems.entiry.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
	
	public Optional<Order> findById(Integer id);

}
