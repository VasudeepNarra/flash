package com.synechron.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="USER_TBL")
public class User {
	
	@Id
	private int id;
	private String userName;
	private String password;
	private String email;
	
}
