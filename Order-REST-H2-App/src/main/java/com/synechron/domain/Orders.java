package com.synechron.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.synechron.entity.Order;

import lombok.Data;

@XmlRootElement
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Orders {

	@XmlElement(name = "order")
	@JsonProperty("order")
	private List<Order> orders;

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	
}
