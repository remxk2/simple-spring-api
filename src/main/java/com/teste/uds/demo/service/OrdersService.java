package com.teste.uds.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.uds.demo.domain.dto.OrdersPersistDTO;
import com.teste.uds.demo.domain.entity.Order;
import com.teste.uds.demo.repository.OrdersRepository;

@Service
public class OrdersService {
	
	@Autowired
	private OrdersRepository ordersRepository;
	
	public void save(OrdersPersistDTO dto) {
		Order order = new Order(dto.getSize(), dto.getFlavor(), dto.getAdditionals());
		ordersRepository.save(order);
	}
}
