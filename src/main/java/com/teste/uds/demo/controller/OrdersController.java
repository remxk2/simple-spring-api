package com.teste.uds.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.teste.uds.demo.domain.dto.OrdersPersistDTO;
import com.teste.uds.demo.service.OrdersService;

@RestController
@RequestMapping("api/orders")
public class OrdersController {
	
	@Autowired
	private OrdersService ordersService;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void saveORder(@Valid @RequestBody OrdersPersistDTO dto) {
		ordersService.save(dto);
	}

}
