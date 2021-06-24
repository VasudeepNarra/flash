package com.synechron.repository;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;

import com.synechron.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Serializable> {

}
