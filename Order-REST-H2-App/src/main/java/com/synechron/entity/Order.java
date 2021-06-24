package com.synechron.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Entity
@Table(name = "ORDER_DTLS")
@Data
@XmlRootElement
public class Order {

	@Id
	@GeneratedValue
	private Integer orderId;
	private String orderName;
	private Integer orderPrice;
	
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public Integer getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(Integer orderPrice) {
		this.orderPrice = orderPrice;
	}
	
	

}
