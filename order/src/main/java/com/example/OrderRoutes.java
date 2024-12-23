package com.example;

import com.example.commands.CreateCommand;
import com.example.queries.GetAllQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderRoutes {

    private GetAllQuery getAllQuery;
    private CreateCommand createCommand;

    @Autowired
    public OrderRoutes(GetAllQuery getAllQuery, CreateCommand createCommand) {
        this.getAllQuery = getAllQuery;
        this.createCommand = createCommand;
    }

    @GetMapping("/")
    public List<OrderEntity> getAllOrders() {
        return getAllQuery.run();
    }

    @PostMapping("/")
    public void createOrder(@RequestBody OrderDTO orderDTO) {
        createCommand.run(orderDTO);
    }

    @GetMapping("/helloworld")
    public String HelloWorld() {
        return "Hello World";
    }
}
