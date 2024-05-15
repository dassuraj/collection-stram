package com.codewithsuraj.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    @Id
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private String price;
    @Column(name = "category")
    private String category;
    @Column(name = "sub_category")
    private String subCategory;
    @Column(name = "quantity")
    private String quantity;
    @Column(name = "manufacture_date")
    private String manufactureDate;
    @Column(name = "expiry_date")
    private String expiryDate;
    @ManyToOne
    private Order ord;


}
