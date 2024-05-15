package com.codewithsuraj.service;

import com.codewithsuraj.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    List<Order> getAllOrder();
    Order getOrderById(long id);
    void saveOrder(Order order);
    Order updateOrder(Order order, long id);
    void  deleteOrder(long id);
}
