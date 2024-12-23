package com.example.queries;

import com.example.OrderEntity;
import com.example.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetAllQuery {

    private OrderRepository orderRepository;

    @Autowired
    public GetAllQuery(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<OrderEntity> run() {
        return orderRepository.getAll();
    }
}
