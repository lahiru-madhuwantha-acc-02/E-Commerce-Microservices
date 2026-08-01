package com.sl2r.productservice.controller;

import com.sl2r.productservice.dto.ProductResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @GetMapping("/{id}")
    public ProductResponse getProductById(@PathVariable Long id) {
        // Dummy data එකක් return කරමු
        return new ProductResponse(id, "Laptop", 250000.00);
    }
}
