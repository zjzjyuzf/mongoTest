package com.yuzf.mongo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoFactoryBean;
//import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
//import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories(basePackages = "com.yuzf.mongo.db") //启动mongodb的repository功能   
public class MongoConfig/* extends AbstractMongoConfiguration*/{

	/**
	 * 两个@Bean与extends是一样的,重写的方法是自动隐式创建的
	 */
	
	@Bean
	public MongoFactoryBean mongo() {
		MongoFactoryBean mongoClientFactoryBean = new MongoFactoryBean();
		mongoClientFactoryBean.setHost("localhost");
		return mongoClientFactoryBean;
	}
	
	@Bean
	public MongoOperations mongoTemplate(Mongo mongo) {
		return new MongoTemplate(mongo,"ordersDB");
	}

	/*@Override
	public MongoClient mongoClient() {
		// TODO Auto-generated method stub
		return new MongoClient();
	}*/

	/*@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return "OrdersDB";
	}

	@Override
	public Mongo mongo() throws Exception {
		// TODO Auto-generated method stub
		return new Mongo();
	}*/
	
}
