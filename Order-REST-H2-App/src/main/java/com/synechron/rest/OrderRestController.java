package com.synechron.rest;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.synechron.domain.Orders;
import com.synechron.entity.Order;
import com.synechron.exception.NoDataFoundException;
import com.synechron.repository.OrderRepository;

@RestController
public class OrderRestController {

	@Autowired
	private OrderRepository orderRepo;

	@PostMapping(value = "/add", consumes = { "application/xml", "application/json" })
	public ResponseEntity<String> addOrder(@RequestBody Order order) {
		Order savedEntity = orderRepo.save(order);
		String response = "Order Saved With ID as : " + savedEntity.getOrderId();
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

	@GetMapping(value = "/get/{orderid}", produces = { "application/xml", "application/json" })
	public ResponseEntity<Order> getOrder(@PathVariable("orderid") Integer orderId) {
		Order order = null;
		Optional<Order> findById = orderRepo.findById(orderId);
		if (findById.isPresent()) {
			order = findById.get();
		} else {
			throw new NoDataFoundException("Invalid Student ID");
		}
		return new ResponseEntity<>(order, HttpStatus.OK);
	}

	@GetMapping(value = "/orders", produces = { "application/xml", "application/json" })
	public ResponseEntity<Orders> getOrders() {
		List<Order> ordersList = orderRepo.findAll();
		Orders orders = new Orders();
		orders.setOrders(ordersList);
		return new ResponseEntity<>(orders, HttpStatus.OK);
	}

	@PutMapping(value = "/update", consumes = { "application/json", "application/xml" })
	public ResponseEntity<String> updateStudent(@RequestBody Order order) {
		orderRepo.save(order);
		String msg = "Record Updated Successfully..!!";
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

	@DeleteMapping(value = "/delete/{orderid}")
	public ResponseEntity<String> deleteStudent(@PathVariable("orderid") Integer orderid) {
		orderRepo.deleteById(orderid);
		String msg = "Record Deleted With Order ID : " + orderid;
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
}
