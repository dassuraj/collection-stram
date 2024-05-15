package com.codewithsuraj.service.serviceImpl;

import com.codewithsuraj.model.Order;
import com.codewithsuraj.repository.OrderRepository;
import com.codewithsuraj.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Override
    public List<Order> getAllOrder() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(long id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public void saveOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public Order updateOrder(Order order, long id) {
        boolean isExist=orderRepository.existsById(id);
        if (isExist){
            Order order1=orderRepository.findById(id).get();
            order1.setOrderDate(order.getOrderDate());
            return orderRepository.save(order1);
        }
        return null;
    }

    @Override
    public void deleteOrder(long id) {

    }
}
