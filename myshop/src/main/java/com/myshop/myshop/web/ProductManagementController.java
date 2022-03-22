package com.myshop.myshop.web;

import com.myshop.myshop.model.Product;
import com.myshop.myshop.service.CustomerService;
import com.myshop.myshop.service.ProductService;
import com.myshop.myshop.web.dto.ProductDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.CREATED;

/**
 * @author Nyiko Ngobeni
 * @since 03-2022
 */

@RestController
@RequestMapping("api/products")
public class ProductManagementController {

    private ProductService productService;

    public ProductManagementController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> get(@PathVariable Long id) throws Exception {
        Optional<Product> productResponse = productService.findById(id);
        return new ResponseEntity(productResponse, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<Product> getAll() throws Exception {
        List<Product> productResponse = productService.findAll();
        return new ResponseEntity(productResponse, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Product> add(@Valid @RequestBody ProductDto productdto) {
        productService.save(productdto);
        return new ResponseEntity(CREATED);
    }


}
