
package com.javademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import com.javademo.model.Customer;
import com.javademo.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import com.javademo.SpringbootApiappApplication;

@SpringBootApplication

public class SpringbootApiappApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApiappApplication.class, args);
	}
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public void run(String... args) throws Exception{
		this.customerRepository.save(new Customer("Shreya Patil","shreyabpatil1998@gmail.com","India"));
		this.customerRepository.save(new Customer("Marry John","marry.john@gmail.com","USA"));
		this.customerRepository.save(new Customer("Tom Smith","tomsmith@gmail.com","England"));
		this.customerRepository.save(new Customer("Siva Krishna","sivakrishna78@gmail.com","India"));
		this.customerRepository.save(new Customer("John Purcell","john123@gmail.com","Australia"));




}
}



