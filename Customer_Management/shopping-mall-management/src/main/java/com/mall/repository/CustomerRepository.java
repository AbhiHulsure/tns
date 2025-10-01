package com.mall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mall.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
