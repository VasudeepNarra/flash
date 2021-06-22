package com.example.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "products")
public class Product {

	@Id
	private int productId;
	private String productName;
	private int productCost;	

}
