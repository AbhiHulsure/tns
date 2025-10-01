package com.mall.controller;

import com.mall.entity.Customer;
import com.mall.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    // Get all customers
    @GetMapping
    public List<Customer> getAllCustomers() {
        return service.getAllCustomers();
    }

    // Add a new customer
    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return service.addCustomer(customer);
    }

    // Update an existing customer
    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable("id") Long id,
                                   @RequestBody Customer customer) {
        return service.updateCustomer(id, customer);
    }

    // Delete a customer
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") Long id) {
        service.deleteCustomer(id);
    }
}
