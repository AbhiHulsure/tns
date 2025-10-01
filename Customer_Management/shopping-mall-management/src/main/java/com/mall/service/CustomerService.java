package com.mall.service;

import com.mall.entity.Customer;
import com.mall.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository repo;

    public CustomerService(CustomerRepository repo) {
        this.repo = repo;
    }

    public List<Customer> getAllCustomers() {
        return repo.findAll();
    }

    public Customer addCustomer(Customer customer) {
        return repo.save(customer);
    }

    public Customer updateCustomer(Long id, Customer updatedCustomer) {
        return repo.findById(id).map(c -> {
            c.setName(updatedCustomer.getName());
            c.setEmail(updatedCustomer.getEmail());
            c.setPhone(updatedCustomer.getPhone());
            c.setMembershipType(updatedCustomer.getMembershipType());
            c.setLoyaltyPoints(updatedCustomer.getLoyaltyPoints());
            return repo.save(c);
        }).orElseThrow(() -> new RuntimeException("Customer not found"));
    }

    public void deleteCustomer(Long id) {
        repo.deleteById(id);
    }
}
