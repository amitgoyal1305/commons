package com.orderitems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orderitems.entiry.OrderItem;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
	
	
	public OrderItem findByIdOrProductNameOrProductCode(Integer id,String productName, String productCode);
	

}
