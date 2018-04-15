package com.yuzf.mongo.db;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Order {

	@Id
	private Integer id;
	
	private String username;
	
	private String password;
	
	
}
