package com.teste.uds.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.uds.demo.domain.entity.Order;

public interface OrdersRepository extends JpaRepository<Order, Long> {

}
