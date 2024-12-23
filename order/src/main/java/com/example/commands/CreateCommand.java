package com.example.commands;

import com.example.OrderDTO;
import com.example.OrderEntity;
import com.example.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateCommand {

    private OrderRepository orderRepository;

    @Autowired
    public CreateCommand(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void run(OrderDTO orderDTO) {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setName(orderDTO.getName());
        orderEntity.setQuantity(orderDTO.getQuantity());
        orderEntity.setAmount(orderDTO.getAmount());
        orderEntity.setStatus(orderDTO.getStatus());
        orderRepository.save(orderEntity);
    }
}
