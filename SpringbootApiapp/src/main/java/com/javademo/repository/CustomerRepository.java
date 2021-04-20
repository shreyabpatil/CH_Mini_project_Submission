package com.javademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.javademo.model.Customer;

@Repository

public interface CustomerRepository extends JpaRepository<Customer,Long>{

}



