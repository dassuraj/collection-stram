package com.codewithsuraj.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "phoneNumber")
    private long phoneNumber;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;
    @OneToMany(mappedBy = "customer")
    private List<Order> orders;


}
