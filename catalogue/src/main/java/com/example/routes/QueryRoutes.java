package com.example.routes;

import com.example.DTO.ProductDTO;
import com.example.domain.Product;
import com.example.queries.GetAllProductQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class QueryRoutes {

    private GetAllProductQuery getAllProductQuery;

    @Autowired
    public QueryRoutes(GetAllProductQuery gapq) {
        this.getAllProductQuery = gapq;
    }

    public List<ProductDTO> getAllProducts() {
        return getAllProductQuery.run();
    }
}
