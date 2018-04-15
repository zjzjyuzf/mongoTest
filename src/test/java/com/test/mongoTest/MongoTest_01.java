package com.test.mongoTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yuzf.mongo.config.MongoConfig;
import com.yuzf.mongo.db.Order;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=MongoConfig.class)
public class MongoTest_01 {
	
	@Autowired/*(required = false)*/
	MongoOperations mongoOperations;
	
	@Test
	public void save() {
		
		Order order = new Order();
		order.setId(12);
		order.setUsername("james");
		order.setPassword("qwer");
		mongoOperations.save(order,"order");
		System.out.println("123456");
	}
}
