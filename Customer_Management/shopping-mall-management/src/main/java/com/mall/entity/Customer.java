package com.mall.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long custId;

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Invalid email")
    @Column(unique = true, nullable = false)
    private String email;

    @NotBlank(message = "Phone is required")
    private String phone;

    private String membershipType = "Regular";
    private int loyaltyPoints = 0;

    // Getters and Setters
    public Long getCustId() { return custId; }
    public void setCustId(Long custId) { this.custId = custId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getMembershipType() { return membershipType; }
    public void setMembershipType(String membershipType) { this.membershipType = membershipType; }

    public int getLoyaltyPoints() { return loyaltyPoints; }
    public void setLoyaltyPoints(int loyaltyPoints) { this.loyaltyPoints = loyaltyPoints; }
}
