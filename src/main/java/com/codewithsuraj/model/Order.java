package com.codewithsuraj.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customerOrder")
public class Order {
    @Id
    private long id;
    @Column(name = "order_date")
    private String orderDate;
    @ManyToOne
    @JoinColumn(name = "cus_id")
    private Customer customer;
    @OneToMany(mappedBy = "ord")
    private List<Product> products;
}
